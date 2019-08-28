package com.coffee.ssm.service;

import com.coffee.ssm.entity.Member;

import java.util.List;

/**
 * @author 陈俊旭
 * @description
 * @create 2019/8/26 21:40
 */
public interface MemberService {
    /**
     *
     * 所有的会员信息
     *
     * @return
     * @throws Exception
     */
    List<Member> findAll() throws Exception;

}
