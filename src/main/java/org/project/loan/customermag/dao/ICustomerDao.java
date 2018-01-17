package org.project.loan.customermag.dao;


import org.project.loan.beans.CustomerBean;

public interface ICustomerDao {
	
	/**
	 * 根据id查询用户基本信息
	 * @param id
	 * @return
	 */
	
	 public  CustomerBean findCustomerById(int id);
	 
	

}
