package com.qf.dao;

import com.qf.domain.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodsRespository extends JpaRepository<Goods,Integer> {
}
