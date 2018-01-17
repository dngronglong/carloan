package org.project.loan.carmag.dao.impl;

import javax.annotation.Resource;

import org.project.loan.beans.CarBean;
import org.project.loan.carmag.dao.ICarDao;
import org.project.loan.carmag.mapper.CarMapper;
import org.springframework.stereotype.Repository;


@Repository
public class CarDaoImpl implements ICarDao {

	@Resource
	private CarMapper carMapper;
	
	@Override
	public CarBean findCarById(int id) {
		return carMapper.findCarById(id);
	}

}
