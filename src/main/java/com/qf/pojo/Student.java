package com.qf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * 学生
 * @author lixu
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {

    private Integer id;
    private String name;
    private String sex;
    private List<Course> course;

    public List<Course> getCourses() {
        return course;
    }

    public void setCourses(List<Course> courses) {
        this.course = courses;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
