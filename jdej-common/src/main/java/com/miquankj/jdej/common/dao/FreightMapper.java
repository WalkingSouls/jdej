package com.miquankj.jdej.common.dao;


import com.miquankj.jdej.common.entity.Freight;

public interface FreightMapper {
    int deleteByPrimaryKey(Integer freId);

    int insert(Freight record);

    int insertSelective(Freight record);

    Freight selectByPrimaryKey(Integer freId);

    int updateByPrimaryKeySelective(Freight record);

    int updateByPrimaryKey(Freight record);
}