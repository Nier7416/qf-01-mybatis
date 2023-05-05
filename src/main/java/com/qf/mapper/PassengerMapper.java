package com.qf.mapper;

import com.qf.pojo.Passenger;

import java.util.List;

/**
 * @author 74161
 * @version IntelliJ IDEA 2021.1/jdk-8u351
 * @Project qf-01-mybatis
 * @Package com.qf.mapper
 * @Description:
 * @Date 2023/5/5 19:05
 */
public interface PassengerMapper {
    //查询所有旅客信息，包含护照
    public List<Passenger> findPassenger();
}
