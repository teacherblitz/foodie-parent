package com.teacherblitz.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.teacherblitz.entity.Category;
import com.teacherblitz.entity.bo.CategoryBO;
import com.teacherblitz.entity.vo.CategoryVO;
import com.teacherblitz.enums.CategoryTypeEnum;
import com.teacherblitz.mapper.CategoryMapper;
import com.teacherblitz.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

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

    @Override
    public List<Category> queryCategoryList() {
        Example example = new Example(Category.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("type", CategoryTypeEnum.ONE.getType());
        List<Category> categoryList = categoryMapper.selectByExample(example);
        return categoryList;
    }
}
