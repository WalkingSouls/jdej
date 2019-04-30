package com.miquankj.jdej.common.service.impl;

import com.miquankj.jdej.common.dao.ProductMapper;
import com.miquankj.jdej.common.entity.Product;
import com.miquankj.jdej.common.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public void createNewPro(Product product) {
        productMapper.insert(product);
    }
}
