package com.qf.service;

import com.qf.domain.Cart;
import com.qf.domain.Order;

import java.util.List;

public interface OrderService {
    void save(List<Cart> list);

    List<Order> selectByUid(Integer uid);
}
