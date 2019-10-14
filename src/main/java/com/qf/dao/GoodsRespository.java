package com.qf.dao;

import com.qf.domain.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface GoodsRespository extends JpaRepository<Goods,Integer> {
}
