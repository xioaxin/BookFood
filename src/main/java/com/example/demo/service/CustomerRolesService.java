package com.example.demo.service;

import com.example.demo.entity.CustomerRoles;
import com.example.demo.entity.Roles;

import java.util.List;

/**
 * (CustomerRoles)表服务接口
 *
 * @author makejava
 * @since 2020-06-16 10:07:15
 */
public interface CustomerRolesService {

    /**
     * 通过ID查询单条数据
     *
     * @param customerId 主键
     * @return 实例对象
     */
    CustomerRoles queryById(Integer customerId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<CustomerRoles> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param customerRoles 实例对象
     * @return 实例对象
     */
    CustomerRoles insert(CustomerRoles customerRoles);

    /**
     * 修改数据
     *
     * @param customerRoles 实例对象
     * @return 实例对象
     */
    CustomerRoles update(CustomerRoles customerRoles);

    /**
     * 通过主键删除数据
     *
     * @param customerId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer customerId);

    /**
     * 通过顾客id查询顾客的所有权限
     *
     * @param customerId 顾客ID
     * @return 顾客权限
     */
    public List<CustomerRoles> findListByCustomerID(Integer customerId);
}