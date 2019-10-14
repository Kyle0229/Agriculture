package com.qf.web;

import com.qf.domain.Cart;
import com.qf.domain.User;
import com.qf.service.CartService;
import com.qf.service.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class CartController {
    @Resource
    CartService cartServiceImpl;
    @Resource
    ProductService productService;
    @RequestMapping("/selectCartAll")
    public List<Cart> selectCartAllByUid(HttpSession session) {
        User user = (User) session.getAttribute("user");
        List<Cart> list = cartServiceImpl.selectAllByUid(user.getUid());
        return list;
    }

    @RequestMapping("/addCart")
    public String addCart(@RequestParam("id") Integer gid,@RequestParam("num") Integer num
            , HttpSession session) {
        Integer res = cartServiceImpl.addOne(gid,num, session);
        return res.toString();
    }

    @RequestMapping("/cartCount")
    public String cartCount(HttpSession session) {
        if (session.getAttribute("user") == null) {
            return "0";
        }
        Integer res = cartServiceImpl.selectCount(session);
        return res.toString();
    }

    @RequestMapping("/deleteCart")
    @ResponseBody
    public String deleteCart(HttpSession session) {
        int res=0;
        List<Cart> cart = (List<Cart>) session.getAttribute("orderlist");
        System.out.println(cart.toString());
        for (Cart cart1 : cart) {

          res =  cartServiceImpl.deleteOne(cart1.getCaid(), cart1.getUid());
        }
          productService.deleteAll();
        if(res==1) {
            return "success";
        }else{
            return "fail";
        }
    }
}
