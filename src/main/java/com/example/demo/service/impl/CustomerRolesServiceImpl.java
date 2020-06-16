package com.example.demo.service.impl;

import com.example.demo.entity.CustomerRoles;
import com.example.demo.dao.CustomerRolesDao;
import com.example.demo.entity.Roles;
import com.example.demo.service.CustomerRolesService;
import jdk.nashorn.internal.ir.ReturnNode;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CustomerRoles)表服务实现类
 *
 * @author makejava
 * @since 2020-06-16 10:07:15
 */
@Service("customerRolesService")
public class CustomerRolesServiceImpl implements CustomerRolesService {
    @Resource
    private CustomerRolesDao customerRolesDao;

    /**
     * 通过ID查询单条数据
     *
     * @param customerId 主键
     * @return 实例对象
     */
    @Override
    public CustomerRoles queryById(Integer customerId) {
        return this.customerRolesDao.queryById(customerId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<CustomerRoles> queryAllByLimit(int offset, int limit) {
        return this.customerRolesDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param customerRoles 实例对象
     * @return 实例对象
     */
    @Override
    public CustomerRoles insert(CustomerRoles customerRoles) {
        this.customerRolesDao.insert(customerRoles);
        return customerRoles;
    }

    /**
     * 修改数据
     *
     * @param customerRoles 实例对象
     * @return 实例对象
     */
    @Override
    public CustomerRoles update(CustomerRoles customerRoles) {
        this.customerRolesDao.update(customerRoles);
        return this.queryById(customerRoles.getCustomerId());
    }

    /**
     * 通过主键删除数据
     *
     * @param customerId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer customerId) {
        return this.customerRolesDao.deleteById(customerId) > 0;
    }

    /**
     * 通过顾客id查询顾客的所有权限
     *
     * @param customerId 顾客ID
     * @return 顾客权限
     */
    @Override
    public List<CustomerRoles> findListByCustomerID(Integer customerId) {
        return customerRolesDao.findListByCustomerID(customerId);
    }

}