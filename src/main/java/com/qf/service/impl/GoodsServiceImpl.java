package com.qf.service.impl;

import com.qf.dao.GoodsRespository;
import com.qf.domain.Goods;
import com.qf.mapper.GoodsMapper;
import com.qf.response.ResponseGoods;
import com.qf.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsRespository goodsRespository;
    @Resource
    private GoodsMapper goodsMapper;
    @Override
    public ResponseGoods selectAll(Integer page, Integer size) {
        Pageable pages=PageRequest.of(page-1,size);
        Page<Goods> all=goodsRespository.findAll(pages);
        ResponseGoods res=new ResponseGoods();
        res.setList(all.getContent());
        res.setTotal(all.getTotalElements());
        return res;
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

    @Override
    public List<Goods> selectAllByCid(Integer cid) {
        return goodsMapper.selectAllByCid(cid);
    }

}
