package org.project.loan.carmag.service.impl;

import javax.annotation.Resource;

import org.project.loan.beans.CarBean;
import org.project.loan.carmag.dao.ICarDao;
import org.project.loan.carmag.service.ICarReadService;
import org.springframework.stereotype.Service;

@Service
public class CarReadServiceImpl implements ICarReadService {

	@Resource
	private ICarDao carDaoImpl;
	
	@Override
	public CarBean findCarById(int id) {
		// TODO Auto-generated method stub
		return carDaoImpl.findCarById(id);
	}

}
