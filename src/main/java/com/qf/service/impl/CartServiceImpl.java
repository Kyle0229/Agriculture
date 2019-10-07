package com.qf.service.impl;

import com.qf.dao.CartRespository;
import com.qf.domain.Cart;
import com.qf.service.CartService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CartServiceImpl implements CartService {
    @Resource
    CartRespository cartRespository;
    @Override
    public List<Cart> selectAll() {
        return cartRespository.findAll();
    }

    @Override
    public int addOne() {

        return 0;
    }
}
