package com.teacherblitz.utils;

import com.teacherblitz.enums.ErrorCodeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * 统一结果返回
 * @author teacherblitz
 * @since 2020/5/4
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "Result",description = "统一结果返回")
public class Result<T> {

    @ApiModelProperty(value = "响应码")
    private String code;

    @ApiModelProperty(value = "响应信息")
    private String msg;

    @ApiModelProperty(value = "数据")
    private T data;

    /**
     * 请求成功
     * @param data
     * @return
     */
    public static <T> Result<T> ok(T data){
        return new Result<>(ErrorCodeEnum.SUCCESS.getCode(), ErrorCodeEnum.SUCCESS.getMsg(), data);
    }

    /**
     * 请求失败
     * @param data
     * @return
     */
    public static <T> Result<T> error(T data){
        return new Result<>(ErrorCodeEnum.ERROR.getCode(), ErrorCodeEnum.ERROR.getMsg(), data);
    }

    public static <T> Result<T> buildError(ErrorCodeEnum errorCodeEnum){
        return new Result<>(errorCodeEnum.getCode(), errorCodeEnum.getMsg(), null);
    }
}

