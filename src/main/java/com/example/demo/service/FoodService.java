package com.example.demo.service;

import com.example.demo.entity.Food;
import java.util.List;

/**
 * 食品表(Food)表服务接口
 *
 * @author makejava
 * @since 2020-06-16 10:08:12
 */
public interface FoodService {

    /**
     * 通过ID查询单条数据
     *
     * @param foodid 主键
     * @return 实例对象
     */
    Food queryById(Integer foodid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Food> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param food 实例对象
     * @return 实例对象
     */
    Food insert(Food food);

    /**
     * 修改数据
     *
     * @param food 实例对象
     * @return 实例对象
     */
    Food update(Food food);

    /**
     * 通过主键删除数据
     *
     * @param foodid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer foodid);

}