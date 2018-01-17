package org.project.loan.contractmag.service.impl;

import javax.annotation.Resource;

import org.project.loan.beans.ContractBean;
import org.project.loan.contractmag.repository.ContractRepository;
import org.project.loan.contractmag.service.IContractWriteService;
import org.springframework.stereotype.Service;

@Service
public class ContractWriteServiceImpl implements IContractWriteService {

	@Resource
	private ContractRepository contractRepository;
	@Override
	public void addContract(ContractBean contract) {
		// TODO Auto-generated method stub
		contractRepository.save(contract);

	}

	@Override
	public void deleteContract(ContractBean contract) {
		// TODO Auto-generated method stub
		contractRepository.delete(contract);

	}

	@Override
	public void updateContract(ContractBean contract) {
		// TODO Auto-generated method stubs
		contractRepository.saveAndFlush(contract);

	}

	@Override
	public void updateContractStatus(int contractStatus, int contractId) {
		// TODO Auto-generated method stub
		contractRepository.updateContractStatus(contractStatus, contractId);

	}

}
