package org.project.loan.customermag.service.impl;

import javax.annotation.Resource;

import org.project.loan.beans.CustomerBean;
import org.project.loan.customermag.dao.ICustomerDao;
import org.project.loan.customermag.service.ICustomerReadService;
import org.springframework.stereotype.Service;

@Service
public class CustomerReadServiceImpl implements ICustomerReadService {
	
	@Resource
	private ICustomerDao customerDaoImpl;
	
	@Override
	public CustomerBean findCustomerById(int id) {
		// TODO Auto-generated method stub
		return customerDaoImpl.findCustomerById(id);
				
	}

}
