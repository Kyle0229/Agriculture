package com.qf.web;

import com.qf.config.ShiroConfig;
import com.qf.dao.SysPermissionRepository;
import com.qf.domain.SysPermission;
import com.qf.domain.User;
import com.qf.request.UserCode;
import com.qf.service.CodeService;
import com.qf.service.UserService;
import com.qf.utils.EmailUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @Resource
    private UserService userService;
    @Resource
    private EmailUtils emailUtils;
    @Resource
    private CodeService codeService;

    @Resource
    private SysPermissionRepository sysPermissionMapper;

    @Resource
    private ShiroConfig shiroConfig;

    @RequestMapping("/sendEmail")
    public String send(@RequestBody User user){
        String userEmail=user.getEmail();
        String s =emailUtils.sendMail(userEmail);
        if (!s.isEmpty()){
            return s;
        }else {
            return "失败";
        }
    }
    /*
     * 注册
     */
    @RequestMapping("/register")
    public String register(@RequestBody UserCode userCode){
        String msg="";
        User user=userCode.getUser();
        String code=userCode.getCode();
        String email=user.getEmail();
        String name=user.getName();
        if (userService.findByName(name)!=null){
            msg="用户名已存在";
            return msg;
        }

        int i=codeService.sendTo(user,code);

        if (i!=1) {
            if (i == 2) {
                msg = "验证码已失效";

            }else if (i == 3) {
                msg = "验证码错误";

            }
            return msg;
        }else {
          userService.save(user);
            return "success";
        }
    }
    /*
     * 登录
     */
    @RequestMapping("/login")
    public String login(@RequestBody User user){
        String name= user.getName();
        String password=user.getPassword();
        org.apache.shiro.subject.Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(name, password);
        try{
            subject.login(token);
            if (subject.isAuthenticated()){

                List<SysPermission> list=sysPermissionMapper.selectPermissionByLoginName(name);

                List<Integer> a=new ArrayList<>();
                int b=0;
                for (int i=0;i<list.size();i++){
                    b= list.get(i).getPermissionId();
                    if (b==2){
                        return "for";
                    }
                    a.add(b);
                }

                return "success";
            }else {
                return "fail";
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return "null";
    }


}
