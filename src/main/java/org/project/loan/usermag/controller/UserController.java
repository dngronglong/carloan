package org.project.loan.usermag.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.project.loan.beans.CompanyBean;
import org.project.loan.beans.Messager;
import org.project.loan.beans.PagerBean;
import org.project.loan.beans.RoleBean;
import org.project.loan.beans.UserBean;
import org.project.loan.usermag.service.IUserReadService;
import org.project.loan.usermag.service.IUserWriteService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {
	
	@Resource
	private IUserReadService userReadServiceImpl;
	
	@Resource
	private IUserWriteService userWriteServiceImpl;
	
	@RequestMapping(value="/userList",produces= {"application/json;charset=utf-8"})
	public PagerBean userList(int page,int rows,String username) {
		Map params = new HashMap<>();
		params.put("userName", username);
		PagerBean pager = new PagerBean(page, rows, params);
		pager=userReadServiceImpl.findUserByPage(pager);
		return pager;
		
	}
	
	
	@RequestMapping(value="/updateUser",produces= {"application/json;charset=utf-8"})
	public Messager updateUser(UserBean user,String companyName,String roleName) {
		CompanyBean company = new CompanyBean();
		company.setCompanyId(Integer.parseInt(companyName));

		RoleBean role = new RoleBean();
		role.setRoleId(Integer.parseInt(roleName));
		
		user.setUserCompanyBean(company);
		user.setUserRoleBean(role);
		System.out.println(user);
		
	    userWriteServiceImpl.updateUserByUser(user);
		Messager msg= new Messager(true, "添加成功！");
		System.out.println(msg);
		return msg;
		
	}
	
	@RequestMapping(value="/addUser",produces= {"application/json;charset=utf-8"})
	public Messager addUser(UserBean user,String companyName,String roleName) {
		CompanyBean company = new CompanyBean();
		company.setCompanyId(Integer.parseInt(companyName));

		RoleBean role = new RoleBean();
		role.setRoleId(Integer.parseInt(roleName));
		
		user.setUserCompanyBean(company);
		user.setUserRoleBean(role);
		
		userWriteServiceImpl.addUser(user);
		Messager msg= new Messager(true, "修改成功！");
		return msg;
		
	}
	
	@RequestMapping(value="/deleteUser",produces= {"application/json;charset=utf-8"})
	public Messager deleteUser(String userId ) {
	
		
		userWriteServiceImpl.deleteUserByUserId(Integer.parseInt(userId));
		Messager msg= new Messager(true, "删除成功！");
		return msg;
		
	}
	
	
	

}
