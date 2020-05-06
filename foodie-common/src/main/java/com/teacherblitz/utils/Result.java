package com.teacherblitz.utils;

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
    private int status;

    /**
     * 状态描述
     */
    private String msg;

    /**
     * 结果集
     */
    private Object data;

    public Result ok(Object data){
        return new Result(200,"ok",data);
    }

}
