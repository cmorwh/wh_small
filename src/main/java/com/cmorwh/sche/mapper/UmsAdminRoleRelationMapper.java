package com.cmorwh.sche.mapper;

import com.cmorwh.sche.bean.UmsAdminRoleRelation;
import com.cmorwh.sche.bean.UmsPermission;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created on 2020/8/24 17:47 with IDEA
 * author: wh
 * Description: 
 */
@Mapper
public interface UmsAdminRoleRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsAdminRoleRelation record);

    int insertSelective(UmsAdminRoleRelation record);

    UmsAdminRoleRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsAdminRoleRelation record);

    int updateByPrimaryKey(UmsAdminRoleRelation record);

    List<UmsPermission> getPermissionByAdminId(Long id);
}