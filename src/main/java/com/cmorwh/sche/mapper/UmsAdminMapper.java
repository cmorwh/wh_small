package com.cmorwh.sche.mapper;

import com.cmorwh.sche.bean.UmsAdmin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created on 2020/8/24 17:46 with IDEA
 * author: wh
 * Description: 
 */
@Mapper
public interface UmsAdminMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsAdmin record);

    int insertSelective(UmsAdmin record);

    UmsAdmin selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsAdmin record);

    int updateByPrimaryKey(UmsAdmin record);

    List<UmsAdmin> selectByUserName(String username);
}