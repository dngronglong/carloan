package org.project.loan.customermag.mapper;


import org.project.loan.beans.CustomerBean;

public interface CustomerMapper {
	/**
	 * 根据id查询用户基本信息
	 * @param id
	 * @return
	 */
	
	 public  CustomerBean findCustomerById(int id);
	 
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
