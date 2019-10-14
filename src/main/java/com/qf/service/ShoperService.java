package com.qf.service;

import com.qf.domain.Shoper;
import com.qf.domain.User;
import com.qf.response.ResponseShoper;
import com.qf.response.ResponseUser;

public interface ShoperService {
    ResponseShoper selectAllS(Integer page, Integer size);
    Shoper saveS(Shoper shoper);
    void deleteS(Integer sid);
    Shoper selectOneS(Integer sid);
    Shoper save(Shoper shoper);
    Shoper findByName(String name);
    Shoper findBySname(String sname);
}
