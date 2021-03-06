package com.qf.dao;

import com.qf.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<User,Integer> {
    User findByName(String name);
}
