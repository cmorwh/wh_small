package com.cmorwh.sche.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

/**
 * Created on 2020/8/24 17:47 with IDEA
 * author: wh
 * Description: 
 */
/**
    * 后台用户和角色关系表
    */
@ApiModel(value="com-cmorwh-sche-bean-UmsAdminRoleRelation")
@Data
public class UmsAdminRoleRelation implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long adminId;

    @ApiModelProperty(value="")
    private Long roleId;

    private static final long serialVersionUID = 1L;
}