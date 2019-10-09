package com.qf.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by 54110 on 2019-09-19.
 */
@Data
public class SysPermission implements Serializable {
    private Integer permissionId;

    private String perName;

    private String menuName;


    public SysPermission(Integer permissionId, String perName, String menuName, String menuType, String menuUrl, String menuCode, String parentCode, String perDesc, Byte ifVilid) {
        this.permissionId = permissionId;
        this.perName = perName;
        this.menuName = menuName;

    }
}
