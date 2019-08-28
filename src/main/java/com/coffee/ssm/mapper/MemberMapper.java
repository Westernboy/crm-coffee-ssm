package com.coffee.ssm.mapper;

import com.coffee.ssm.entity.Member;

import java.util.List;

/**
 * @author 陈俊旭
 * @description
 * @create 2019/8/26 20:49
 */
public interface MemberMapper {

    /**
     * 查询所有的会员信息
     * @return
     * @throws Exception
     */
    List<Member> findAll() throws Exception;



}