package com.qf.service.impl;

import com.qf.dao.ShoperRespository;
import com.qf.dao.UserRespository;
import com.qf.domain.Shoper;
import com.qf.domain.User;
import com.qf.response.ResponseShoper;
import com.qf.response.ResponseUser;
import com.qf.service.ShoperService;
import com.qf.service.UserService;
import com.qf.utils.Md5Password;
import com.qf.utils.Md5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
public class ShoperServiceImpl implements ShoperService {
    @Resource
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
    public Shoper save(Shoper shoper) {
        String password=shoper.getSpassword();
        String password1 =Md5Utils.encryptPassword(password,"likun");
        shoper.setSpassword(password1);
        Shoper save=shoperRespository.save(shoper);
        return save;
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

    @Override
    public Shoper findByName(String name) {
        return shoperRespository.findBySname(name);
    }


    @Override
    public Shoper findBySname(String sname) {
        return shoperRespository.findBySname(sname);
    }
}