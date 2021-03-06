package com.miquankj.jdej.common.dao;

import com.miquankj.jdej.common.entity.OrderData;

import java.util.Date;

public interface OrderDataMapper {
    int deleteByPrimaryKey(Date orderDate);

    int insert(OrderData record);

    int insertSelective(OrderData record);

    OrderData selectByPrimaryKey(Date orderDate);

    int updateByPrimaryKeySelective(OrderData record);

    int updateByPrimaryKey(OrderData record);
}