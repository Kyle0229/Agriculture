package com.qf.web;

import com.qf.domain.Cart;
import com.qf.domain.User;
import com.qf.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class CartController {
    @Resource
    CartService cartServiceImpl;
    @RequestMapping("/selectCartAll")
    public List<Cart> selectCartAllByUid(HttpSession session){
        User user = (User)session.getAttribute("user");
        List<Cart> list = cartServiceImpl.selectAllByUid(user.getUid());
        return list;
    }
    @RequestMapping("/addCart")
    public String addCart(@RequestParam("id")Integer gid, HttpSession session){
        Integer res =cartServiceImpl.addOne(gid,session);
        return res.toString();
    }
}
