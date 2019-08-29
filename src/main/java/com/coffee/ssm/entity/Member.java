package com.coffee.ssm.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 陈俊旭
 */
@Data
public class Member implements Serializable {
    /**
     *主键
     */
    private Integer mid;

    /**
     * 会员id
     */
    private String memberId;

    /**
     * 会员姓名
     */
    private String memberName;

    /**
     * 0是男1是女
     */
    private String sex;

    /**
     * 会员电话
     */
    private String memberPhone;

    /**
     * 会员积分
     */
    private Long memberScore;

    /**
     * 注册时间
     */
    private Date registerTime;

    /**
     * 会员生日
     */
    private Date birthday;

    /**
     * 会员办理店铺id
     */
    private String registerShopId;

    /**
     * 会员卡等级
     */
    private String memberLevel;

    /**
     * 0会员卡正常,1注销
     */
    private String isDelete;

    private Shop shop;
}

