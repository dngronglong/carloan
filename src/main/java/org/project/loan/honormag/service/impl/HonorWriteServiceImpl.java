package org.project.loan.honormag.service.impl;

import javax.annotation.Resource;

import org.project.loan.beans.HonorBean;
import org.project.loan.honormag.repository.HonorRepository;
import org.project.loan.honormag.service.IHonorWriteService;
import org.springframework.stereotype.Service;

@Service
public class HonorWriteServiceImpl implements IHonorWriteService {
	
	@Resource
	private HonorRepository repository;
	
	@Override
	public void addHonor(HonorBean honor) {
		// TODO Auto-generated method stub
		repository.save(honor);
	}

	@Override
	public void updateHonor(HonorBean honor) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(honor);
	}

}
