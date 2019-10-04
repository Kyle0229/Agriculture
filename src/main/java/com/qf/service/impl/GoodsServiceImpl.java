package com.qf.service.impl;

import com.qf.dao.GoodsRespository;
import com.qf.domain.Goods;
import com.qf.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsRespository goodsRespository;

    @Override
    public List<Goods> selectAll() {
        return goodsRespository.findAll();
    }

    @Override
    public void save(Goods goods) {
         goodsRespository.save(goods);
    }

    @Override
    public void delete(Integer gid) {
         goodsRespository.deleteById(gid);
    }

    @Override
    public Goods selectOne(Integer gid) {
        Optional<Goods> byId = goodsRespository.findById(gid);
            Goods goods=byId.get();
        return goods;
    }

}
