package com.teacherblitz.mapper;

import com.teacherblitz.entity.Category;
import com.teacherblitz.entity.bo.CategoryBO;
import com.teacherblitz.entity.vo.CategoryVO;
import com.teacherblitz.my.mapper.MyMapper;

import java.util.List;

public interface CategoryMapper extends MyMapper<Category> {

    List<CategoryVO> queryPageCategory(CategoryBO categoryBO);
}