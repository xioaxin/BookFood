package com.example.demo.controller;

import com.example.demo.entity.Food;
import com.example.demo.service.FoodService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 食品表(Food)表控制层
 *
 * @author makejava
 * @since 2020-06-16 10:08:12
 */
@RestController
@RequestMapping("food")
public class FoodController {
    /**
     * 服务对象
     */
    @Resource
    private FoodService foodService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Food selectOne(Integer id) {
        return this.foodService.queryById(id);
    }

}