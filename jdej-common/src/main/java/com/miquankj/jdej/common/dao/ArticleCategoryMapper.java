package com.miquankj.jdej.common.dao;


import com.miquankj.jdej.common.entity.ArticleCategory;

public interface ArticleCategoryMapper {
    int deleteByPrimaryKey(Integer catId);

    int insert(ArticleCategory record);

    int insertSelective(ArticleCategory record);

    ArticleCategory selectByPrimaryKey(Integer catId);

    int updateByPrimaryKeySelective(ArticleCategory record);

    int updateByPrimaryKey(ArticleCategory record);
}