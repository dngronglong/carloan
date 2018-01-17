package org.project.loan.customermag.controller;

import javax.annotation.Resource;

import org.project.loan.beans.CustomerBean;
import org.project.loan.customermag.service.ICustomerReadService;
import org.project.loan.customermag.service.ICustomerWriteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/customers")
@Controller
public class CustomerController {
	
	@Resource
	private ICustomerReadService customerReadServiceImpl;
	
	@Resource
	private ICustomerWriteService customerWriteServiceImpl;
	
	@RequestMapping(value="/id")
	public  @ResponseBody CustomerBean findCustomerById(@RequestBody int id) {
		
		return customerReadServiceImpl.findCustomerById(id);
	}
	
	@RequestMapping(value="/add")
	public @ResponseBody void addConstomer(@RequestBody CustomerBean constomer) {
		System.out.println(constomer);
		customerWriteServiceImpl.addConstomer(constomer);
		
	}
	
	@RequestMapping(value="/update")
	public @ResponseBody void updateCustomerByCustomer(@RequestBody CustomerBean constomer) {
		customerWriteServiceImpl.updateCustomerByCustomer(constomer);
	}
}
