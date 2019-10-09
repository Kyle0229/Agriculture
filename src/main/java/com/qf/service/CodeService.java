package com.qf.service;

import com.qf.domain.Code;
import com.qf.domain.User;

public interface CodeService {

    int sendTo(User user, String code); //生成验证码
}
