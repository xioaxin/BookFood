package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.Customer;
import com.example.demo.entity.CustomerRoles;
import com.example.demo.service.CustomerRolesService;
import com.example.demo.service.CustomerService;
import com.example.demo.utils.MD5Util;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


/**
 * @Description:
 * @author: ZPX
 * @createDate: 2020/6/16 11:23
 * @version: 1.0
 */
@Controller
public class RegisterController {
    @Resource
    private CustomerService customerService;
    @Resource
    private CustomerRolesService customerRolesService;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String gotoRegisterPage() {
        return "register";
    }

    @ResponseBody
    @RequestMapping(value = "/registerAjax", method = RequestMethod.POST)
    public Object register(@RequestBody Customer customer, Model model) {
        logger.info(customer.toString() + " " + customer.getSelect());
        JSONObject jsonObject = new JSONObject();
        try {
            //加密
            customer.setPassword(MD5Util.convertMD5(customer.getPassword()));
            customerService.insert(customer);
            //添加权限
            CustomerRoles customerRoles = new CustomerRoles();
            System.out.println(customerService.enquireByUserName(customer.getCustomerusername()).getCustomerid());
            customerRoles.setCustomerId(customerService.enquireByUserName(customer.getCustomerusername()).getCustomerid());
            if ("admin".equals(customer.getSelect())) {
                customerRoles.setRoleId(1);
            } else {
                customerRoles.setRoleId(2);
            }
            System.out.println(customerRoles.toString());
            customerRolesService.insert(customerRoles);
            jsonObject.put("msg", "success");
        } catch (Exception e) {
            e.printStackTrace();
            jsonObject.put("msg", "fail");
        }
        return jsonObject;
    }
}




