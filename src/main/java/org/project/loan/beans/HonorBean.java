package org.project.loan.beans;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.Serializable;

/**
 * 客户的信用信息实体类
 * @author 李山
 *
 */
@Entity
@Table(name = "t_honor")
public class HonorBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="honor_id")
	@GenericGenerator(name="hibernate.strategy", strategy="identity")
	@GeneratedValue(generator="hibernate.strategy")
	private int id;//客户信用信息的id
	
	@Column(name = "honor_car")
	private String car;//客户有无车产
	
	@Column(name = "honor_card")
	private String card;//客户有无信用卡
	
	@Column(name = "honor_cardstatus")
	private String cardstatus;//客户信用卡、,贷款有无逾期（信用卡,贷款最大逾期状况 ）
	
	@Column(name = "honor_carloan")
	private String carloan;//客户有无车贷
	
	@Column(name = "honor_check")
	private int check;//客户的信用卡，贷款审批查询次数 
	
	@Column(name = "honor_house")
	private String house;//客户有无房产
	
	@Column(name = "honor_mortgage")
	private String mortgage;//客户有无有无房贷
	
	@Column(name = "honor_otherloan")
	private String otherloan;//客户有无其他信用贷款
	
	@Column(name = "honor_overdue")
	private int overdue;//客户的信用卡，贷款累计逾期次数 
	
	@Column(name = "honor_rate")
	private double rate;//客户的信用卡额度使用率

	public HonorBean(){

	}

	/**
	 * 得到客户的有无车产情况
	 * @return the car
	 */
	public String getCar() {
		return car;
	}

	/**
	 * 设置客户的有无车产情况
	 * @param car the car to set
	 */
	public void setCar(String car) {
		this.car = car;
	}

	/**
	 * 得到客户有无信用卡
	 * @return the card
	 */
	public String getCard() {
		return card;
	}

	/**
	 * 设置客户有无信用卡
	 * @param card the card to set
	 */
	public void setCard(String card) {
		this.card = card;
	}

	/**
	 * 得到客户的客户信用卡、,贷款有无逾期（信用卡,贷款最大逾期状况 ）
	 * @return the cardstatus
	 */
	public String getCardstatus() {
		return cardstatus;
	}

	/**
	 * 设置客户的客户信用卡、,贷款有无逾期（信用卡,贷款最大逾期状况 ）
	 * @param cardstatus the cardstatus to set
	 */
	public void setCardstatus(String cardstatus) {
		this.cardstatus = cardstatus;
	}

	/**
	 * 得到客户的有无车贷情况
	 * @return the carloan
	 */
	public String getCarloan() {
		return carloan;
	}

	/**
	 * 设置客户的有无车贷情况
	 * @param carloan the carloan to set
	 */
	public void setCarloan(String carloan) {
		this.carloan = carloan;
	}

	/**
	 * 得到客户的信用卡，贷款审批查询次数 
	 * @return the check
	 */
	public int getCheck() {
		return check;
	}

	/**
	 * 设置客户的信用卡，贷款审批查询次数 
	 * @param check the check to set
	 */
	public void setCheck(int check) {
		this.check = check;
	}

	/**
	 * 得到客户有无房产情况
	 * @return the house
	 */
	public String getHouse() {
		return house;
	}

	/**
	 * 设置客户有无房产情况
	 * @param house the house to set
	 */
	public void setHouse(String house) {
		this.house = house;
	}

	/**
	 * 得到客户信用信息的id
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * 设置客户信用信息的id
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 得到客户有无有无房贷情况
	 * @return the mortgage
	 */
	public String getMortgage() {
		return mortgage;
	}

	/**
	 * 设置客户有无有无房贷情况
	 * @param mortgage the mortgage to set
	 */
	public void setMortgage(String mortgage) {
		this.mortgage = mortgage;
	}

	/**
	 * 得到客户有无其他的贷款信息
	 * @return the otherloan
	 */
	public String getOtherloan() {
		return otherloan;
	}

	/**
	 * @param otherloan the otherloan to set
	 */
	public void setOtherloan(String otherloan) {
		this.otherloan = otherloan;
	}

	/**
	 * 得到客户的信用卡，贷款累计逾期次数 
	 * @return the overdue
	 */
	public int getOverdue() {
		return overdue;
	}

	/**
	 * 设置客户的信用卡，贷款累计逾期次数 
	 * @param overdue the overdue to set
	 */
	public void setOverdue(int overdue) {
		this.overdue = overdue;
	}

	/**
	 * 的到客户的信用卡额度使用率
	 * @return the rate
	 */
	public double getRate() {
		return rate;
	}

	/**设置客户的信用卡额度使用率
	 * @param rate the rate to set
	 */
	public void setRate(double rate) {
		this.rate = rate;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HonorBean [car=" + car + ", card=" + card + ", cardstatus=" + cardstatus + ", carloan=" + carloan
				+ ", check=" + check + ", house=" + house + ", id=" + id + ", mortgage=" + mortgage + ", otherloan="
				+ otherloan + ", overdue=" + overdue + ", rate=" + rate + "]";
	}

	

}