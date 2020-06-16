package com.example.demo.service.impl;

import com.example.demo.entity.Food;
import com.example.demo.dao.FoodDao;
import com.example.demo.service.FoodService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 食品表(Food)表服务实现类
 *
 * @author makejava
 * @since 2020-06-16 10:08:12
 */
@Service("foodService")
public class FoodServiceImpl implements FoodService {
    @Resource
    private FoodDao foodDao;

    /**
     * 通过ID查询单条数据
     *
     * @param foodid 主键
     * @return 实例对象
     */
    @Override
    public Food queryById(Integer foodid) {
        return this.foodDao.queryById(foodid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Food> queryAllByLimit(int offset, int limit) {
        return this.foodDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param food 实例对象
     * @return 实例对象
     */
    @Override
    public Food insert(Food food) {
        this.foodDao.insert(food);
        return food;
    }

    /**
     * 修改数据
     *
     * @param food 实例对象
     * @return 实例对象
     */
    @Override
    public Food update(Food food) {
        this.foodDao.update(food);
        return this.queryById(food.getFoodid());
    }

    /**
     * 通过主键删除数据
     *
     * @param foodid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer foodid) {
        return this.foodDao.deleteById(foodid) > 0;
    }
}