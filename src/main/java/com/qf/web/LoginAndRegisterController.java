package com.qf.web;

import com.qf.config.ShiroConfig;
import com.qf.domain.Admins;
import com.qf.domain.Cart;
import com.qf.domain.Shoper;
import com.qf.domain.User;
import com.qf.enums.LoginType;
import com.qf.mapper.SysPermissionRepository;
import com.qf.request.UserCode;
import com.qf.service.*;
import com.qf.shiro.CustomizedToken;
import com.qf.utils.EmailUtils;
import org.apache.shiro.SecurityUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class LoginAndRegisterController {
    private static final String USER_LOGIN_TYPE = LoginType.USER.toString();
    private static final String SHOPER_LOGIN_TYPE = LoginType.SHOPER.toString();
    private static final String ADMIN_LOGIN_TYPE = LoginType.ADMINS.toString();
    @Resource
    private UserService userService;
    @Resource
    private ShoperService shoperService;
    @Resource
    private AdminService adminService;
    @Resource
    private EmailUtils emailUtils;
    @Resource
    private CodeService codeService;
    @Resource
    private CartService cartService;
    @Resource
    private SysPermissionRepository sysPermissionMapper;

    @Resource
    private ShiroConfig shiroConfig;

    @RequestMapping("/sendEmail")
    public String send(@RequestParam("email") String userEmail){
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
    public String login(@RequestBody User user, HttpSession session){
        String name= user.getName();
        String password=user.getPassword();
        org.apache.shiro.subject.Subject subject = SecurityUtils.getSubject();

        CustomizedToken token = new CustomizedToken(name, password,USER_LOGIN_TYPE);
        try{
            subject.login(token);
            if (subject.isAuthenticated()){
                User checkuser = userService.findByName(name);
                List<Cart> cart = cartService.selectAllByUid(checkuser.getUid());
                System.out.println(cart.toString());
                session.setAttribute("user",checkuser);
                session.setAttribute("cart",cart);
//                List<SysPermission> list=sysPermissionMapper.selectPermissionByLoginName(name);
//
//                List<Integer> a=new ArrayList<>();
//                int b=0;
//                for (int i=0;i<list.size();i++){
//                    b= list.get(i).getPermissionId();
//                    if (b==2){
//                        return "for";
//                    }
//                    a.add(b);
//                }

                return "success";
            }else {
                return "fail";
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return "null";
    }
    @RequestMapping("/findSession")
    public User findSession(HttpSession session){
        User user = (User)session.getAttribute("user");
        return user;
    }
    @RequestMapping("/findShoper")
    public Shoper findShoper(HttpSession session){
        Shoper shoper = (Shoper)session.getAttribute("shoper");
        return shoper;
    }
    @RequestMapping("/findAdmin")
    public Admins findAdmin(HttpSession session){
        Admins admin = (Admins)session.getAttribute("admin");
        return admin;
    }
    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("user");
        return "1";
    }
    @RequestMapping("/adminlogout")
    public String adminlogout(HttpSession session){
        session.removeAttribute("admin");
        return "1";
    }
    @RequestMapping("/shoperlogout")
    public String shoperlogout(HttpSession session){
        session.removeAttribute("shoper");
        return "1";
    }
    @RequestMapping("/shoperlogin")
    public String shoperlogin(@RequestBody Shoper shoper, HttpSession session){
        String name= shoper.getSname();
        String password=shoper.getSpassword();
        org.apache.shiro.subject.Subject subject = SecurityUtils.getSubject();

        CustomizedToken token = new CustomizedToken(name, password,SHOPER_LOGIN_TYPE);
        try{
            subject.login(token);
            if (subject.isAuthenticated()){
                Shoper checkuser = shoperService.findByName(name);

                session.setAttribute("shoper",checkuser);
//                List<SysPermission> list=sysPermissionMapper.selectPermissionByLoginName(name);
//
//                List<Integer> a=new ArrayList<>();
//                int b=0;
//                for (int i=0;i<list.size();i++){
//                    b= list.get(i).getPermissionId();
//                    if (b==2){
//                        return "for";
//                    }
//                    a.add(b);
//                }

                return "success";
            }else {
                return "fail";
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return "null";
    }
    @RequestMapping("/adminlogin")
    public String adminlogin(@RequestBody Admins admin, HttpSession session){
        String name= admin.getApname();
        String password=admin.getAppassword();
        org.apache.shiro.subject.Subject subject = SecurityUtils.getSubject();

        CustomizedToken token = new CustomizedToken(name, password,ADMIN_LOGIN_TYPE);
        try{
            subject.login(token);
            if (subject.isAuthenticated()){
                Admins checkuser = adminService.findByApname(name);

                session.setAttribute("admin",checkuser);
//                List<SysPermission> list=sysPermissionMapper.selectPermissionByLoginName(name);
//
//                List<Integer> a=new ArrayList<>();
//                int b=0;
//                for (int i=0;i<list.size();i++){
//                    b= list.get(i).getPermissionId();
//                    if (b==2){
//                        return "for";
//                    }
//                    a.add(b);
//                }

                return "success";
            }else {
                return "fail";
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return "null";
    }
    /*
     * 注册
     */
    @RequestMapping("/shoperRegister")
    public String register(@RequestBody Shoper shoper){
        String msg="";
        String name=shoper.getSname();
        if (shoperService.findBySname(name)!=null){
            msg="用户名已存在";
            return msg;
        } else {
            shoperService.save(shoper);
            return "success";
        }
    }
}
