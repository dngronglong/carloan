package org.project.loan.companymag.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.project.loan.beans.CompanyBean;
import org.project.loan.companymag.dao.ICompanyDao;
import org.project.loan.companymag.mapper.CompanyMapper;
import org.springframework.stereotype.Repository;

@Repository
public class CompanyDaoImpl implements ICompanyDao {
	
	@Resource
	private CompanyMapper companyMapper;

	@Override
	public List<CompanyBean> findCompanyAll() {
		// TODO Auto-generated method stub
		
		return companyMapper.findCompanyAll();
	}

}
