package com.teacherblitz.controller;

import com.teacherblitz.entity.Stu;
import com.teacherblitz.service.StuService;
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
    public Stu getStuById(int id){
        return stuService.selectStuById(id);
    }
}
