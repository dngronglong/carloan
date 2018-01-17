package org.project.loan.contractmag.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.project.loan.beans.ContractBean;
import org.project.loan.beans.PagerBean;

public interface IContractDao {

	/**
	 * 根据分页条件查询合同信息，并返回合同的集合
	 * @param page
	 * @return
	 */
	public PagerBean  findContractByPage(PagerBean pager);
}
