package com.qf.service;

import com.qf.domain.Goods;

import java.util.List;

public interface GoodsService {
    List<Goods> selectAll();
    void save(Goods goods);
    void delete(Integer gid);
    Goods selectOne(Integer gid);
    List<Goods> selectAllByCid(Integer cid);
}
