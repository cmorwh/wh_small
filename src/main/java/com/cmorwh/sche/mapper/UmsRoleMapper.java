package com.cmorwh.sche.mapper;

import com.cmorwh.sche.bean.UmsRole;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created on 2020/8/24 17:46 with IDEA
 * author: wh
 * Description: 
 */
@Mapper
public interface UmsRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsRole record);

    int insertSelective(UmsRole record);

    UmsRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsRole record);

    int updateByPrimaryKey(UmsRole record);
}