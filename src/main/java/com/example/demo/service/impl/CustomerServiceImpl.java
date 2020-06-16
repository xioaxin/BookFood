package com.example.demo.service.impl;

import com.example.demo.entity.Customer;
import com.example.demo.dao.CustomerDao;
import com.example.demo.service.CustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 顾客表(Customer)表服务实现类
 *
 * @author makejava
 * @since 2020-06-16 09:40:03
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
    @Resource
    private CustomerDao customerDao;

    /**
     * 通过ID查询单条数据
     *
     * @param customerid 主键
     * @return 实例对象
     */
    @Override
    public Customer queryById(Integer customerid) {
        return this.customerDao.queryById(customerid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Customer> queryAllByLimit(int offset, int limit) {
        return this.customerDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param customer 实例对象
     * @return 实例对象
     */
    @Override
    public Customer insert(Customer customer) {
        this.customerDao.insert(customer);
        return customer;
    }

    /**
     * 修改数据
     *
     * @param customer 实例对象
     * @return 实例对象
     */
    @Override
    public Customer update(Customer customer) {
        this.customerDao.update(customer);
        return this.queryById(customer.getCustomerid());
    }

    /**
     * 通过主键删除数据
     *
     * @param customerid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer customerid) {
        return this.customerDao.deleteById(customerid) > 0;
    }

    /**
     * 通过用户名查询顾客信息
     *
     * @param userName 用户名
     * @return 顾客信息
     */
    @Override
    public Customer enquireByUserName(String userName) {
        return customerDao.queryByUserName(userName);
    }


}