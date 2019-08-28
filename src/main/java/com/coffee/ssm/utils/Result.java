package com.coffee.ssm.utils;
import lombok.Data;

/**
 * @author 陈俊旭
 * @description
 * @create 2019/8/27 16:55
 */
@Data
public class Result<T> {
    private String msg;
    private int status;
    private T data;

    public static Result success(Object obj) {
        Result result = new Result();
        result.setStatus(Constants.SUCCESS_STATUS_200);
        result.setData(obj);
        result.setMsg(Constants.SUCCESS_MSG);
        return result;
    }


    public static Result error() {
        Result result = new Result();
        result.setStatus(Constants.ERROR_STATUS_404);
        result.setMsg(Constants.ERROR_MSG);
        return result;
    }

}
