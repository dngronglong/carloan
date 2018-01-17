package org.project.loan.usermag.dao.impl;

import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.project.loan.beans.ContractBean;
import org.project.loan.beans.PagerBean;
import org.project.loan.beans.UserBean;
import org.project.loan.usermag.dao.IUserDao;
import org.project.loan.usermag.mapper.UserMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements IUserDao {
	
	@Resource
	private UserMapper userMapper;
	

	@Override
	public UserBean findUserByUser(UserBean user) {
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
		return userMapper.getByUsername(userLoginName);
	}

	@Override
	public Set<String> getRoles(String userLoginName) {
		// TODO Auto-generated method stub
		return userMapper.getRoles(userLoginName);
	}

	@Override
	public Set<String> getPermissions(String userLoginName) {
		// TODO Auto-generated method stub
		return userMapper.getPermissions(userLoginName);
	}

	@Override
	public PagerBean findUserByPage(PagerBean pager) {
		// TODO Auto-generated method stub
		List<UserBean> rows = userMapper.findUserByPage(pager);
		pager.setRows(rows);
		pager.setTotal(userMapper.gettotal(pager));
		System.out.println(321);
		return pager;
	}

}
