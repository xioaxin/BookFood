package com.example.demo.entity;

import java.io.Serializable;

/**
 * (Roles)实体类
 *
 * @author makejava
 * @since 2020-06-16 10:06:47
 */
public class Roles implements Serializable {
    private static final long serialVersionUID = -18288614730387327L;
    /**
    * 角色名称ID

    */
    private Integer id;
    /**
    * 角色名称
    */
    private String roleName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

}