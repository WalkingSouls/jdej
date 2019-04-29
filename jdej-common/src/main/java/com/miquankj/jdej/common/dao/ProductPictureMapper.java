package com.miquankj.jdej.common.dao;


import com.miquankj.jdej.common.entity.ProductPicture;

public interface ProductPictureMapper {
    int deleteByPrimaryKey(Integer proPicId);

    int insert(ProductPicture record);

    int insertSelective(ProductPicture record);

    ProductPicture selectByPrimaryKey(Integer proPicId);

    int updateByPrimaryKeySelective(ProductPicture record);

    int updateByPrimaryKey(ProductPicture record);
}