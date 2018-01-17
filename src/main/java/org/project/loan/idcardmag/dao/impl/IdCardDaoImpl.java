package org.project.loan.idcardmag.dao.impl;

import javax.annotation.Resource;

import org.project.loan.beans.CustomerBean;
import org.project.loan.beans.IdCardBean;
import org.project.loan.idcardmag.dao.IIdCardDao;
import org.project.loan.idcardmag.mapper.IdCardMapper;
import org.springframework.stereotype.Repository;

@Repository
public class IdCardDaoImpl implements IIdCardDao {

	@Resource
	private IdCardMapper idCardMapper;
	
	@Override
	public IdCardBean findIdCardById(int id) {
		
		return idCardMapper.findIdCardById(id);

	}

	@Override
	public void addCustomer(CustomerBean customer) {
		
		
	}

}
