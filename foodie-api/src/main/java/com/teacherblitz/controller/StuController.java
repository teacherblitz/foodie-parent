package com.teacherblitz.controller;

import com.teacherblitz.service.StuService;
import com.teacherblitz.utils.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Stu
 * @author teacherblitz
 * @since 2020/5/2
 */
@RestController
@RequiredArgsConstructor
public class StuController {

    private final StuService stuService;

    @RequestMapping("/getStuById")
    public Result getStuById(int id){
        return Result.ok(stuService.selectStuById(id));
    }
}
