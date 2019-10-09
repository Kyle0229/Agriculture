package com.qf.dao;

import com.qf.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRespository extends JpaRepository<Order,Integer> {
}
