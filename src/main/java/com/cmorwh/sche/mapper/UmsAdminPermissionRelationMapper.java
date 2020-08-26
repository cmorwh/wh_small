package com.cmorwh.sche.mapper;

import com.cmorwh.sche.bean.UmsAdminPermissionRelation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created on 2020/8/24 17:47 with IDEA
 * author: wh
 * Description: 
 */
@Mapper
public interface UmsAdminPermissionRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsAdminPermissionRelation record);

    int insertSelective(UmsAdminPermissionRelation record);

    UmsAdminPermissionRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsAdminPermissionRelation record);

    int updateByPrimaryKey(UmsAdminPermissionRelation record);

    List<UmsAdminPermissionRelation> selectByAdminId(Long id);
}