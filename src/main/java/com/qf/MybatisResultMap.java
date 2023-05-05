package com.qf;

import com.qf.mapper.DeptMapper;
import com.qf.mapper.EmpMapper;
import com.qf.mapper.PassengerMapper;
import com.qf.mapper.StudentMapper;
import com.qf.pojo.Dept;
import com.qf.pojo.Emp;
import com.qf.pojo.Passenger;
import com.qf.pojo.Student;
import com.qf.utils.MyBatisUtils;
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
 * @Package PACKAGE_NAME
 * @Description:
 * @Date 2023/5/4 19:36
 */
public class MybatisResultMap {
   @Test
    public void oneToOne(){
       PassengerMapper mapper = MyBatisUtils.getMapper(PassengerMapper.class);
       List<Passenger> passenger = mapper.findPassenger();
       passenger.stream().forEach(System.out::println);

   }
/**
 * 一对多
 * 部门与员工
 */
@Test
   public void oneToMany(){
   DeptMapper mapper = MyBatisUtils.getMapper(DeptMapper.class);
   List<Dept> deptList=mapper.findDept();
   deptList.stream().forEach(System.out::println);
}

/**
 * 多对多
 *
 * 学生表   student
 *       关联表sc
 * 课程表   course
 */
@Test
   public void manyToMany(){
   StudentMapper mapper = MyBatisUtils.getMapper(StudentMapper.class);
   List<Student> studentList=mapper.findStudent();
   studentList.stream().forEach(System.out::println);
}
}
