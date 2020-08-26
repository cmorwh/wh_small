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
    * 后台用户和权限关系表(除角色中定义的权限以外的加减权限)
    */
@ApiModel(value="com-cmorwh-sche-bean-UmsAdminPermissionRelation")
@Data
public class UmsAdminPermissionRelation implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    @ApiModelProperty(value="")
    private Long adminId;

    @ApiModelProperty(value="")
    private Long permissionId;

    @ApiModelProperty(value="")
    private Integer type;

    private static final long serialVersionUID = 1L;
}