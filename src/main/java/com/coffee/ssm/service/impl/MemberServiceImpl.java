package com.coffee.ssm.service.impl;

import com.coffee.ssm.entity.Member;
import com.coffee.ssm.mapper.MemberMapper;
import com.coffee.ssm.service.MemberService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 陈俊旭
 * @description
 * @create 2019/8/26 21:40
 */
@Service("MemberService")
public class MemberServiceImpl implements MemberService {
    @Resource
    MemberMapper memberMapper;


    @Override
    public void create(Member member) throws Exception {

    }

    @Override
    public List<Member> findAll() throws Exception {
        return memberMapper.findAll();
    }

    @Override
    public Member findById() throws Exception {
        return memberMapper.findById("memberId");
    }

    @Override
    public int updateIsDelete() throws Exception {
        memberMapper.updateIsDelete();
        return 0;
    }


}
