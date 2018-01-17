package org.project.loan.productsmag.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.project.loan.beans.ProductBean;
import org.project.loan.productsmag.dao.ProductsDao;
import org.project.loan.productsmag.service.ProductsReadService;
import org.springframework.stereotype.Service;


@Service
public class ProductsServiceImpl  implements ProductsReadService {
	
     @Resource
	private ProductsDao productsDao;

	@Override
	public List<ProductBean> findProductsAll() {
		// TODO Auto-generated method stub
		return productsDao.findProductAll();
	}
	

}
