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
     * 添加会员
     * @param
     * @throws Exception
     */
    void create(Member member) throws Exception;

    /**
     * 所有的会员信息
     * @return
     * @throws Exception
     */
    List<Member> findAll() throws Exception;

    /**
     * 通过memberId,memberName查询会员信息
     * @return
     * @throws Exception
     */
    Member findById() throws Exception;

}
