package com.qf.mapper;

import com.qf.pojo.Dept;

import java.util.List;

/**
 * @author 74161
 * @version IntelliJ IDEA 2021.1/jdk-8u351
 * @Project qf-01-mybatis
 * @Package com.qf.mapper
 * @Description:
 * @Date 2023/5/5 19:54
 */
public interface DeptMapper {
    List<Dept> findDept();
}
