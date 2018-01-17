package org.project.loan.companymag.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.project.loan.beans.CompanyBean;
import org.project.loan.companymag.dao.ICompanyDao;
import org.project.loan.companymag.service.ICompanyService;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements ICompanyService {

	@Resource
	private ICompanyDao companyDaoImpl;
	
	public List<CompanyBean> findCompanyAll() {
		// TODO Auto-generated method stub
		return companyDaoImpl.findCompanyAll();
	}

}
