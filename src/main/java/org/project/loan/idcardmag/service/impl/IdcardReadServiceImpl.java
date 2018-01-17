package org.project.loan.idcardmag.service.impl;

import javax.annotation.Resource;

import org.project.loan.beans.CustomerBean;
import org.project.loan.beans.IdCardBean;
import org.project.loan.idcardmag.dao.IIdCardDao;
import org.project.loan.idcardmag.service.IIdcardReadService;
import org.springframework.stereotype.Service;

@Service
public class IdcardReadServiceImpl implements IIdcardReadService {

	@Resource
	private IIdCardDao idCardDaoImpl;
	
	@Override
	public IdCardBean findIdCardById(int id) {
		// TODO Auto-generated method stub
		return idCardDaoImpl.findIdCardById(id);
	}

}
