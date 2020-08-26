package com.cmorwh.sche.mapper;

import com.cmorwh.sche.bean.UmsPermission;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created on 2020/8/24 17:48 with IDEA
 * author: wh
 * Description: 
 */
@Mapper
public interface UmsPermissionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsPermission record);

    int insertSelective(UmsPermission record);

    UmsPermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsPermission record);

    int updateByPrimaryKey(UmsPermission record);

    /*List<UmsPermission> selectByPermissionId(Long permissionId);*/
}