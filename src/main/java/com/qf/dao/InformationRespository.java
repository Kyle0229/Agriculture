package com.qf.dao;

import com.qf.domain.Information;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InformationRespository extends JpaRepository<Information,Integer> {
}
