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

/**
 * @author 74161
 * @version IntelliJ IDEA 2021.1/jdk-8u351
 * @Project qf-01-mybatis
 * @Package PACKAGE_NAME
 * @Description:
 * @Date 2023/5/4 19:36
 */
public class MybatisCRUD {
    SqlSessionFactory sessionFactory=null;
    @Before
    public void before() throws Exception{
        String s = "mybatis-config.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(s);
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
         sessionFactory = sqlSessionFactoryBuilder.build(resourceAsStream);
    }

    //添加
    @Test
    public void insert(){
        SqlSession sqlSession = sessionFactory.openSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp=new Emp();
        emp.setName("张三");
        emp.setAge(18);
        int i = mapper.insert(emp);
        System.out.println(emp.getId());
        System.out.println("影响的行数:"+i);
        sqlSession.commit();
//        sqlSession.rollback();
        sqlSession.close();
    }

    //删除
    @Test
    public void delete() {
        SqlSession sqlSession = sessionFactory.openSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Integer id = 7;
        mapper.delete(id);
        sqlSession.commit();
        sqlSession.close();
    }

    //修改
    @Test
    public void update() {
        SqlSession sqlSession = sessionFactory.openSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp=new Emp();
        emp.setId(2);
        emp.setName("尼尔");
        emp.setAge(22);
        mapper.update(emp);
        sqlSession.commit();
        sqlSession.close();
    }
}
