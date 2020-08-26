package com.cmorwh.sche.service.impl;

import com.cmorwh.sche.common.CommonResult;
import com.cmorwh.sche.service.RedisService;
import com.cmorwh.sche.service.UserMemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Random;

/**
 * Created on 2020/8/24 14:19 with IDEA
 * author: wh
 * Description:
 */
@Service
@Slf4j
public class UserMemberServiceImpl implements UserMemberService {

    @Autowired
    RedisService redisService;

    @Value("${redis.key.prefix.authCode}")
    private  String keyPrefix ;
    @Value("${redis.key.expire.authCode}")
    private long keyExpire;

    @Override
    public CommonResult getAuthCode(String telPhone) {
        StringBuilder strBuilder = new StringBuilder();
        Random random = new Random();
        for(int i=0;i<6;i++){
            strBuilder.append(random.nextInt(10));
        }
        //绑定手机号存储验证码
        log.info("前缀={}",keyPrefix);
         redisService.set(keyPrefix+telPhone,strBuilder.toString(),keyExpire);
         //redisService.expire(keyPrefix+telPhone,keyExpire);
         return CommonResult.success(strBuilder.toString(),"获取验证码成功");
    }

    @Override
    public CommonResult verifyCode(String telPhone,String code) {
        if(StringUtils.isEmpty(code)){
            return CommonResult.faild("验证码不能为空。");
        }
        String realCode = redisService.get(keyPrefix + telPhone);
        if(code.equals(realCode)){
            return CommonResult.success("1","验证码输入正确。");
        }else{
            return CommonResult.faild("-1","验证码不正确。");
        }
    }
}
