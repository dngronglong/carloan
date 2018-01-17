package org.project.loan.idcardmag.dao;

import org.project.loan.beans.CustomerBean;
import org.project.loan.beans.IdCardBean;

public interface IIdCardDao {
	
	/**
	 * 根据id查询身份证信息
	 * @param id
	 */
	public IdCardBean findIdCardById(int id);
	
	
	/**
	 * 添加客户基本信息
	 * @param customer
	 */
	public void addCustomer(CustomerBean customer);

}
