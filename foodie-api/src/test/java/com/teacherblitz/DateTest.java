package com.teacherblitz;

import org.junit.Test;

import java.time.LocalDate;

/**
 * 日期 测试类
 * @author: zhuyu
 * @since: 2020/5/11
 */
public class DateTest {

    @Test
    public void fun(){
        LocalDate now = LocalDate.now();
        System.out.println(now.getDayOfWeek().getValue());
    }
}
