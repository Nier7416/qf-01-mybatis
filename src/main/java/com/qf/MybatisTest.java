package com.qf;

import com.qf.mapper.EmpMapper;
import com.qf.pojo.Emp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @author 74161
 * @version IntelliJ IDEA 2021.1/jdk-8u351
 * @Project qf-01-mybatis
 * @Package com.qf
 * @Description:
 * @Date 2023/5/4 11:42
 */
public class MybatisTest {
    @Test
    public void mybatisFind() throws Exception {
        String s = "mybatis-config.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(s);
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sessionFactory = sqlSessionFactoryBuilder.build(resourceAsStream);
        SqlSession sqlSession = sessionFactory.openSession();
        List<Emp> empList = sqlSession.selectList("emp.findAll");
        for (Emp emp : empList) {
            System.out.println(emp);

        }


    }

    @Test
    public void mybatisFindInterface() throws Exception {
        String s = "mybatis-config.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(s);
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sessionFactory = sqlSessionFactoryBuilder.build(resourceAsStream);
        SqlSession sqlSession = sessionFactory.openSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> empList = mapper.findAll("nier");
        empList.stream().forEach(System.out::println);
    }
}
