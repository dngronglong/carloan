package org.project.loan.usermag.mapper;

import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;
import org.project.loan.beans.ContractBean;
import org.project.loan.beans.PagerBean;
import org.project.loan.beans.UserBean;

public interface UserMapper {
	
	public UserBean getByUsername(@Param("userLoginName")String userLoginName);

    public Set<String> getRoles(@Param("userLoginName")String userLoginName);

    public Set<String> getPermissions(@Param("userLoginName")String userLoginName);
    
	/**
	 * 根据分页page查询用户，并返回合同的集合
	 * @param page
	 * @return
	 */	
	
	public List<UserBean>  findUserByPage(@Param("pager") PagerBean pager);
	
	
	/**
	 * 根据分页page查询用户的条数
	 * @param page
	 * @return
	 */	
	public int gettotal(@Param("pager") PagerBean pager);

}
