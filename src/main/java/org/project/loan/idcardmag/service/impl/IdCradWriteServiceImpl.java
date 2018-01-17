package org.project.loan.idcardmag.service.impl;

import javax.annotation.Resource;

import org.project.loan.beans.CustomerBean;
import org.project.loan.beans.IdCardBean;
import org.project.loan.idcardmag.repository.IdCardRepository;
import org.project.loan.idcardmag.service.IIdCradWriteService;
import org.springframework.stereotype.Service;

@Service
public class IdCradWriteServiceImpl implements IIdCradWriteService{

	@Resource
	private IdCardRepository idCardRepository;
	
	@Override
	public void addIdCard(IdCardBean card) {
		// TODO Auto-generated method stub
		idCardRepository.save(card);
	}

	@Override
	public void deleteIdCardByIdCard(IdCardBean card) {
		// TODO Auto-generated method stub
		idCardRepository.delete(card);
	}

	@Override
	public void updateIdCardByIdCard(IdCardBean card) {
		// TODO Auto-generated method stub
		idCardRepository.saveAndFlush(card);
	}

	
}
