package org.project.loan.usermag.service;

import org.project.loan.beans.UserBean;

public interface IUserWriteService {
	/**
	 * 添加用户
	 * @param user
	 */
	public void addUser(UserBean user);
	
	/**
	 * 删除用户
	 * @param user
	 */
	public void deleteUserByUserId(int userid);
	
	/**
	 * 修改用户
	 * @param user
	 */
	public void updateUserByUser(UserBean user);
}
