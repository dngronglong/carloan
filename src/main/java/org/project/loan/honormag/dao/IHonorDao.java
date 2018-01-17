package org.project.loan.honormag.dao;

import org.project.loan.beans.HonorBean;

public interface IHonorDao {
	
	/**
	 * 根据id查询客服的信用信息
	 * @param honor
	 * @return
	 */
	public HonorBean findHonorById(int id);

}
