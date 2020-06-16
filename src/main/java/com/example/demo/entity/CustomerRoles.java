package com.example.demo.entity;

import java.io.Serializable;

/**
 * (CustomerRoles)实体类
 *
 * @author makejava
 * @since 2020-06-16 10:07:15
 */
public class CustomerRoles implements Serializable {
    private static final long serialVersionUID = -23778587869952857L;
    /**
    * 顾客ID
    */
    private Integer customerId;
    /**
    * 角色ID
    */
    private Integer roleId;


    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "CustomerRoles{" +
                "customerId=" + customerId +
                ", roleId=" + roleId +
                '}';
    }
}