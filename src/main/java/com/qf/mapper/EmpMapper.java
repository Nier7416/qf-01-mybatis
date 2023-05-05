package com.qf.mapper;

import com.qf.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

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

    List<Emp> findByQuery1(String name, int age);

    List<Emp> findByQuery2(@Param("name") String name,@Param("age") int age);

    List<Emp> findByEmp(Emp emp);   //#{name} #{age}

    List<Emp> findByMap(Map map);//map.put(name,田)  #{name}

    List<Emp> findDynSql(@Param("name") String name,@Param("age") Integer age, @Param("salary") Integer salary);
}
