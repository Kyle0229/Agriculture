package com.qf.service;

import com.qf.domain.Cart;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface CartService {
    List<Cart> selectAll();

    int addOne(Integer gid ,Integer num, HttpSession session);

    List<Cart> selectAllByUid(Integer uid);

    Integer selectCount(HttpSession session);

    int deleteOne(Integer caid, Integer uid);
}
