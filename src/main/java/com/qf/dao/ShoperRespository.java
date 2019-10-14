package com.qf.dao;

import com.qf.domain.Shoper;
import com.qf.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoperRespository extends JpaRepository<Shoper,Integer> {
    Shoper findBySname(String name);
}
