package org.project.loan.beans;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;

import java.io.Serializable;
import java.util.Date;

/**
 * 申请合同信息记录
 * @author zou
 *
 */
@Entity
@Table(name="t_contract")
public class ContractBean implements Serializable{
	
	@Id
	@Column(name="contract_id")
	@GenericGenerator(name="hibernate.strategy", strategy="identity")
	@GeneratedValue(generator="hibernate.strategy")
	private int contractId; //合同id     
	
	@Column(name="contract_manager")
	private String contractManager; //业务经理
	
	@Column(name="contract_number")
	private String contractNumber;  // 合同编号  
	
	@Column(name="contract_companyname")
	private String contractCompanyname; //分公司名称
	
	@Column(name="contract_intime")
	private Date contractIntime;  //   进件时间
	
	@Column(name="contract_rechecktime")
	private Date contractRechecktime;//复审时间
	
	@Column(name="contract_loan")
	private String  contractLoan;  //放款状态
	
	@Column(name="contract_signtime")
	private Date contractSigntime; //签约时间
	
	@Column(name="contract_message")
	private String contractMessage; //合同回退信息
	
	@Column(name="contract_basemessage")
	private String contractBasemessage;//基本信息回退
	
	@Column(name="contract_carmessage")
	private String contractCarmessage; //车辆信息回退
	
	@Column(name="contract_status")
	private  int  contractStatus;//订单状态
	
	@OneToOne(fetch=FetchType.LAZY)
	@Cascade(value= {CascadeType.SAVE_UPDATE})
	@JoinColumn(name="fk_customer_id")
	private CustomerBean contractCustomerBean;//合同甲方的基本信息
	
	@OneToOne(fetch=FetchType.LAZY)
	@Cascade(value= {CascadeType.SAVE_UPDATE})
	@JoinColumn(name="fk_car_id")
	private CarBean contractCarBean;//合同甲方的车辆信息
	
	@OneToOne(fetch=FetchType.LAZY)
	@Cascade(value= {CascadeType.SAVE_UPDATE})
	@JoinColumn(name="fk_honor_id")
	private HonorBean contractHonorBean;//合同甲方的信用信息
	
	@OneToOne(fetch=FetchType.LAZY)
	@Cascade(value= {CascadeType.SAVE_UPDATE})
	@JoinColumn(name="fk_products")
	private ProductBean contractProductBean;//合同甲方选择的产品
	
	@OneToOne(fetch=FetchType.LAZY)
	@Cascade(value= {CascadeType.SAVE_UPDATE})
	@JoinColumn(name="fk_sign_id")
	private SignBean signBean;
	
	@Version
	private int version;//合同记录版本号
	
	
	
	public ContractBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 得到合同id
	 * @return
	 */
	public int getContractId() {
		return contractId;
	}
	/**
	 * 设置合同id
	 * @param contractId
	 */
	public void setContractId(int contractId) {
		this.contractId = contractId;
	}
	
	/**
	 * 得到业务经理
	 * @return
	 */
	public String getContractManager() {
		return contractManager;
	}
	
	/**
	 * 设置业务经理
	 * @param contractManager
	 */
	public void setContractManager(String contractManager) {
		this.contractManager = contractManager;
	}
	
	/**
	 * 得到合同编号
	 * @return
	 */
	public String getContractNumber() {
		return contractNumber;
	}
	
	/**
	 * 设置合同编号
	 * @param contractNumber
	 */
	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}
	
	/**
	 * 得到分公司名称
	 * @return
	 */
	public String getContractCompanyname() {
		return contractCompanyname;
	}
	
	/**
	 * 设置分公司名称
	 * @param contractCompanyname
	 */
	public void setContractCompanyname(String contractCompanyname) {
		this.contractCompanyname = contractCompanyname;
	}
	
	/**
	 * 得到进件时间
	 * @return
	 */
	public Date getContractIntime() {
		return contractIntime;
	}
	/**
	 * 设置进件时间
	 * @param contractIntime
	 */
	public void setContractIntime(Date contractIntime) {
		this.contractIntime = contractIntime;
	}
	
	/**
	 * 得到复审时间
	 * @return
	 */
	public Date getContractRechecktime() {
		return contractRechecktime;
	}
	
	/**
	 * 设置复审时间
	 * @param contractRechecktime
	 */
	public void setContractRechecktime(Date contractRechecktime) {
		this.contractRechecktime = contractRechecktime;
	}
	
	/**
	 * 得到放款状态
	 * @return
	 */
	public String getContractLoan() {
		return contractLoan;
	}
	/**
	 * 设置放款状态
	 * @param contractLoan
	 */
	public void setContractLoan(String contractLoan) {
		this.contractLoan = contractLoan;
	}
	
	/**
	 * 得到签约时间
	 * @return
	 */
	public Date getContractSigntime() {
		return contractSigntime;
	}
	
	/**
	 * 设置签约时间
	 * @param contractSigntime
	 */
	public void setContractSigntime(Date contractSigntime) {
		this.contractSigntime = contractSigntime;
	}
	
	/**
	 * 得到合同回退信息
	 * @return
	 */
	public String getContractMessage() {
		return contractMessage;
	}
	/**
	 * 设置合同回退信息
	 * @param contractMessage
	 */
	public void setContractMessage(String contractMessage) {
		this.contractMessage = contractMessage;
	}
	
	/**
	 * 得到基本信息回退消息
	 * @return
	 */
	public String getContractBasemessage() {
		return contractBasemessage;
	}
	/**
	 * 设置基本信息回退消息
	 * @param contractBasemessage
	 */
	public void setContractBasemessage(String contractBasemessage) {
		this.contractBasemessage = contractBasemessage;
	}
	/**
	 * 得到车辆信息回退消息
	 * @return
	 */
	public String getContractCarmessage() {
		return contractCarmessage;
	}
	/**
	 * 设置车辆信息回退消息
	 * @param contractCarmessage
	 */
	public void setContractCarmessage(String contractCarmessage) {
		this.contractCarmessage = contractCarmessage;
	}
	
	/**
	 * 得到订单状态（数字）
	 * @return
	 */
	public int getContractStatus() {
		return contractStatus;
	}
	/**
	 * 设置订单状态
	 * @param contractStatus
	 */
	public void setContractStatus(int contractStatus) {
		this.contractStatus = contractStatus;
	}

	/**
	 * 得到甲方的基本信息
	 * @return the contractCustomerBean
	 */
	public CustomerBean getContractCustomerBean() {
		return contractCustomerBean;
	}

	/**
	 * 设置甲方的基本信息
	 * @param contractCustomerBean the contractCustomerBean to set
	 */
	public void setContractCustomerBean(CustomerBean contractCustomerBean) {
		this.contractCustomerBean = contractCustomerBean;
	}

	/**
	 * 得到甲方的车辆信息
	 * @return the contractCarBean
	 */
	public CarBean getContractCarBean() {
		return contractCarBean;
	}

	/**
	 * 设置甲方的车辆信息
	 * @param contractCarBean the contractCarBean to set
	 */
	public void setContractCarBean(CarBean contractCarBean) {
		this.contractCarBean = contractCarBean;
	}

	/**
	 * 得到甲方的信用 信息
	 * @return the contractHonorBean
	 */
	public HonorBean getContractHonorBean() {
		return contractHonorBean;
	}

	/**
	 * 设置甲方的信用信息
	 * @param contractHonorBean the contractHonorBean to set
	 */
	public void setContractHonorBean(HonorBean contractHonorBean) {
		this.contractHonorBean = contractHonorBean;
	}

	/**
	 * 得到甲方选择的产品
	 * @return the contractProductBean
	 */
	public ProductBean getContractProductBean() {
		return contractProductBean;
	}

	/**
	 * 设置甲方选择的产品信息
	 * @param contractProductBean the contractProductBean to set
	 */
	public void setContractProductBean(ProductBean contractProductBean) {
		this.contractProductBean = contractProductBean;
	}

	
	public SignBean getSignBean() {
		return signBean;
	}

	public void setSignBean(SignBean signBean) {
		this.signBean = signBean;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "ContractBean [contractId=" + contractId + ", contractManager=" + contractManager + ", contractNumber="
				+ contractNumber + ", contractCompanyname=" + contractCompanyname + ", contractIntime=" + contractIntime
				+ ", contractRechecktime=" + contractRechecktime + ", contractLoan=" + contractLoan
				+ ", contractSigntime=" + contractSigntime + ", contractMessage=" + contractMessage
				+ ", contractBasemessage=" + contractBasemessage + ", contractCarmessage=" + contractCarmessage
				+ ", contractStatus=" + contractStatus + ", contractCustomerBean=" + contractCustomerBean
				+ ", contractCarBean=" + contractCarBean + ", contractHonorBean=" + contractHonorBean
				+ ", contractProductBean=" + contractProductBean + ", signBean=" + signBean + ", version=" + version
				+ "]";
	}

	
	
	
	
	
	
	
}
