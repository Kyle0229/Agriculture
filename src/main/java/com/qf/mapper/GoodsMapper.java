package com.qf.mapper;

import com.qf.domain.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsMapper {
    List<Goods> selectAllByCid(Integer cid);

    Goods selectOneByGid(Integer gid);
}
