package com.qf.service;

import com.qf.domain.User;

public interface UserService {
    User save(User user);
    User findByName(String name);
import com.qf.domain.Goods;
import com.qf.domain.User;

import java.util.List;

public interface UserService {
   List<User> selectAllU();
    void save(User user);
    void delete(Integer uid);
    User selectOne(Integer uid);
}
