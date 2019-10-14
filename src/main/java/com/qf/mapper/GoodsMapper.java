package com.qf.mapper;

import com.qf.domain.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GoodsMapper {
    List<Goods> selectAllByCid(Integer cid);

    Goods selectOneByGid(Integer gid);
    Long  selectCountBySid(Integer sid);
    List<Goods> selectBySid(@Param("page") Integer page, @Param("size") Integer size,@Param("sid") Integer sid);
}
