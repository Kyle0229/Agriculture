package com.qf.mapper;

import com.qf.domain.Cart;
import com.qf.domain.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
   int save(Cart cart) ;

   List<Order> selectByUid(Integer uid);
}
