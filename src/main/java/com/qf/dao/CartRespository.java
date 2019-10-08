package com.qf.dao;

import com.qf.domain.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRespository extends JpaRepository<Cart,Integer> {
}
