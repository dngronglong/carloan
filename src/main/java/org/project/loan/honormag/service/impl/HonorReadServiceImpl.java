package org.project.loan.honormag.service.impl;

import javax.annotation.Resource;

import org.project.loan.beans.HonorBean;
import org.project.loan.honormag.dao.IHonorDao;
import org.project.loan.honormag.service.IHonorReadService;
import org.springframework.stereotype.Service;

@Service
public class HonorReadServiceImpl implements IHonorReadService {
	
	@Resource
	private IHonorDao honorDaoImpl;
	
	@Override
	public HonorBean findHonorById(int id) {
		// TODO Auto-generated method stub
		return honorDaoImpl.findHonorById(id);
	}

}
