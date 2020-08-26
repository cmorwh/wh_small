package com.cmorwh.sche.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * Created on 2020/8/24 17:46 with IDEA
 * author: wh
 * Description: 
 */
/**
    * 后台用户表
    */
@ApiModel(value="com-cmorwh-sche-bean-UmsAdmin")
@Data
public class UmsAdmin implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private String username;

    @ApiModelProperty(value="")
    private String password;

    /**
    * 头像
    */
    @ApiModelProperty(value="头像")
    private String icon;

    /**
    * 邮箱
    */
    @ApiModelProperty(value="邮箱")
    private String email;

    /**
    * 昵称
    */
    @ApiModelProperty(value="昵称")
    private String nickName;

    /**
    * 备注信息
    */
    @ApiModelProperty(value="备注信息")
    private String note;

    /**
    * 创建时间
    */
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
    * 最后登录时间
    */
    @ApiModelProperty(value="最后登录时间")
    private Date loginTime;

    /**
    * 帐号启用状态：0->禁用；1->启用
    */
    @ApiModelProperty(value="帐号启用状态：0->禁用；1->启用")
    private Integer status;

    private static final long serialVersionUID = 1L;
}