package org.project.loan.beans;

import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 签约信息的实体类
 * @author 李山
 *
 */
@Entity
@Table(name="t_sign")
public class SignBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	@GenericGenerator(name="hibernate.strategy", strategy="identity")
	@GeneratedValue(generator="hibernate.strategy")
	private int signId;//签约信息的id
	@Column
	private String sign_bankCard;//银行卡
	@Column
	private String sign_application;//申请表
	@Column
	private String sign_smallTable;//小额借款服务合同
	@Column
	private String sign_debit;//授权扣款委托书
	@Column
	private String sign_letterOfAttorney;//授权委托书
	@Column
	private String sign_repayment;//还款计划表
	@Column
	private String sign_agreement;//补充协议
	@Column
	private String sign_contract;//车辆买卖回购合同
	@Column
	private String sign_letterOfAttorneyCar;//授权委托书（车辆处理使用）
	@Column
	private String sign_photoForCar;//车辆抵押照片
	@Column
	private String sign_phtotCar;//车辆入库照片
	@Column
	private String sign_money;//审批金额
	@Column
	private String sign_bank;//放款/还款银行
	@Column
	private Date sign_date;//约定放款日
	@Column
	private String sign_accountNumber;//放款/还款账号
	@Column
	private String sign_bankAddress;//开户支行
	@Column
	private Date sign_time;//签约时间
	
	
	public SignBean() {
		super();
	}


	/**
	 * @return the signId
	 */
	public int getSignId() {
		return signId;
	}


	/**
	 * @param signId the signId to set
	 */
	public void setSignId(int signId) {
		this.signId = signId;
	}


	/**
	 * @return the sign_bankCard
	 */
	public String getSign_bankCard() {
		return sign_bankCard;
	}


	/**
	 * @param sign_bankCard the sign_bankCard to set
	 */
	public void setSign_bankCard(String sign_bankCard) {
		this.sign_bankCard = sign_bankCard;
	}


	/**
	 * @return the sign_application
	 */
	public String getSign_application() {
		return sign_application;
	}


	/**
	 * @param sign_application the sign_application to set
	 */
	public void setSign_application(String sign_application) {
		this.sign_application = sign_application;
	}


	/**
	 * @return the sign_smallTable
	 */
	public String getSign_smallTable() {
		return sign_smallTable;
	}


	/**
	 * @param sign_smallTable the sign_smallTable to set
	 */
	public void setSign_smallTable(String sign_smallTable) {
		this.sign_smallTable = sign_smallTable;
	}


	/**
	 * @return the sign_debit
	 */
	public String getSign_debit() {
		return sign_debit;
	}


	/**
	 * @param sign_debit the sign_debit to set
	 */
	public void setSign_debit(String sign_debit) {
		this.sign_debit = sign_debit;
	}


	/**
	 * @return the sign_letterOfAttorney
	 */
	public String getSign_letterOfAttorney() {
		return sign_letterOfAttorney;
	}


	/**
	 * @param sign_letterOfAttorney the sign_letterOfAttorney to set
	 */
	public void setSign_letterOfAttorney(String sign_letterOfAttorney) {
		this.sign_letterOfAttorney = sign_letterOfAttorney;
	}


	/**
	 * @return the sign_repayment
	 */
	public String getSign_repayment() {
		return sign_repayment;
	}


	/**
	 * @param sign_repayment the sign_repayment to set
	 */
	public void setSign_repayment(String sign_repayment) {
		this.sign_repayment = sign_repayment;
	}


	/**
	 * @return the sign_agreement
	 */
	public String getSign_agreement() {
		return sign_agreement;
	}


	/**
	 * @param sign_agreement the sign_agreement to set
	 */
	public void setSign_agreement(String sign_agreement) {
		this.sign_agreement = sign_agreement;
	}


	/**
	 * @return the sign_contract
	 */
	public String getSign_contract() {
		return sign_contract;
	}


	/**
	 * @param sign_contract the sign_contract to set
	 */
	public void setSign_contract(String sign_contract) {
		this.sign_contract = sign_contract;
	}


	/**
	 * @return the sign_letterOfAttorneyCar
	 */
	public String getSign_letterOfAttorneyCar() {
		return sign_letterOfAttorneyCar;
	}


	/**
	 * @param sign_letterOfAttorneyCar the sign_letterOfAttorneyCar to set
	 */
	public void setSign_letterOfAttorneyCar(String sign_letterOfAttorneyCar) {
		this.sign_letterOfAttorneyCar = sign_letterOfAttorneyCar;
	}


	/**
	 * @return the sign_photoForCar
	 */
	public String getSign_photoForCar() {
		return sign_photoForCar;
	}


	/**
	 * @param sign_photoForCar the sign_photoForCar to set
	 */
	public void setSign_photoForCar(String sign_photoForCar) {
		this.sign_photoForCar = sign_photoForCar;
	}


	/**
	 * @return the sign_phtotCar
	 */
	public String getSign_phtotCar() {
		return sign_phtotCar;
	}


	/**
	 * @param sign_phtotCar the sign_phtotCar to set
	 */
	public void setSign_phtotCar(String sign_phtotCar) {
		this.sign_phtotCar = sign_phtotCar;
	}


	/**
	 * @return the sign_money
	 */
	public String getSign_money() {
		return sign_money;
	}


	/**
	 * @param sign_money the sign_money to set
	 */
	public void setSign_money(String sign_money) {
		this.sign_money = sign_money;
	}


	/**
	 * @return the sign_bank
	 */
	public String getSign_bank() {
		return sign_bank;
	}


	/**
	 * @param sign_bank the sign_bank to set
	 */
	public void setSign_bank(String sign_bank) {
		this.sign_bank = sign_bank;
	}


	/**
	 * @return the sign_date
	 */
	public Date getSign_date() {
		return sign_date;
	}


	/**
	 * @param sign_date the sign_date to set
	 */
	public void setSign_date(Date sign_date) {
		this.sign_date = sign_date;
	}


	/**
	 * @return the sign_accountNumber
	 */
	public String getSign_accountNumber() {
		return sign_accountNumber;
	}


	/**
	 * @param sign_accountNumber the sign_accountNumber to set
	 */
	public void setSign_accountNumber(String sign_accountNumber) {
		this.sign_accountNumber = sign_accountNumber;
	}


	/**
	 * @return the sign_bankAddress
	 */
	public String getSign_bankAddress() {
		return sign_bankAddress;
	}


	/**
	 * @param sign_bankAddress the sign_bankAddress to set
	 */
	public void setSign_bankAddress(String sign_bankAddress) {
		this.sign_bankAddress = sign_bankAddress;
	}


	/**
	 * @return the sign_time
	 */
	public Date getSign_time() {
		return sign_time;
	}


	/**
	 * @param sign_time the sign_time to set
	 */
	public void setSign_time(Date sign_time) {
		this.sign_time = sign_time;
	}


	@Override
	public String toString() {
		return "SignBean [signId=" + signId + ", sign_bankCard=" + sign_bankCard + ", sign_application="
				+ sign_application + ", sign_smallTable=" + sign_smallTable + ", sign_debit=" + sign_debit
				+ ", sign_letterOfAttorney=" + sign_letterOfAttorney + ", sign_repayment=" + sign_repayment
				+ ", sign_agreement=" + sign_agreement + ", sign_contract=" + sign_contract
				+ ", sign_letterOfAttorneyCar=" + sign_letterOfAttorneyCar + ", sign_photoForCar=" + sign_photoForCar
				+ ", sign_phtotCar=" + sign_phtotCar + ", sign_money=" + sign_money + ", sign_bank=" + sign_bank
				+ ", sign_date=" + sign_date + ", sign_accountNumber=" + sign_accountNumber + ", sign_bankAddress="
				+ sign_bankAddress + ", sign_time=" + sign_time + "]";
	}
	
	
	
	

}
