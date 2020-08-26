package com.cmorwh.sche.controller;

import com.cmorwh.sche.common.CommonResult;
import com.cmorwh.sche.service.UserMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2020/8/24 14:08 with IDEA
 * author: wh
 * Description:
 */
@Slf4j
@RequestMapping("userMember")
@RestController
@Api(value = "用户登陆验证码")
public class UserMemmberController {

    @Autowired
    UserMemberService memmberService;

    @ApiOperation("获取登陆验证码")
    @RequestMapping(value = "/getAuthCode",method = RequestMethod.GET)
    public CommonResult getAuthCode(@ApiParam(value = "手机号") @RequestParam String telPhone){
        return memmberService.getAuthCode(telPhone);
    }

    @ApiOperation("校验验证码")
    @RequestMapping(value = "/verifyCode",method = RequestMethod.GET)
    public CommonResult verifyCode(@ApiParam(value = "手机号") @RequestParam String telPhone,
                                   @ApiParam(value = "验证码") @RequestParam String code){
        return memmberService.verifyCode(telPhone,code);
    }
}
