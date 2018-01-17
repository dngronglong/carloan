package org.project.loan.contractmag.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.project.loan.beans.PagerBean;
import org.project.loan.contractmag.service.IContractReadService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/contract")
@RestController
public class ContarctController {
	
	@Resource
	private IContractReadService contractReadServiceImpl;
	
	@RequestMapping(value="/contractList",produces= {"application/json;charset=utf-8"})
	public PagerBean contractList(int page,int rows,String contractNumber,String customerName,String contractCompanyname,int contractStatus ) {
		Map params = new HashMap<>();
		params.put("contractNumber", contractNumber);
		params.put("contractStatus", contractStatus);
		params.put("contractCompanyname", contractCompanyname);
		System.out.println(contractStatus);
		System.out.println(contractNumber);
		System.out.println(contractCompanyname);
		PagerBean pager = new PagerBean(page,rows,params);
		System.out.println("访问了身份证管理页面");
		
		return contractReadServiceImpl.findContractByPage(pager);																																																																																																																																																						
		
		
		
	}

}
