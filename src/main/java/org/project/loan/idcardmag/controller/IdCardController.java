package org.project.loan.idcardmag.controller;

import javax.annotation.Resource;

import org.project.loan.beans.ContractBean;
import org.project.loan.beans.CustomerBean;
import org.project.loan.beans.IdCardBean;
import org.project.loan.beans.Messager;
import org.project.loan.beans.ProductBean;
import org.project.loan.contractmag.service.IContractReadService;
import org.project.loan.contractmag.service.IContractWriteService;
import org.project.loan.idcardmag.service.IIdCradWriteService;
import org.project.loan.pojos.IdCard;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/idcard")
@RestController
public class IdCardController {

	@Resource
	private IIdCradWriteService idCradWriteServiceImpl;
	@Resource
	private IContractWriteService contractWriteServiceImpl;
	
	
	@RequestMapping(value="/addidcard",produces= {"application/json;charset=utf-8"})
	public Messager saveIdcardInfo(@RequestBody IdCard idcard) {		
		IdCardBean idcardBean = new IdCardBean(idcard.getCustomerbirthday(), idcard.getCustomerFinish(), idcard.getCustomerGender(), idcard.getCustomerName(), idcard.getCustomerNation(), idcard.getCustomerNumber(), idcard.getCustomerOrgan(), idcard.getCustomerStart(), idcard.getCustomerAddress());
		ProductBean productBean = new ProductBean();
		productBean.setProductsId(idcard.getProductId());
		CustomerBean customerBean = new CustomerBean();
		customerBean.setCustomerIdcardBean(idcardBean);
		ContractBean contractBean = new ContractBean();
		contractBean.setContractCustomerBean(customerBean);
		contractBean.setContractProductBean(productBean);
		contractBean.setContractNumber("cd10000");
		contractBean.setContractStatus(1);
		contractWriteServiceImpl.addContract(contractBean);
		Messager msg = new Messager(true, "添加成功！");
		CustomerBean customer = new CustomerBean();
		ContractBean contract= new ContractBean();
		contract.setContractCustomerBean(customer);
		System.out.println(idcard);
		return msg;

	}
	
}
