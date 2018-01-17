package org.project.loan.contractmag.service.impl;

import javax.annotation.Resource;

import org.project.loan.beans.PagerBean;
import org.project.loan.contractmag.dao.IContractDao;
import org.project.loan.contractmag.service.IContractReadService;
import org.springframework.stereotype.Service;

@Service
public class ContractReadServiceImpl implements IContractReadService {
	
	@Resource
	private IContractDao contractDaoImpl;

	@Override
	public PagerBean findContractByPage(PagerBean pager) {
		// TODO Auto-generated method stub	
		return contractDaoImpl.findContractByPage(pager);
	}

}
