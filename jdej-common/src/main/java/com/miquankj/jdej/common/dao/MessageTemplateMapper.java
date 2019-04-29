package com.miquankj.jdej.common.dao;


import com.miquankj.jdej.common.entity.MessageTemplate;

public interface MessageTemplateMapper {
    int deleteByPrimaryKey(Integer msgTemId);

    int insert(MessageTemplate record);

    int insertSelective(MessageTemplate record);

    MessageTemplate selectByPrimaryKey(Integer msgTemId);

    int updateByPrimaryKeySelective(MessageTemplate record);

    int updateByPrimaryKeyWithBLOBs(MessageTemplate record);

    int updateByPrimaryKey(MessageTemplate record);
}