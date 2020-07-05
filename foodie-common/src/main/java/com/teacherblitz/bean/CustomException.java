package com.teacherblitz.bean;

import com.teacherblitz.enums.ErrorCodeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author teacherblitz
 * @since 2020/6/17
 */
@Data
@AllArgsConstructor
public class CustomException extends RuntimeException {

    private ErrorCodeEnum errorCodeEnum;
}
