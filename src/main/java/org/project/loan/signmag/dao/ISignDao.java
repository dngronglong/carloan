package org.project.loan.signmag.dao;

import org.project.loan.beans.SignBean;

public interface ISignDao {
	
	/**
	 * 根据id查询签约信息
	 * @param id
	 * @return
	 */
	public SignBean findSignById(int id);


}
