package com.teacherblitz.service;

import com.github.pagehelper.PageInfo;
import com.teacherblitz.entity.Category;
import com.teacherblitz.entity.bo.CategoryBO;
import com.teacherblitz.entity.vo.CategoryVO;

import java.util.List;

/**
 * @author: teacherblitz
 * @since: 2020/5/12
 */
public interface CategoryService {

    /**
     * 查询种类信息
     * @param categoryBO
     * @return
     */
    List<CategoryVO> queryPageCategory(CategoryBO categoryBO);
}
