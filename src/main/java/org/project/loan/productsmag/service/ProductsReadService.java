package org.project.loan.productsmag.service;

import java.util.List;

import org.project.loan.beans.ProductBean;

public interface ProductsReadService {
	
	/**
	 * 查询所有的车贷产品
	 * @return
	 */
	public List<ProductBean> findProductsAll();

}
