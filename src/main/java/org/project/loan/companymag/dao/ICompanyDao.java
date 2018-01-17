package org.project.loan.companymag.dao;

import java.util.List;

import org.project.loan.beans.CompanyBean;

public interface ICompanyDao {
	
	public List<CompanyBean> findCompanyAll();

}
