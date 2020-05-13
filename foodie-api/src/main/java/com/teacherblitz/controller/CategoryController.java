package com.teacherblitz.controller;

import com.teacherblitz.entity.bo.CategoryBO;
import com.teacherblitz.service.CategoryService;
import com.teacherblitz.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 分类 controller
 * @author: teacherblitz
 * @since: 2020/5/12
 */
@Api(tags = "分类controller")
@RestController
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @ApiOperation(value = "一级分类")
    @PostMapping(value = "/queryCateGory")
    public Result queryCateGory(){
        return Result.ok(categoryService.queryCategoryList());
    }

    @ApiOperation(value = "根据BO获取三分类")
    @PostMapping(value = "/getSubCategory")
    public Result queryPageCategory(@RequestBody @Validated CategoryBO categoryBO){
        return Result.ok(categoryService.queryPageCategory(categoryBO));
    }
}
