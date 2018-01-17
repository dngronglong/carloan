package org.project.loan.honormag.service;

import org.project.loan.beans.HonorBean;

public interface IHonorWriteService {
	
	/**
	 * 添加信用信息
	 * @param honor
	 */
	public void addHonor(HonorBean honor);
	
	/**
	 * 修改信用信息
	 * @param honor
	 */
	public void updateHonor(HonorBean honor);

}
