package com.coffee.ssm.controller;

import com.coffee.ssm.entity.Member;
import com.coffee.ssm.service.MemberService;
import com.coffee.ssm.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 陈俊旭
 * @description
 * @create 2019/8/27 16:21
 */
@RestController
@RequestMapping("/members")
@Slf4j
public class MemberController {
    @Resource
    MemberService memberService;
    @RequestMapping("/list")
    public Result<List<Member>> memberList() {
        try {
            List<Member> memberList = memberService.findAll();
            return Result.success(memberList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.error();

    }
}
