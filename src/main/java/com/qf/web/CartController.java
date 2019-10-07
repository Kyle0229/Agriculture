package com.qf.web;

import com.qf.domain.Cart;
import com.qf.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class CartController {
    @Resource
    CartService cartServiceImpl;
    @RequestMapping("/selectCartAll")
    public List<Cart> selectCartAll(){
        List<Cart> list = cartServiceImpl.selectAll();
        return list;
    }
    @RequestMapping("/addCart")
    public String addCart(){
        int res =cartServiceImpl.addOne();
        return "1";
    }
}
