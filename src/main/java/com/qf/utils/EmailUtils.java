package com.qf.utils;

import com.qf.dao.CodeRepository;
import com.qf.domain.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import com.qf.dao.CodeRepository;
import com.qf.domain.Code;

import java.util.Date;
import java.util.Random;

/**
 * Created by 54110 on 2019-09-19.
 */
@Component
public class EmailUtils {

    @Value("${spring.mail.username}")
    private String from;

    @Autowired
    private JavaMailSender javamailSender;

    @Autowired
    private CodeRepository codeRepository;

    //sendTo：用户注册时输入的邮箱
    public String sendMail(String sendTo){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setSubject("注册验证码");
        String code = randomCode();
        simpleMailMessage.setText(code);
        simpleMailMessage.setFrom(from);
        simpleMailMessage.setTo(sendTo);
        try{
            javamailSender.send(simpleMailMessage);
            if (codeRepository.findByUserEmail(sendTo)!=null){
                Code co =codeRepository.findByUserEmail(sendTo);
                co.setCode(code);
                co.setCreateTime(new Date());
                codeRepository.save(co);
            }else {
                Code co = new Code();
                co.setCreateTime(new Date());
                co.setCode(code);
                co.setUserEmail(sendTo);
                //设置当前验证码得状态
                co.setStatus(1);
                codeRepository.save(co);
            }
            return code;

        }catch (Exception e){
            e.printStackTrace();
        }
        return "";
    }

    public static String randomCode(){
        Random random = new Random();
        StringBuffer str = new StringBuffer();

        for (int i =0 ;i< 6;i++){
            int i1 = random.nextInt(9);
            str.append(i1);
        }
        return str.toString();
    }
}
