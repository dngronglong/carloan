package org.project.loan.productsmag.dao;

import java.util.List;

import org.project.loan.beans.ProductBean;

public interface ProductsDao {
	
	/**
	 * 查询所有的车贷产品
	 * @return
	 */
	public List<ProductBean> findProductAll();

}
