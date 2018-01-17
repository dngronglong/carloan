package org.project.loan.productsmag.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.project.loan.beans.ProductBean;
import org.project.loan.productsmag.dao.ProductsDao;
import org.project.loan.productsmag.mapper.ProductsMapping;
import org.springframework.stereotype.Repository;

@Repository
public class ProductsDaoImpl  implements ProductsDao{

	@Resource
	private ProductsMapping productsMapping;

	
	@Override
	public List<ProductBean> findProductAll() {
		return productsMapping.findProductAll();
	}

}
