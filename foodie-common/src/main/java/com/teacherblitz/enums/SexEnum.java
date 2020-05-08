package com.teacherblitz.enums;

import lombok.AllArgsConstructor;

/**
 * 性别 枚举
 * @author zhuyuan
 * @since 2020/5/7
 */
@AllArgsConstructor
public enum SexEnum {

    WOMAN(0, "女"),
    MAN(1, "男"),
    SECRET(2, "保密");

    /**
     * 类型
     */
    private int type;

    /**
     * 值
     */
    private String value;
}
