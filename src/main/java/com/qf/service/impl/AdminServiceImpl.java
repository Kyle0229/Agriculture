package com.qf.service.impl;

import com.qf.dao.AdminRespository;
import com.qf.domain.Admins;
import com.qf.domain.Shoper;
import com.qf.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminServiceImpl implements AdminService {
    @Resource
    AdminRespository adminRespository;
    @Override
    public Admins findByApname(String name) {
        return adminRespository.findByApname(name);
    }
}
