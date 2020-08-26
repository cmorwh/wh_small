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
    * 后台用户角色表
    */
@ApiModel(value="com-cmorwh-sche-bean-UmsRole")
@Data
public class UmsRole implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    /**
    * 名称
    */
    @ApiModelProperty(value="名称")
    private String name;

    /**
    * 描述
    */
    @ApiModelProperty(value="描述")
    private String description;

    /**
    * 后台用户数量
    */
    @ApiModelProperty(value="后台用户数量")
    private Integer adminCount;

    /**
    * 创建时间
    */
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
    * 启用状态：0->禁用；1->启用
    */
    @ApiModelProperty(value="启用状态：0->禁用；1->启用")
    private Integer status;

    @ApiModelProperty(value="")
    private Integer sort;

    private static final long serialVersionUID = 1L;
}