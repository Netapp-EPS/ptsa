package com.netapp.support_encyclopedia.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.netapp.support_encyclopedia.model.Product;

@Repository("productDAO")
public class ProductDAOImpl extends AbstractDao implements ProductDAO{
	

	@SuppressWarnings("unchecked")
	public List<Product> getAllProducts() {
		Criteria criteria=getSession().createCriteria(Product.class);
		
//		List<ProductModel> prodModelList=new ArrayList<Product>();
//		
//		for(Product prod:(List<Product>)criteria.list()){
//			ProductModel prodModel=new ProductModel();
//			prodModel.setName(prod.getName());
//			prodModel.setId(prod.getId());
//			prodModel.setDl(prod.getDl());
//			prodModelList.add(prodModel);
//			
//		}
		return (List<Product>)criteria.list();
		
//		SQLQuery query=getSession().createSQLQuery("Select * from product where id='1'");
//		query.setCacheable(true);
//		return query.list();
		
	}

	public void saveOrUpdateProduct(Product product) {
		persist(product);
		
	}

	public void deleteProduct(Long id) {
	Product prodToDelete=(Product)getSession().createCriteria(Product.class).add(Restrictions.eqOrIsNull("id",id)).uniqueResult();
	getSession().delete(prodToDelete);
	}

	@Override
	public Product getProductById(String id) {	
		
		Criteria criteria=getSession().createCriteria(Product.class);
		criteria.add(Restrictions.eqOrIsNull("id", id));
		return (Product)criteria.list().get(0);}
	
	

}
