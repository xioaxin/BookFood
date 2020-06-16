package com.example.demo.entity;

import java.io.Serializable;

/**
 * 顾客表(Customer)实体类
 *
 * @author makejava
 * @since 2020-06-16 09:40:00
 */
public class Customer implements Serializable {
    private static final long serialVersionUID = -24957996648920561L;
    /**
     * 顾客ID
     */
    private Integer customerid;

    @Override
    public String toString() {
        return "Customer{" +
                "customerid=" + customerid +
                ", customerusername='" + customerusername + '\'' +
                ", customername='" + customername + '\'' +
                ", password='" + password + '\'' +
                ", customerregisteraddress='" + customerregisteraddress + '\'' +
                ", customerphone='" + customerphone + '\'' +
                ", customeremail='" + customeremail + '\'' +
                '}';
    }

    /**
     * 顾客用户名
     */
    private String customerusername;
    /**
     * 顾客姓名
     */
    private String customername;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 顾客密码
     */
    private String password;
    /**
     * 顾客信息注册地址
     */
    private String customerregisteraddress;
    /**
     * 顾客电话号码
     */
    private String customerphone;
    /**
     * 顾客邮箱
     */
    private String customeremail;
    /**
     * 选择角色
     */
    private String select;

    public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public String getCustomerusername() {
        return customerusername;
    }

    public void setCustomerusername(String customerusername) {
        this.customerusername = customerusername;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getCustomerregisteraddress() {
        return customerregisteraddress;
    }

    public void setCustomerregisteraddress(String customerregisteraddress) {
        this.customerregisteraddress = customerregisteraddress;
    }

    public String getCustomerphone() {
        return customerphone;
    }

    public void setCustomerphone(String customerphone) {
        this.customerphone = customerphone;
    }

    public String getCustomeremail() {
        return customeremail;
    }

    public void setCustomeremail(String customeremail) {
        this.customeremail = customeremail;
    }

}