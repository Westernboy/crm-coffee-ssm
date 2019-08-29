package com.coffee.ssm.service;

import com.coffee.ssm.entity.Shop;

import java.util.List;

/**
 * @author 陈俊旭
 * @description
 * @create 2019/8/28 19:49
 */
public interface ShopService {
    /**
     * 查询所有店铺
     * @return
     * @throws Exception
     */
    List<Shop> findAll() throws Exception;
}
