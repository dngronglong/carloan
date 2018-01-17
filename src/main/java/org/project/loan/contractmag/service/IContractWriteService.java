package org.project.loan.contractmag.service;

import org.project.loan.beans.ContractBean;

public interface IContractWriteService {
	
	/**
	 * 添加合同
	 * @param contract
	 */
	public void addContract(ContractBean contract);
	
	/**
	 * 删除合同
	 * @param contract
	 */
	public void deleteContract(ContractBean contract);
	
	/**
	 * 修改合同
	 * @param contract
	 */
	public void updateContract(ContractBean contract);
	
	
	public void updateContractStatus(int contractStatus,int contractId);

}
