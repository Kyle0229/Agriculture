package com.qf.service.impl;

import com.qf.dao.ShoperRespository;
import com.qf.dao.UserRespository;
import com.qf.domain.Shoper;
import com.qf.domain.User;
import com.qf.response.ResponseShoper;
import com.qf.response.ResponseUser;
import com.qf.service.ShoperService;
import com.qf.service.UserService;
import com.qf.utils.Md5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShoperServiceImpl implements ShoperService {
    @Autowired
    private ShoperRespository shoperRespository;

    @Override
    public ResponseShoper selectAllS(Integer page, Integer size) {
        Pageable pages = PageRequest.of(page - 1, size);
        Page<Shoper> all = shoperRespository.findAll(pages);
        ResponseShoper res = new ResponseShoper();
        res.setList(all.getContent());
        res.setTotal(all.getTotalElements());
        return res;
    }

    @Override
    public Shoper saveS(Shoper shoper) {
        return shoperRespository.save(shoper);
    }

    @Override
    public void deleteS(Integer sid) {
        shoperRespository.deleteById(sid);
    }

    @Override
    public Shoper selectOneS(Integer sid) {
        Optional<Shoper> byId = shoperRespository.findById(sid);
        Shoper shoper=byId.get();
        return shoper;
    }
}