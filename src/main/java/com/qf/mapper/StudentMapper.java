package com.qf.mapper;

import com.qf.pojo.Student;

import java.util.List;

/**
 * @author 74161
 * @version IntelliJ IDEA 2021.1/jdk-8u351
 * @Project qf-01-mybatis
 * @Package com.qf.mapper
 * @Description:
 * @Date 2023/5/5 20:55
 */
public interface StudentMapper {
    List<Student> findStudent();
}
