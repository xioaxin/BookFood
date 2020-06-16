package com.example.demo.dao;

import com.example.demo.entity.CustomerRoles;
import com.example.demo.entity.Roles;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (CustomerRoles)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-16 10:07:15
 */
public interface CustomerRolesDao {

    /**
     * 通过ID查询单条数据
     *
     * @param customerId 主键
     * @return 实例对象
     */
    CustomerRoles queryById(Integer customerId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CustomerRoles> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param customerRoles 实例对象
     * @return 对象列表
     */
    List<CustomerRoles> queryAll(CustomerRoles customerRoles);

    /**
     * 新增数据
     *
     * @param customerRoles 实例对象
     * @return 影响行数
     */
    int insert(CustomerRoles customerRoles);

    /**
     * 修改数据
     *
     * @param customerRoles 实例对象
     * @return 影响行数
     */
    int update(CustomerRoles customerRoles);

    /**
     * 通过主键删除数据
     *
     * @param customerId 主键
     * @return 影响行数
     */
    int deleteById(Integer customerId);
    /**
     * 通过顾客id查询顾客的所有权限
     *
     * @param customerId 顾客ID
     * @return 顾客权限
     */
    List<CustomerRoles> findListByCustomerID(Integer customerId);
}