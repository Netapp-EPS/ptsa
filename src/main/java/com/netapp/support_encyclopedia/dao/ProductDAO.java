package com.netapp.support_encyclopedia.dao;

import java.util.List;

import com.netapp.support_encyclopedia.model.Product;

public interface ProductDAO {
	
	public List<Product> getAllProducts();
	
	public void saveOrUpdateProduct(Product product );
	
	public void deleteProduct(Long id);
	
	public Product getProductById(String id);
	

}
