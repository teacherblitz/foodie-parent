package com.teacherblitz.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 分类类型 枚举
 * @author: teacherblitz
 * @since: 2020/5/13
 */
@Getter
@AllArgsConstructor
public enum CategoryTypeEnum {

    ONE(1, "一级分类"),
    TWO(2, "二级分类"),
    THREE(3, "三级分类");

    /**
     * 类型
     */
    private int type;

    /**
     * 描述
     */
    private String msg;
}
