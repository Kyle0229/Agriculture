package com.qf.service;

import com.qf.domain.User;

import java.util.List;


import com.qf.domain.Goods;
import com.qf.domain.User;

import java.util.List;

public interface UserService {
   List<User> selectAllU();
    void delete(Integer uid);
    User selectOne(Integer uid);
    User save(User user);
    User findByName(String name);
}
