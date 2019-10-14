package com.qf.service;

import com.qf.domain.Cart;
import com.qf.domain.Product;

import java.util.List;

public interface ProductService {

	/**
	 * 获取所有产品列表
	 * @return
	 */
	public List<Product> getProducts();
	
	/**
	 * 根据产品ID查询产品详情
	 * @param productId
	 * @return
	 */
	public Product getProductById(String productId);

	void save(List<Cart> list);

	void deleteAll();
}
