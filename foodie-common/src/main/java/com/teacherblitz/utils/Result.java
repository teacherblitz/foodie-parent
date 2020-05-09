package com.teacherblitz.utils;

import com.teacherblitz.enums.ErrorCodeEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * 统一结果返回
 * @author teacherblitz
 * @since 2020/5/4
 */
@Getter
@Setter
@AllArgsConstructor
public class Result {

    /**
     * 状态码
     */
    private String code;

    /**
     * 状态描述
     */
    private String msg;

    /**
     * 返回对象
     */
    private Object data;

    /**
     * 请求成功
     * @param data
     * @return
     */
    public static Result ok(Object data){
        return new Result(ErrorCodeEnum.SUCCESS.getCode(),ErrorCodeEnum.SUCCESS.getMsg(),data);
    }

    /**
     * 请求失败
     * @param data
     * @return
     */
    public static Result error(Object data){
        return new Result(ErrorCodeEnum.ERROR.getCode(),ErrorCodeEnum.ERROR.getMsg(),data);
    }

}
