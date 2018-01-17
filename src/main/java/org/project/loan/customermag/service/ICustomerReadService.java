package org.project.loan.customermag.service;

import org.project.loan.beans.CustomerBean;





public interface ICustomerReadService {
	

	
	/**
	 * 根据客户的id查询基本信息
	 * @param id
	 * @return
	 */
	public CustomerBean findCustomerById(int id);

}
