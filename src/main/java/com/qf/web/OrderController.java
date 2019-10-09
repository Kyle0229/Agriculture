package com.qf.web;

import com.qf.domain.Cart;
import com.qf.domain.Order;
import com.qf.domain.User;
import com.qf.service.OrderService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class OrderController {
    @Resource
    OrderService orderService;
    @RequestMapping("/addOrder")
    public String addOrder(@RequestBody List<Cart> list){
        orderService.save(list);
        return"success";

    }
    @RequestMapping("/selectAllByUid")
    public List<Order>selectAllByUid(HttpSession session){
        User user = (User)session.getAttribute("user");
       List<Order> order =orderService.selectByUid(user.getUid());
        return order;

    }
}
