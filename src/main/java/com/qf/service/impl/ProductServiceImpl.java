package com.qf.service.impl;

import com.qf.domain.Cart;
import com.qf.domain.Product;
import com.qf.domain.ProductExample;
import com.qf.mapper.ProductMapper;
import com.qf.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

	@Resource
	private ProductMapper productMapper;
	
	@Override
	public List<Product> getProducts() {
		
		ProductExample pe = new ProductExample();
//		Criteria pc = pe.createCriteria();
		List<Product> list = productMapper.selectByExample(pe);
		
		return list;
	}

	@Override
	public Product getProductById(String productId) {
		
		return productMapper.selectByPrimaryKey(productId);
	}

	@Override
	public void save(List<Cart> list) {
		for (Cart cart : list) {
			productMapper.save(cart);
		}

	}

	@Override
	public void deleteAll() {
		productMapper.deleteAll();
	}

}
