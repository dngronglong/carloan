package org.project.loan.idcardmag.service;

import org.project.loan.beans.CustomerBean;
import org.project.loan.beans.IdCardBean;

public interface IIdCradWriteService {
	/**
	 * 添加身份证信息
	 * @param user
	 */
	public void addIdCard(IdCardBean card);
	
	/**
	 * 删除身份证信息
	 * @param user
	 */
	public void deleteIdCardByIdCard(IdCardBean card);
	
	/**
	 * 修改身份行信息
	 * @param user
	 */
	public void updateIdCardByIdCard(IdCardBean card);
	
	
}

