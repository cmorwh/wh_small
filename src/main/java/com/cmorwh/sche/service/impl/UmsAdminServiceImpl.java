package com.cmorwh.sche.service.impl;

import com.cmorwh.sche.bean.UmsAdmin;
import com.cmorwh.sche.bean.UmsAdminPermissionRelation;
import com.cmorwh.sche.bean.UmsPermission;
import com.cmorwh.sche.common.CommonResult;
import com.cmorwh.sche.mapper.UmsAdminMapper;
import com.cmorwh.sche.mapper.UmsAdminPermissionRelationMapper;
import com.cmorwh.sche.mapper.UmsAdminRoleRelationMapper;
import com.cmorwh.sche.mapper.UmsPermissionMapper;
import com.cmorwh.sche.service.UmsAdminService;
import com.cmorwh.sche.utils.JwtTokenUtil;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created on 2020/8/25 15:21 with IDEA
 * author: wh
 * Description:
 */
@Service
public class UmsAdminServiceImpl implements UmsAdminService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UmsAdminServiceImpl.class);

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    UmsAdminMapper adminMapper;
    @Autowired
    UserDetailsService userDetailsService;
    @Autowired
    UmsPermissionMapper umsPermissionMapper;
    @Autowired
    UmsAdminRoleRelationMapper adminRoleRelationMapper;

    @Autowired
    JwtTokenUtil jwtTokenUtil;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @Override
    public UmsAdmin getAdminByUsername(String username) {
        List<UmsAdmin> umsAdmins = adminMapper.selectByUserName(username);
        if(umsAdmins.size()!=0){
            return umsAdmins.get(0);
        }
        return null;
    }

    @Override
    public UmsAdmin register(UmsAdmin umsAdminParam) {
        UmsAdmin umsAdmin = new UmsAdmin();
        BeanUtils.copyProperties(umsAdminParam, umsAdmin);
        umsAdmin.setCreateTime(new Date());
        umsAdmin.setStatus(1);
        //查询是否有相同用户名的用户
       /* UmsAdminExample example = new UmsAdminExample();
        example.createCriteria().andUsernameEqualTo(umsAdmin.getUsername());
        List<UmsAdmin> umsAdminList = adminMapper.selectByExample(example);
        if (umsAdminList.size() > 0) {
            return null;
        }*/
        String username = umsAdmin.getUsername();
        List<UmsAdmin> umsAdmins = adminMapper.selectByUserName(username);
        if (umsAdmins.size()>0){
            return null;
        }
        String encodePassword = passwordEncoder.encode(umsAdmin.getPassword());
        umsAdmin.setPassword(encodePassword);
        adminMapper.insert(umsAdmin);
        return umsAdmin;
    }


    @Override
    public String login(String username, String password) {
        String token = null;
        try {
            //对密码进行加密
            //String enCoderPassword = passwordEncoder.encode(password);
            UserDetails userDetails = userDetailsService.loadUserByUsername(username);
            LOGGER.debug("登录信息:{}",userDetails.toString());
            if(!passwordEncoder.matches(password,userDetails.getPassword())){
                throw new BadCredentialsException("密码不正确");
            }
            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);
            token = jwtTokenUtil.generateToken(userDetails);
        } catch (AuthenticationException e) {
            LOGGER.warn("登录异常:{}", e.getMessage());
        }
        return token;
    }

    @Override
    public List<UmsPermission> getPermissionList(Long id) {
       /* List<UmsPermission> permissions = new ArrayList<>();
        List<UmsAdminPermissionRelation>   relations = adminPermissionRelationMapper.selectByAdminId(id);
        for (UmsAdminPermissionRelation adminPermission:relations) {
            UmsPermission umsPermission = umsPermissionMapper.selectByPrimaryKey(adminPermission.getPermissionId());
            permissions.add(umsPermission);
        }
        return permissions;*/
        List<UmsPermission> permissionByAdminId = adminRoleRelationMapper.getPermissionByAdminId(id);
        return permissionByAdminId;

    }
}
