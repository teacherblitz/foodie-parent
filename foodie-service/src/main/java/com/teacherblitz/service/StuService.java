package com.teacherblitz.service;

import com.teacherblitz.entity.Stu;

/**
 * @author teacherblitz
 * @since 2020/5/2
 */
public interface StuService {

    /**
     * 根据id查询Stu信息
     * @param id
     * @return
     */
    Stu selectStuById(int id);

    /**
     * 新增Stu
     * @return
     */
    int insertStu();

    /**
     * 根据id修改Stu信息
     * @param id
     * @return
     */
    int updateStu(int id);

    /**
     * 根据id删除Stu信息
     * @param id
     * @return
     */
    int deleteStu(int id);
}
