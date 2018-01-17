package org.project.loan.honormag.dao.impl;

import javax.annotation.Resource;

import org.project.loan.beans.HonorBean;
import org.project.loan.honormag.dao.IHonorDao;
import org.project.loan.honormag.mapper.HonorMapper;
import org.springframework.stereotype.Repository;

@Repository
public class HonorDaoImpl implements IHonorDao {
	
	@Resource
	private HonorMapper hm;
	
	@Override
	public HonorBean findHonorById(int id) {
		return hm.findHonorById(id);
	}

}
