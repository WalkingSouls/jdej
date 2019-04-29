package com.miquankj.jdej.common.dao;


import com.miquankj.jdej.common.entity.Lending;

public interface LendingMapper {
    int deleteByPrimaryKey(Integer ledId);

    int insert(Lending record);

    int insertSelective(Lending record);

    Lending selectByPrimaryKey(Integer ledId);

    int updateByPrimaryKeySelective(Lending record);

    int updateByPrimaryKey(Lending record);
}