package com.example.demo.service.impl;

import com.example.demo.entity.Customer;
import com.example.demo.entity.CustomerRoles;
import com.example.demo.entity.Roles;
import com.example.demo.service.CustomerRolesService;
import com.example.demo.service.CustomerService;
import com.example.demo.service.RolesService;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @Description:
 * @author: ZPX
 * @createDate: 2020/6/16 10:09
 * @version: 1.0
 */
public class UserDetailServiceImpl implements UserDetailsService {
    @Resource
    private CustomerService customerService;
    @Resource
    private RolesService rolesService;
    @Resource
    private CustomerRolesService customerRolesService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        // 从数据库中取出用户信息
        Customer customer = customerService.enquireByUserName(username);
        // 判断用户是否存在
        if (customer == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        // 添加权限
        List<CustomerRoles> userRoles = customerRolesService.findListByCustomerID(customer.getCustomerid());
        for (CustomerRoles roles : userRoles) {
            Roles role = rolesService.queryById(roles.getRoleId());
            authorities.add(new SimpleGrantedAuthority(role.getRoleName()));
        }
        // 返回UserDetails实现类
        return new User(customer.getCustomerusername(), customer.getPassword(), authorities);
    }
}




