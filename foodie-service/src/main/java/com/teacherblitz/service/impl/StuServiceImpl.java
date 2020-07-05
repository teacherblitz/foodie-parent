package com.teacherblitz.service.impl;

import com.teacherblitz.bean.CustomException;
import com.teacherblitz.entity.Stu;
import com.teacherblitz.enums.ErrorCodeEnum;
import com.teacherblitz.mapper.StuMapper;
import com.teacherblitz.service.StuService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Stu业务
 * @author teacherblitz
 * @since 2020/5/2
 */
@Service
@RequiredArgsConstructor
public class StuServiceImpl implements StuService {

    private final StuMapper stuMapper;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Stu selectStuById(int id) {
        Optional.ofNullable(null).orElseThrow(() -> new CustomException(ErrorCodeEnum.USER_CLIENT_ERROR));
        return stuMapper.selectByPrimaryKey(id);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public int insertStu() {
        Stu stu = new Stu();
        ThreadLocalRandom random = ThreadLocalRandom.current();
        stu.setName("Stu"+ random.nextInt(10000));
        stu.setAge(random.nextInt(100));
        return stuMapper.insert(stu);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public int updateStu(int id) {
        Stu stu = new Stu();
        stu.setId(id);
        stu.setName("00");
        return stuMapper.updateByPrimaryKey(stu);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public int deleteStu(int id) {
        return stuMapper.deleteByPrimaryKey(id);
    }
}
