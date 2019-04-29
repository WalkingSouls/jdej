package com.miquankj.jdej.common.dao;


import com.miquankj.jdej.common.entity.RedEnvelope;

public interface RedEnvelopeMapper {
    int deleteByPrimaryKey(Integer redEnvId);

    int insert(RedEnvelope record);

    int insertSelective(RedEnvelope record);

    RedEnvelope selectByPrimaryKey(Integer redEnvId);

    int updateByPrimaryKeySelective(RedEnvelope record);

    int updateByPrimaryKeyWithBLOBs(RedEnvelope record);

    int updateByPrimaryKey(RedEnvelope record);
}