package com.teacherblitz.controller;

import com.teacherblitz.entity.Category;
import com.teacherblitz.entity.bo.CategoryBO;
import com.teacherblitz.entity.vo.CategoryVO;
import com.teacherblitz.service.CategoryService;
import com.teacherblitz.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * 分类 controller
 * @author: teacherblitz
 * @since: 2020/5/12
 */
@Api(tags = "分类模块")
@RestController
@RequestMapping("/v1/category/")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @ApiOperation(value = "一级分类")
    @PostMapping(value = "/top_list")
    public Result<List<Category>> queryCateGory(){
        return Result.ok(categoryService.queryCategoryList());
    }

    @ApiOperation(value = "三级分类")
    @PostMapping(value = "/sub_list")
    public Result<List<CategoryVO>> queryPageCategory(@RequestBody @Valid CategoryBO categoryBO){
        return Result.ok(categoryService.queryPageCategory(categoryBO));
    }
}
