package com.cmorwh.sche.mapper;

import com.cmorwh.sche.bean.UmsRolePermissionRelation;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created on 2020/8/24 17:46 with IDEA
 * author: wh
 * Description: 
 */
@Mapper
public interface UmsRolePermissionRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsRolePermissionRelation record);

    int insertSelective(UmsRolePermissionRelation record);

    UmsRolePermissionRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsRolePermissionRelation record);

    int updateByPrimaryKey(UmsRolePermissionRelation record);
}