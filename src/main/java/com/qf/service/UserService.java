package com.qf.service;

import com.qf.domain.User;

public interface UserService {
    User save(User user);
    User findByName(String name);
}
