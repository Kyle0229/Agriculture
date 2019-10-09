package com.qf.service;

import com.qf.domain.Goods;
import com.qf.domain.User;
import com.qf.response.ResponseUser;

import java.util.List;

public interface UserService {
    ResponseUser selectAllU(Integer page, Integer size);
    void save(User user);
    void delete(Integer uid);
    User selectOne(Integer uid);
    User findByName(String name);
}
