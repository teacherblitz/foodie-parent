package com.teacherblitz.exception;

import com.teacherblitz.bean.CustomException;
import com.teacherblitz.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * 拦截所有的controller，用于监控系统所有的controller异常
 * @author: teacherblitz
 * @since: 2020/5/9
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 所有异常报错
     * @param request
     * @param exception
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    public Result allExceptionHandler(HttpServletRequest request, Exception exception) {
        if(exception instanceof MethodArgumentNotValidException){
            log.info("【系统异常】：方法参数验证异常了...");
            return Result.error(((MethodArgumentNotValidException) exception).getBindingResult().getFieldError().getDefaultMessage());
        }else if(exception instanceof CustomException){
            CustomException ex = (CustomException)exception;
            return Result.buildError(ex.getErrorCodeEnum());
        }
        exception.printStackTrace();
        return Result.error(exception.getMessage());
    }
}
