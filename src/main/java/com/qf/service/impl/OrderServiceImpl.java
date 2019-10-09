package com.qf.service.impl;

import com.qf.dao.OrderRespository;
import com.qf.domain.Cart;
import com.qf.domain.Order;
import com.qf.mapper.OrderMapper;
import com.qf.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    OrderMapper orderMapper;
    @Resource
    OrderRespository orderRespository;
    @Override
    public void save(List<Cart> list) {
        for (Cart cart : list) {
           orderMapper.save(cart);
        }
    }

    @Override
    public List<Order> selectByUid(Integer uid) {

        return  orderMapper.selectByUid(uid);
    }
}
