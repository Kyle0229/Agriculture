package com.qf.service.impl;

import com.qf.mapper.CodeRepository;
import com.qf.domain.Code;
import com.qf.domain.User;
import com.qf.service.CodeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class CodeServiceImpl implements CodeService {

    @Resource
    private CodeRepository codeRepository;

    @Override
    public int sendTo(User user, String code) {
        String useremail = user.getEmail();
        Code co = codeRepository.findByUserEmail(useremail);
        Date createTime = co.getCreateTime();
        Date nowTime = new Date();
        int i = nowTime.compareTo(createTime);
        System.out.println(i);
        if (i >= 600) {
            //失效
            co.setStatus(0);
            codeRepository.save(co);
            return 2;
        } else {
            if (co.getCode().equals(code)) {
                co.setStatus(0);
                codeRepository.update(co);
                return 1;
            } else {

                return 3;
            }
        }
        // return 1;
    }
    }



