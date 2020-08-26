package com.cmorwh.sche.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

/**
 * Created on 2020/8/24 17:46 with IDEA
 * author: wh
 * Description: 
 */
/**
    * 后台用户角色和权限关系表
    */
@ApiModel(value="com-cmorwh-sche-bean-UmsRolePermissionRelation")
@Data
public class UmsRolePermissionRelation implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long roleId;

    @ApiModelProperty(value="")
    private Long permissionId;

    private static final long serialVersionUID = 1L;
}