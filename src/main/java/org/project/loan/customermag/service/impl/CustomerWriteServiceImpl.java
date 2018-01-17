package org.project.loan.customermag.service.impl;

import javax.annotation.Resource;

import org.project.loan.beans.CustomerBean;
import org.project.loan.customermag.repository.CustomerRepository;
import org.project.loan.customermag.service.ICustomerWriteService;
import org.springframework.stereotype.Service;

@Service
public class CustomerWriteServiceImpl implements ICustomerWriteService{
	
	@Resource
	private CustomerRepository customerRepository;
	
	@Override
	public void addConstomer(CustomerBean constomer) {
		// TODO Auto-generated method stub
		customerRepository.save(constomer);
	}

	@Override
	public void updateCustomerByCustomer(CustomerBean constomer) {
		// TODO Auto-generated method stub
		customerRepository.saveAndFlush(constomer);
	}

}
