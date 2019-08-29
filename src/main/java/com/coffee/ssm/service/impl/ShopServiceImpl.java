package com.coffee.ssm.service.impl;

import com.coffee.ssm.entity.Shop;
import com.coffee.ssm.mapper.ShopMapper;
import com.coffee.ssm.service.ShopService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 陈俊旭
 * @description
 * @create 2019/8/28 20:08
 */
@Service("ShopService")
public class ShopServiceImpl implements ShopService {
    @Resource
    ShopMapper shopMapper;

    @Override
    public List<Shop> findAll() throws Exception {
        return shopMapper.findAll();
    }
}
