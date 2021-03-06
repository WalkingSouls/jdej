package com.miquankj.jdej.common.dao;


import com.miquankj.jdej.common.entity.StoreCustomer;

public interface StoreCustomerMapper {
    int deleteByPrimaryKey(Integer stoCusId);

    int insert(StoreCustomer record);

    int insertSelective(StoreCustomer record);

    StoreCustomer selectByPrimaryKey(Integer stoCusId);

    int updateByPrimaryKeySelective(StoreCustomer record);

    int updateByPrimaryKey(StoreCustomer record);
}