package org.project.loan.customermag.service;

import org.project.loan.beans.CustomerBean;

public interface ICustomerWriteService{
	
	
	/**
	 * 添加客户的基本信息
	 * @param constomer
	 */
	public void addConstomer(CustomerBean constomer);
	
	/**
	 * 修改客户的基本信息
	 * @param constomer
	 */
	public void updateCustomerByCustomer(CustomerBean constomer);

}
