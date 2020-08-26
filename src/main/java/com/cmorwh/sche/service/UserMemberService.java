package com.cmorwh.sche.service;

import com.cmorwh.sche.common.CommonResult;

/**
 * Created on 2020/8/24 14:13 with IDEA
 * author: wh
 * Description:
 */
public interface UserMemberService {


    CommonResult getAuthCode(String telPhone);

    CommonResult verifyCode(String telPhone,String code);
}
