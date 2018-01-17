package org.project.loan.productsmag.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.project.loan.beans.ProductBean;

public interface ProductsMapping {
	
	@ResultType(ProductBean.class)
	@Select("select products_id as productsId  ,products_name as productsName ,products_periods as productsPeriods ,products_rate as productsRate ,products_maxmoney as  productsMaxmoney  from t_products  ")
	public List<ProductBean> findProductAll();
	
	@ResultType(ProductBean.class)
	@Select("select products_id as productsId  ,products_name as productsName ,products_periods as productsPeriods ,products_rate as productsRate ,products_maxmoney as  productsMaxmoney  from t_products where products_id=#{id}")
	public ProductBean findProductbyId(@Param("id") int id);

}
