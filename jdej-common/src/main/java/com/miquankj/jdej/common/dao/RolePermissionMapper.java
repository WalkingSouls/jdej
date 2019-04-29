package com.miquankj.jdej.common.dao;


import com.miquankj.jdej.common.entity.RolePermission;

public interface RolePermissionMapper {
    int deleteByPrimaryKey(Integer rolePerId);

    int insert(RolePermission record);

    int insertSelective(RolePermission record);

    RolePermission selectByPrimaryKey(Integer rolePerId);

    int updateByPrimaryKeySelective(RolePermission record);

    int updateByPrimaryKey(RolePermission record);
}