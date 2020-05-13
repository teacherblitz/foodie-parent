package com.teacherblitz.controller;

import com.teacherblitz.entity.Category;
import com.teacherblitz.entity.bo.CategoryBO;
import com.teacherblitz.entity.vo.CategoryVO;
import com.teacherblitz.service.CategoryService;
import com.teacherblitz.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 种类 controller
 * @author: zhuyu
 * @since: 2020/5/12
 */
@Api(tags = "种类controller")
@RestController
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @ApiOperation(value = "根据BO获取种类信息", httpMethod = "POST",response = Result.class)
    @PostMapping(value = "/getPageCategory")
    public Result queryPageCategory(@RequestBody @Validated CategoryBO categoryBO){
        return Result.ok(categoryService.queryPageCategory(categoryBO));
    }
}
