package org.project.loan.honormag.service;

import org.project.loan.beans.HonorBean;

public interface IHonorReadService {
	
	/**
	 * 根据id查询用户的信用信息
	 * @param id
	 * @return
	 */
	public HonorBean findHonorById(int id);

}
