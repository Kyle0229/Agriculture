package com.qf.dao;

import com.qf.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
@Mapper
public interface UserMapper  {

    /*User findByUserName(@Param("username")String username);
    void insert(User userLogin);*/
}
