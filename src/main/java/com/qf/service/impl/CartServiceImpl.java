package com.qf.service.impl;

import com.qf.dao.CartRespository;
import com.qf.domain.Cart;
import com.qf.domain.Goods;
import com.qf.domain.User;
import com.qf.mapper.CartMapper;
import com.qf.mapper.GoodsMapper;
import com.qf.service.CartService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;
@Service
public class CartServiceImpl implements CartService {
    @Resource
    CartRespository cartRespository;
    @Resource
    GoodsMapper goodsMapper;
    @Resource
    CartMapper cartMapper;
    @Override
    public List<Cart> selectAll() {
        return cartRespository.findAll();
    }

    @Override
    public int addOne(Integer gid, HttpSession session) {
        User user =(User)session.getAttribute("user");
        Goods goods=goodsMapper.selectOneByGid(gid);
        Cart cart = cartMapper.selectOneByNameAndUid(goods.getGname(),user.getUid());
        if(cart!=null){
            cart.setCacount(cart.getCacount()+1);
            cart.setCatotalprice(cart.getOaprice()*cart.getCacount());
            cartRespository.save(cart);
        }else{
            cart =new Cart();
            cart.setCaname(goods.getGname());
            cart.setCacount(1);
            cart.setUid(user.getUid());
            cart.setOaprice(goods.getOaprice());
            cart.setCatotalprice(goods.getOaprice());
            cartRespository.save(cart);
        }

        return 1;
    }

    @Override
    public List<Cart> selectAllByUid(Integer uid) {
        return cartMapper.selectAllByUid(uid);
    }

    @Override
    public Integer selectCount(HttpSession session) {
        User user = (User) session.getAttribute("user");
        return cartMapper.selectCount(user.getUid());
    }
}
