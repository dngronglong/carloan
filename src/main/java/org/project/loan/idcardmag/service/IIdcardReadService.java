package org.project.loan.idcardmag.service;

import org.project.loan.beans.CustomerBean;
import org.project.loan.beans.IdCardBean;

public interface IIdcardReadService {
	
	/**
	 * 根据id查询身份证信息
	 * @param id
	 */
	public IdCardBean findIdCardById(int id);
	
}
