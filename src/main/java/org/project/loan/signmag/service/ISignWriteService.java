package org.project.loan.signmag.service;

import org.project.loan.beans.SignBean;

public interface ISignWriteService {
	
	/**
	 * 添加签约信息
	 * @param sign
	 */
	public void addSign(SignBean sign);
	
	/**
	 * 修改签约信息
	 * @param sign
	 */
	public void updateSign(SignBean sign);
	/**
	 * 删除签约合同
	 * @param sign
	 */
	public void deleteSign(SignBean sign);

}
