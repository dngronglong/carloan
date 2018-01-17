package org.project.loan.customermag.dao.impl;

import javax.annotation.Resource;

import org.project.loan.beans.CustomerBean;
import org.project.loan.customermag.dao.ICustomerDao;
import org.project.loan.customermag.mapper.CustomerMapper;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDaoImpl implements ICustomerDao {
	
	@Resource
	private CustomerMapper cm;
	
	@Override
	public CustomerBean findCustomerById(int id) {
		// TODO Auto-generated method stub
		return cm.findCustomerById(id);
	}

	

}
