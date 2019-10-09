package com.qf.web;

import com.qf.domain.User;
import com.qf.response.ResponseUser;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/selectAllU/{page}/{size}")
    public ResponseUser selectAll(@PathVariable Integer page,@PathVariable Integer size){
        return userService.selectAllU(page,size);
    }
    @RequestMapping("/saveU")
    public void save(@RequestBody User user){
        userService.save(user);
    }
    @RequestMapping("/deleteU/{uid}")
    public String delete(@PathVariable Integer uid) {
        userService.delete(uid);
        return "删除成功";
    }
    @RequestMapping("/selectOneU")
    public User selectOne (@RequestParam("uid") Integer uid){
        return userService.selectOne(uid);
    }
    @RequestMapping("/updateU")
    public String update(@RequestBody User user){
        userService.save(user);
        return "修改成功";
    }
}
