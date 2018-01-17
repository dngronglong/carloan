package org.project.loan.rolemag.dao.impl;

import java.util.List;

import javax.annotation.Resource;
import org.project.loan.beans.RoleBean;
import org.project.loan.rolemag.dao.IRoleDao;
import org.project.loan.rolemag.mapper.RoleMapper;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDaoImpl implements IRoleDao {
	
	@Resource
	private RoleMapper roleMapper;

	@Override
	public List<RoleBean> findRoleAll() {
		// TODO Auto-generated method stub
		
		return roleMapper.findRoleAll();
	}

}
