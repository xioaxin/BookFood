package com.example.demo.service;

import com.example.demo.entity.Customer;

import java.util.List;

/**
 * 顾客表(Customer)表服务接口
 *
 * @author makejava
 * @since 2020-06-16 09:40:02
 */
public interface CustomerService {

    /**
     * 通过ID查询单条数据
     *
     * @param customerid 主键
     * @return 实例对象
     */
    Customer queryById(Integer customerid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Customer> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param customer 实例对象
     * @return 实例对象
     */
    Customer insert(Customer customer);

    /**
     * 修改数据
     *
     * @param customer 实例对象
     * @return 实例对象
     */
    Customer update(Customer customer);

    /**
     * 通过主键删除数据
     *
     * @param customerid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer customerid);

    /**
     * 通过用户名查询顾客信息
     *
     * @param userName 用户名
     * @return 顾客信息
     */
    Customer enquireByUserName(String userName);
}