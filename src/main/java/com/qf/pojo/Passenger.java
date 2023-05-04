package com.qf.pojo;

import java.util.List;

/**
 * 旅客
 * @author lixu
 */
public class Passenger {



    private Integer id;
    private String name;
    private String age;

    private Passport passport;//护照

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
