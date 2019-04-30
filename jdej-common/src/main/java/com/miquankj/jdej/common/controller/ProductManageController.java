package com.miquankj.jdej.common.controller;

import com.miquankj.jdej.common.entity.Product;
import com.miquankj.jdej.common.enums.ResultEnum;
import com.miquankj.jdej.common.service.ProductService;
import com.miquankj.jdej.common.utils.ResultVOUtil;
import com.miquankj.jdej.common.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping("/product")
@Slf4j
public class ProductManageController {
    @Autowired
    private ProductService productService;

    @PostMapping("/create")
    public ResultVO createNewPro(Product product){
        productService.createNewPro(product);
        return ResultVOUtil.success();
    }
    @GetMapping("/test")
    @ResponseBody
    public String test(){
        return "OK";
    }
}
