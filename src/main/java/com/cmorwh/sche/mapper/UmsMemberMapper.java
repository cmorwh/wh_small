package com.cmorwh.sche.mapper;

import com.cmorwh.sche.bean.UmsMember;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created on 2020/8/24 13:59 with IDEA
 * author: wh
 * Description: 
 */
@Mapper
public interface UmsMemberMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMember record);

    int insertSelective(UmsMember record);

    UmsMember selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMember record);

    int updateByPrimaryKey(UmsMember record);
}