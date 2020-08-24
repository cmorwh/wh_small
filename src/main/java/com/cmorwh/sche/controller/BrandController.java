package com.cmorwh.sche.controller;

import com.cmorwh.sche.bean.PmsBrand;
import com.cmorwh.sche.common.CommonResult;
import com.cmorwh.sche.service.PmBrandService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by wangheng on 2020/8/20 16:16
 */
@RestController
@RequestMapping(value = "brand")
@Api(value = "查询品牌")
public class BrandController {

    @Autowired
    PmBrandService pmBrandService;

    @ApiOperation(value = "获取品牌全部数据")
    @RequestMapping(value = "getList",method = RequestMethod.GET)
    public CommonResult<List<PmsBrand>>  getAllBrand(){
        List<PmsBrand> allBrand = pmBrandService.getAllBrand();
        return CommonResult.success(allBrand);
    }

}
