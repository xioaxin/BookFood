package com.example.demo.controller;

import com.example.demo.entity.CustomerRoles;
import com.example.demo.service.CustomerRolesService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (CustomerRoles)表控制层
 *
 * @author makejava
 * @since 2020-06-16 10:07:15
 */
@RestController
@RequestMapping("customerRoles")
public class CustomerRolesController {
    /**
     * 服务对象
     */
    @Resource
    private CustomerRolesService customerRolesService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public CustomerRoles selectOne(Integer id) {
        return this.customerRolesService.queryById(id);
    }

}