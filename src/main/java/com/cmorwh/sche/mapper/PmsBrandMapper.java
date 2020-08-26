package com.cmorwh.sche.mapper;

import com.cmorwh.sche.bean.PmsBrand;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by wangheng on 2020/8/20 16:04
 */
@Mapper
public interface PmsBrandMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsBrand record);

    int insertSelective(PmsBrand record);

    PmsBrand selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsBrand record);

    int updateByPrimaryKey(PmsBrand record);

    List<PmsBrand> getListBrand();
}