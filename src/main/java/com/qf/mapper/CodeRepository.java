package com.qf.mapper;

import com.qf.domain.Code;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
@Mapper
public interface CodeRepository{

    Code findByUserEmail(String userEmail);
    int save(Code code);
    int update(Code co);
}
