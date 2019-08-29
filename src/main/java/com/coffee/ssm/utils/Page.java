package com.coffee.ssm.utils;

import java.io.Serializable;

/**
 * @author 陈俊旭
 * @description
 * @create 2019/8/29 16:11
 */
public class Page implements Serializable {
    private static final long serialVersionUID = -3198048449643774660L;
    /**
     * 当前页数
     */
    private int pageNow = 1;
    /**
     * 每页显示记录的条数
     */
    private int pageSize = 4;
    /**
     * 总的记录条数
     */
    private int totalCount;
    /**
     * 开始位置,从0开始
     */
    @SuppressWarnings("unsed")
    private int startPos;
    /**
     * 是否有首页
     */
    @SuppressWarnings("unsed")
    private boolean hasFirst;
    /**
     * 是否有前一页
     */
    @SuppressWarnings("unsed")
    private boolean hasPre;
    @SuppressWarnings("")
    private boolean hasNext;


}
