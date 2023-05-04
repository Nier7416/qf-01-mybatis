package com.qf.pojo;

import java.util.List;

/**
 * @author lixu
 */
public class Dept {

    private Integer id;
    private String name;

    //1对多
    private List<Emp> empList;


    public List<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
