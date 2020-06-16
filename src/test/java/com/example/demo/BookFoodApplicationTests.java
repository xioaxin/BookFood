package com.example.demo;

import com.example.demo.entity.CustomerRoles;
import com.example.demo.service.CustomerRolesService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class BookFoodApplicationTests {
    @Resource
    private CustomerRolesService customerRolesService;

    @Test
    void contextLoads() {
        CustomerRoles customerRoles=new CustomerRoles();
        customerRoles.setRoleId(1);
        customerRoles.setCustomerId(54);
        customerRolesService.insert(customerRoles);
    }

}
