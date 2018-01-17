package org.project.loan.signmag.service;

import org.project.loan.beans.SignBean;

public interface ISignReadService {
	
	/**
	 * 根据id查询签约信息
	 * @param id
	 * @return
	 */
	public SignBean findSignById(int id);

}
