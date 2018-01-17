package org.project.loan.companymag.controller;

import java.util.List;

import javax.annotation.Resource;

import org.project.loan.beans.CompanyBean;
import org.project.loan.companymag.service.ICompanyService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/company")
@RestController
public class CompanyController {
	
	@Resource
	private ICompanyService companyServiceImpl;
	
	@RequestMapping(value="/companyList",produces= {"application/json;charset=utf-8"})
	public  List<CompanyBean> companyList(){
		
		return companyServiceImpl.findCompanyAll();
		
	}

}
