package com.qf.service.impl;

import com.qf.dao.UserRespository;
import com.qf.domain.User;
import com.qf.service.UserService;
import com.qf.utils.Md5Password;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRespository userRespository;
    @Override
    public User save(User user) {
        String password=user.getPassword();
        String name=user.getName();
        Md5Password md5Password=new Md5Password();
        String password1=md5Password.password(password,name);
        user.setPassword(password);
        User save=userRespository.save(user);
        return save;
    }

    @Override
    public User findByName(String name) {
        return userRespository.findByName(name);
    }
    public List<User> selectAllU() {
        return userRespository.findAll();
    }

    @Override
    public void delete(Integer uid) {
        userRespository.deleteById(uid);
    }

    @Override
    public User selectOne(Integer uid) {
        Optional<User> byId = userRespository.findById(uid);
        User user=byId.get();
        return user;
    }
}
