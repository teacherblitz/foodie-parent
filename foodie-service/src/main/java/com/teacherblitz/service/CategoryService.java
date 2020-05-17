package com.teacherblitz.service;

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
     * 查询三级分类
     * @param categoryBO （id=父级分类id）
     * @return
     */
    List<CategoryVO> queryPageCategory(CategoryBO categoryBO);

    /**
     * 查询一级分类
     * @return
     */
    List<Category> queryCategoryList();
}
