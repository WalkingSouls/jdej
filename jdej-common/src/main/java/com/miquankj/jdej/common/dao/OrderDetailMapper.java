package com.miquankj.jdej.common.dao;


import com.miquankj.jdej.common.entity.OrderDetail;

public interface OrderDetailMapper {
    int deleteByPrimaryKey(Long detailId);

    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);

    OrderDetail selectByPrimaryKey(Long detailId);

    int updateByPrimaryKeySelective(OrderDetail record);

    int updateByPrimaryKey(OrderDetail record);
}