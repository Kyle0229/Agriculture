package com.qf.dao;
import com.qf.domain.Admins;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRespository extends JpaRepository<Admins,Integer> {
    Admins findByApname(String name);
}
