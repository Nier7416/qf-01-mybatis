package com.qf.mapper;

import com.qf.pojo.Emp;

import java.util.List;

/**
 * @author 74161
 * @version IntelliJ IDEA 2021.1/jdk-8u351
 * @Project qf-01-mybatis
 * @Package com.qf.mapper
 * @Description:
 * @Date 2023/5/4 17:57
 */
public interface EmpMapper {
    public List<Emp> findAll(String name);

    int insert(Emp emp);

    void delete(Integer id);

    void update(Emp emp);

    List<Emp> findByQuery(String name, int age);
}
