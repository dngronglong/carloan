package org.project.loan.usermag.service;

import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;
import org.project.loan.beans.PagerBean;
import org.project.loan.beans.UserBean;

public interface IUserReadService {
	
	/**
	 * 登录方法
	 * @param user
	 * @return
	 */
	public UserBean  login(UserBean user);
	
	/**
	 * 查询所用用户
	 * @return
	 */
	public List<UserBean>  findAllUser();
	/**
	 * 根据登录名查询用户
	 * @param userLoginName
	 * @return
	 */
	public UserBean getByUsername(String userLoginName);
	/**
	 * 根据登录名查询角色
	 * @param userLoginName
	 * @return
	 */
    public Set<String> getRoles(String userLoginName);
	/**
	 * 根据登录名查询权限
	 * @param userLoginName
	 * @return
	 */
    public Set<String> getPermissions(String userLoginName);
    
    /**
 	 * 根据分页page查询用户，并返回合同的集合
 	 * @param page
 	 * @return
 	 */	
 	
 	public PagerBean  findUserByPage(@Param("pager") PagerBean pager);


}
