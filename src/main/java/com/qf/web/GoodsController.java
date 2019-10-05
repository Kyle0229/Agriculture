package com.qf.web;

import com.qf.domain.Goods;
import com.qf.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class GoodsController {
    @Resource
    GoodsService goodsServiceImpl;
    @RequestMapping("/selectOne")
    public Goods selectOne(@RequestParam("id")Integer id){
        Goods goods =goodsServiceImpl.selectOne(id);
        return goods;

    }
}
