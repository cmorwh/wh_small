package com.cmorwh.sche.service.impl;

import com.cmorwh.sche.bean.PmsBrand;
import com.cmorwh.sche.mapper.PmsBrandMapper;
import com.cmorwh.sche.service.PmBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wangheng on 2020/8/20 16:49
 */
@Service
public class PmBrandServiceImpl implements PmBrandService {
    @Autowired
    PmsBrandMapper pmsBrandMapper;


    @Override
    public List<PmsBrand> getAllBrand() {
        List<PmsBrand> listBrand = pmsBrandMapper.getListBrand();
        return listBrand;
    }
}
