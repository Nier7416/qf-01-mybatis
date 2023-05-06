package com.qf;

import com.qf.mapper.EmpMapper;
import com.qf.pojo.Emp;
import com.qf.utils.MyBatisUtils;
import org.junit.Test;

import java.util.List;

/**
 * @author 74161
 * @version IntelliJ IDEA 2021.1/jdk-8u351
 * @Project qf-01-mybatis
 * @Package com.qf
 * @Description:
 * @Date 2023/5/5 21:58
 */
public class MybatisDynSql {
    @Test
    public void oneToOne(){
        EmpMapper mapper = MyBatisUtils.getMapper(EmpMapper.class);
        String name="田";
//        int age=18;
        Integer age=null;
        Integer salary=1000;
        if (name!=null){
            name=name.trim();
        }
        List<Emp> empList=mapper.findDynSql(name,age,salary);
        empList.stream().forEach(System.out::println);
    }
    /**
     * 批量添加数据
     */
    @Test
    public void dynSQLBatchInsert(){
        long startTime = System.currentTimeMillis();
//        MyBatisUtils.getMapper()

    }
}
