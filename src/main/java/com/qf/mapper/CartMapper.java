package com.qf.mapper;

import com.qf.domain.Cart;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CartMapper {

    Cart selectOneByNameAndUid(@Param("name") String gname, @Param("uid") Integer uid);

    List<Cart> selectAllByUid(Integer uid);

    Integer selectCount(Integer uid);

    int deleteOne(@Param("caid") Integer caid, @Param("uid") Integer uid);
}
