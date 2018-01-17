package org.project.loan.contractmag.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.project.loan.beans.ContractBean;
import org.project.loan.beans.PagerBean;

public interface ContractMapper {
	/**
	 * 根据分页page查询合同信息，并返回合同的集合
	 * @param page
	 * @return
	 */	
	
	public List<ContractBean>  findContractByPage(@Param("pager") PagerBean pager);
	
	
	/**
	 * 根据分页page查询合同信息的条数
	 * @param page
	 * @return
	 */	
	public int gettotal(@Param("pager") PagerBean pager);

}
