package com.qf.service.impl;

import com.qf.dao.UserRespository;
import com.qf.domain.User;
import com.qf.response.ResponseUser;
import com.qf.service.UserService;
import com.qf.utils.Md5Password;
import com.qf.utils.Md5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRespository userRespository;
    @Override
    public ResponseUser selectAllU(Integer page, Integer size) {
        Pageable pages=PageRequest.of(page-1,size);
        Page<User> all=userRespository.findAll(pages);
        ResponseUser res=new ResponseUser();
        res.setList(all.getContent());
        res.setTotal(all.getTotalElements());
        return res;
    public User save(User user) {
        String password=user.getPassword();
        String password1 =Md5Utils.encryptPassword(password,"likun");
        user.setPassword(password1);
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
