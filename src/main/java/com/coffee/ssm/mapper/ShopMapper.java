package com.coffee.ssm.mapper;


import com.coffee.ssm.entity.Shop;

import java.util.List;

/**
 * @author 陈俊旭
 * @description
 * @create 2019/8/28 19:38
 */
public interface ShopMapper {

    /**
     * 查询所有的会员信息
     *
     * @return
     * @throws Exception
     */
    List<Shop> findAll() throws Exception;

}