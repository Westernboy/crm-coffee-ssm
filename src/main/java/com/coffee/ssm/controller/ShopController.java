package com.coffee.ssm.controller;

import com.coffee.ssm.entity.Shop;
import com.coffee.ssm.service.ShopService;
import com.coffee.ssm.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 陈俊旭
 * @description
 * @create 2019/8/28 19:48
 */
@RestController
@RequestMapping("/shops")
@Slf4j
public class ShopController {
    @Resource
    ShopService shopService;
    @RequestMapping("/list")
    public Result<List<Shop>> shopList(){
        try {
            List<Shop> shopList = shopService.findAll();
            return Result.success(shopList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.error();
    }
}
