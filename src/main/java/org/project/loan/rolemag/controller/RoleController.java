package org.project.loan.rolemag.controller;

import java.util.List;

import javax.annotation.Resource;
import org.project.loan.beans.RoleBean;
import org.project.loan.rolemag.service.IRoleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/role")
@RestController
public class RoleController {
	
	@Resource
	private IRoleService roleServiceImpl;
	
	@RequestMapping(value="/roleList",produces= {"application/json;charset=utf-8"})
	public  List<RoleBean> roleList(){
		
		return roleServiceImpl.findRoleAll();
		
	}

}
