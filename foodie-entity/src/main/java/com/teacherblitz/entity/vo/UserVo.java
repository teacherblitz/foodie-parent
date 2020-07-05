package com.teacherblitz.entity.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户登录返回 实体
 *
 * @author teacherblitz
 * @since 2020/7/5
 */
@Data
public class UserVo implements Serializable {

    private static final long serialVersionUID = 3533997621551497146L;

    /**
     * 用户令牌
     */
    private String userUniqueToken;
}
