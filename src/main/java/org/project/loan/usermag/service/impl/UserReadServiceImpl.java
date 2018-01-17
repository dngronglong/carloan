package org.project.loan.usermag.service.impl;

import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.project.loan.beans.PagerBean;
import org.project.loan.beans.UserBean;
import org.project.loan.usermag.dao.IUserDao;
import org.project.loan.usermag.service.IUserReadService;
import org.springframework.stereotype.Service;

@Service
public class UserReadServiceImpl implements IUserReadService {
	
	@Resource
	private IUserDao userDaoImpl;

	@Override
	public UserBean login(UserBean user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserBean> findAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserBean getByUsername(String userLoginName) {
		// TODO Auto-generated method stub
		return userDaoImpl.getByUsername(userLoginName);
	}

	@Override
	public Set<String> getRoles(String userLoginName) {
		// TODO Auto-generated method stub
		return userDaoImpl.getRoles(userLoginName);
	}

	@Override
	public Set<String> getPermissions(String userLoginName) {
		// TODO Auto-generated method stub
		return userDaoImpl.getPermissions(userLoginName);
	}

	@Override
	public PagerBean findUserByPage(PagerBean pager) {
		// TODO Auto-generated method stub
		System.out.println(123);
		return userDaoImpl.findUserByPage(pager);
	}

}
