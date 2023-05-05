package com.qf;

import com.qf.mapper.EmpMapper;
import com.qf.pojo.Emp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @author 74161
 * @version IntelliJ IDEA 2021.1/jdk-8u351
 * @Project qf-01-mybatis
 * @Package com.qf
 * @Description:
 * @Date 2023/5/4 21:48
 */
public class MybatisQuery {
    SqlSessionFactory sessionFactory=null;
    @Before
    public void before() throws Exception{
        String s = "mybatis-config.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(s);
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        sessionFactory = sqlSessionFactoryBuilder.build(resourceAsStream);
    }

    @Test
    public void findQuery1(){
        SqlSession sqlSession = sessionFactory.openSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> empList=mapper.findByQuery1("田",18);
        empList.stream().forEach(System.out::println);
    }
    @Test
    public void findQuery2(){
        SqlSession sqlSession = sessionFactory.openSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> empList=mapper.findByQuery2("田",18);
        empList.stream().forEach(System.out::println);
    }
}
