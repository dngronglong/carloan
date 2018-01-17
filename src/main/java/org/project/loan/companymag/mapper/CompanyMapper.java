package org.project.loan.companymag.mapper;

import java.util.List;

import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.project.loan.beans.CompanyBean;

public interface CompanyMapper {
	
	
	@ResultType(CompanyBean.class)
	@Select("select company_id as companyId ,company_name as companyName from t_company  ")
	public List<CompanyBean> findCompanyAll();

}
