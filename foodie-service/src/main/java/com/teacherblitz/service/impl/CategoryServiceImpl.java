package com.teacherblitz.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.teacherblitz.entity.bo.CategoryBO;
import com.teacherblitz.entity.vo.CategoryVO;
import com.teacherblitz.mapper.CategoryMapper;
import com.teacherblitz.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: teacherblitz
 * @since: 2020/5/12
 */
@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryMapper categoryMapper;


    @Override
    public List<CategoryVO> queryPageCategory(CategoryBO categoryBO) {
        List<CategoryVO> categoryVO = categoryMapper.queryPageCategory(categoryBO);
        return categoryVO;
    }
}
