package com.teacherblitz.controller;

import com.teacherblitz.service.StuService;
import com.teacherblitz.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Stu
 * @author teacherblitz
 * @since 2020/5/2
 */
@Api(tags = "最小单元模块")
@RestController
@RequestMapping("/v1/stu/")
@RequiredArgsConstructor
public class StuController {

    private final StuService stuService;

    @ApiOperation(value = "根据id获取最小单元信息")
    @GetMapping(value = "/info")
    @ApiImplicitParam(name = "id", value = "主键id",required = true, dataType = "int", paramType = "query", example = "1205")
    public Result getStuById(int id){
        return Result.ok(stuService.selectStuById(id));
    }
}
