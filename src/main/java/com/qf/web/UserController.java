package com.qf.web;

import com.qf.domain.User;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/selectAllU")
    public List<User> selectAll(){
        return userService.selectAllU();
    }
    @RequestMapping("/saveU")
    public void save(@RequestBody User user){
        userService.save(user);
    }
    @RequestMapping("/deleteU")
    public String delete(@RequestBody User user) {
        Integer gid = user.getUid();
        userService.delete(gid);
        return "删除成功";
    }
    @RequestMapping("/selectOneU")
    public User selectOne (@RequestBody User user){
        Integer uid=user.getUid();
        return userService.selectOne(uid);
    }
    @RequestMapping("/updateU")
    public String update(@RequestBody User user){
        userService.save(user);
        return "修改成功";
    }
}
