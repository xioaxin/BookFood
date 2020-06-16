package com.example.demo.dao;

import com.example.demo.entity.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 顾客表(Customer)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-16 09:40:01
 */
@Mapper
public interface CustomerDao {

    /**
     * 通过ID查询单条数据
     *
     * @param customerid 主键
     * @return 实例对象
     */
    Customer queryById(Integer customerid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Customer> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param customer 实例对象
     * @return 对象列表
     */
    List<Customer> queryAll(Customer customer);

    /**
     * 新增数据
     *
     * @param customer 实例对象
     * @return 影响行数
     */
    int insert(Customer customer);

    /**
     * 修改数据
     *
     * @param customer 实例对象
     * @return 影响行数
     */
    int update(Customer customer);

    /**
     * 通过主键删除数据
     *
     * @param customerid 主键
     * @return 影响行数
     */
    int deleteById(Integer customerid);

    /**
     * 通过用户名查询单条数据
     *
     * @param userName 用户名
     * @return 实例对象
     */
    Customer queryByUserName(String userName);

}