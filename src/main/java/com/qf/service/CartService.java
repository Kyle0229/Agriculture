package com.qf.service;

import com.qf.domain.Cart;

import java.util.List;

public interface CartService {
    List<Cart> selectAll();

    int addOne();
}
