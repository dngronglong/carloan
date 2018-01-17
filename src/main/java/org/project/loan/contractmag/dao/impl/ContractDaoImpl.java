package org.project.loan.contractmag.dao.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.project.loan.beans.ContractBean;
import org.project.loan.beans.PagerBean;
import org.project.loan.contractmag.dao.IContractDao;
import org.project.loan.contractmag.mapper.ContractMapper;
import org.springframework.stereotype.Repository;

@Repository
public class ContractDaoImpl implements IContractDao {
	@Resource
	private ContractMapper contractMapper;


	@Override
	public PagerBean findContractByPage(PagerBean pager) {
		// TODO Auto-generated method stub
		List<ContractBean> rows = contractMapper.findContractByPage(pager);
		pager.setRows(rows);
		pager.setTotal(contractMapper.gettotal(pager));
		return pager;
	}

}
