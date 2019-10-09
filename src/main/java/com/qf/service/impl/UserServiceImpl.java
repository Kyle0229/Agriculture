package com.qf.service.impl;

import com.qf.dao.UserRespository;
import com.qf.domain.User;
import com.qf.response.ResponseUser;
import com.qf.service.UserService;
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
    }

    @Override
    public void save(User user) {
        userRespository.save(user);
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
