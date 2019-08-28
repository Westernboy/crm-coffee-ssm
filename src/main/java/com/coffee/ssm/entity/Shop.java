package com.coffee.ssm.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class Shop implements Serializable {
    /**
     * 主键
     */
    private Integer sid;

    /**
     * 店铺id
     */
    private String shopId;

    /**
     * 店铺名称
     */
    private String shopName;

    /**
     * 店铺地址
     */
    private String shopAddr;

    /**
     * 店铺联系电话
     */
    private String shopPhone;

    /**
     * 店铺图片
     */
    private String shopImg;

    /**
     * 经理id
     */
    private String sManageId;

    /**
     * 经理名称
     */
    private String sManageName;

    /**
     * 经理电话
     */
    private String sManagePhone;

    /**
     * 店铺加盟时间
     */
    private Date shopJoinTime;

    /**
     * 店铺营业状态0正常1暂停
     */
    private String shopState;

    private static final long serialVersionUID = 1L;
}

