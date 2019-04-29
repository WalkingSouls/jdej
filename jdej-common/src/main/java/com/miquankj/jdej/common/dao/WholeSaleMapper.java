package com.miquankj.jdej.common.dao;


import com.miquankj.jdej.common.entity.WholeSale;

public interface WholeSaleMapper {
    int deleteByPrimaryKey(Integer saleId);

    int insert(WholeSale record);

    int insertSelective(WholeSale record);

    WholeSale selectByPrimaryKey(Integer saleId);

    int updateByPrimaryKeySelective(WholeSale record);

    int updateByPrimaryKey(WholeSale record);
}