package com.miquankj.jdej.common.dao;


import com.miquankj.jdej.common.entity.DealerApplication;

public interface DealerApplicationMapper {
    int deleteByPrimaryKey(Integer num);

    int insert(DealerApplication record);

    int insertSelective(DealerApplication record);

    DealerApplication selectByPrimaryKey(Integer num);

    int updateByPrimaryKeySelective(DealerApplication record);

    int updateByPrimaryKey(DealerApplication record);
}