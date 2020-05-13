package com.teacherblitz;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * 金额 测试类
 * @author: zhuyu
 * @since: 2020/5/11
 */
public class BigDecimalTest {

    @Test
    public void fun(){
        // 加法
        BigDecimal amtAdd = new BigDecimal("10.01");
        BigDecimal addResult = amtAdd.add(new BigDecimal("0.1"));
        System.out.println(String.format("加法结果：%s",addResult));

        // 减法
        BigDecimal amtSub = new BigDecimal("0.01");
        BigDecimal subResult = amtSub.subtract(new BigDecimal("0.01"));
        System.out.println(String.format("减法结果：%s", subResult));

        // 乘法
        BigDecimal amtMult = new BigDecimal("2");
        BigDecimal multResult = amtMult.multiply(new BigDecimal("0.01"));
        System.out.println(String.format("乘法结果：%s", multResult));

        // 除法
        BigDecimal amtDiv = new BigDecimal("2");
        BigDecimal divResult = amtDiv.divide(new BigDecimal("100"));
        System.out.println(String.format("除法结果：%s", divResult));

    }
}
