package org.project.loan.rolemag.service.impl;

import java.util.List;

import javax.annotation.Resource;


import org.project.loan.beans.RoleBean;
import org.project.loan.rolemag.dao.IRoleDao;
import org.project.loan.rolemag.service.IRoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements IRoleService {

	@Resource
	private IRoleDao RoleDaoImpl;
	
	public List<RoleBean> findRoleAll() {
		// TODO Auto-generated method stub
		return RoleDaoImpl.findRoleAll();
	}

}
