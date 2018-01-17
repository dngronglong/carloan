package org.project.loan.productsmag.controller;


import java.util.List;
import javax.annotation.Resource;
import org.project.loan.beans.ProductBean;
import org.project.loan.productsmag.service.ProductsReadService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/products")
@RestController
public class ProductsController {
	
	@Resource
	private ProductsReadService productsServiceImpl;
	@RequestMapping(value="/productsList",produces= {"application/json;charset=utf-8"})
	public List<ProductBean>  productsList() {
		return productsServiceImpl.findProductsAll();		
	}
}
