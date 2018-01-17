package org.project.loan.rolemag.mapper;

import java.util.List;

import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.project.loan.beans.RoleBean;

public interface RoleMapper {
	
	
	@ResultType(RoleBean.class)
	@Select("select role_id as roleId ,role_name as roleName from t_role ")
	public List<RoleBean> findRoleAll();

}
