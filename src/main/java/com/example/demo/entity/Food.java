package com.example.demo.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 食品表(Food)实体类
 *
 * @author makejava
 * @since 2020-06-16 10:08:12
 */
public class Food implements Serializable {
    private static final long serialVersionUID = 842972347561569599L;
    /**
    * 食品ID
    */
    private Integer foodid;
    /**
    * 食品名称
    */
    private String foodname;
    /**
    * 食品当前数量
    */
    private Integer foodnumber;
    /**
    * 食品类别
    */
    private String foodtype;
    /**
    * 食品生产日期
    */
    private Date foodcreatetime;


    public Integer getFoodid() {
        return foodid;
    }

    public void setFoodid(Integer foodid) {
        this.foodid = foodid;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public Integer getFoodnumber() {
        return foodnumber;
    }

    public void setFoodnumber(Integer foodnumber) {
        this.foodnumber = foodnumber;
    }

    public String getFoodtype() {
        return foodtype;
    }

    public void setFoodtype(String foodtype) {
        this.foodtype = foodtype;
    }

    public Date getFoodcreatetime() {
        return foodcreatetime;
    }

    public void setFoodcreatetime(Date foodcreatetime) {
        this.foodcreatetime = foodcreatetime;
    }

}