package org.project.loan.beans;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * 客户身份证的实体类
 * @author 李山
 *
 */
@Entity
@Table(name="t_idcard")
public class IdCardBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="customeridcard_id")
	@GenericGenerator(name="hibernate.strategy", strategy="identity")
	@GeneratedValue(generator="hibernate.strategy")
	private int customerIdcardId;//客户身份证的id
	
	@Column(name="customer_birthday")
	private Date customerbirthday;//客户的出生日期
	
	@Column(name="customer_finish")
	private Date customerFinish;//客户身份证的有效期截止时间
	
	@Column(name="customer_gender")
	private String customerGender;//客户的性别
	
	@Column(name="customer_name")
	private String customerName;//客户的名字
	
	@Column(name="customer_nation")
	private String customerNation;//客户的民族
	
	@Column(name="customer_number")
	private String customerNumber;//客户的身份证号码
	
	@Column(name="customer_organ")
	private String customerOrgan;//身份证发证机关
	
	@Column(name="customer_start")
	private Date customerStart;//客户身份证的有效期起始时间
		
	@Column(name="customer_address")
	private String customerAddress;//客户的户籍 地址

	public IdCardBean(){

	}

    
	
	public IdCardBean(Date customerbirthday, Date customerFinish, String customerGender, String customerName,
			String customerNation, String customerNumber, String customerOrgan, Date customerStart,
			String customerAddress) {
		super();
		this.customerbirthday = customerbirthday;
		this.customerFinish = customerFinish;
		this.customerGender = customerGender;
		this.customerName = customerName;
		this.customerNation = customerNation;
		this.customerNumber = customerNumber;
		this.customerOrgan = customerOrgan;
		this.customerStart = customerStart;
		this.customerAddress = customerAddress;
	}



	/**
	 * 得到客户的户籍地址
	 * @return the customerAddress
	 */
	public String getCustomerAddress() {
		return customerAddress;
	}

	/**
	 * 设置客户的户籍地址
	 * @param customerAddress the customerAddress to set
	 */
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	/**
	 * 得到客户的出生年月
	 * @return the customerbirthday
	 */
	public Date getCustomerbirthday() {
		return customerbirthday;
	}

	/**
	 * 设置客户的出生年月
	 * @param customerbirthday the customerbirthday to set
	 */
	public void setCustomerbirthday(Date customerbirthday) {
		this.customerbirthday = customerbirthday;
	}

	/**
	 * 得到客户的身份证的有效期截止时间
	 * @return the customerFinish
	 */
	public Date getCustomerFinish() {
		return customerFinish;
	}

	/**
	 * 设置客户的身份证的有效期截止时间
	 * @param customerFinish the customerFinish to set
	 */
	public void setCustomerFinish(Date customerFinish) {
		this.customerFinish = customerFinish;
	}

	/**
	 * 得到客户的性别
	 * @return the customerGender
	 */
	public String getCustomerGender() {
		return customerGender;
	}

	/**
	 * 设置客户的性别
	 * @param customerGender the customerGender to set
	 */
	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}

	/**
	 * 得到客户的身份证的id
	 * @return the customerId
	 */
	

	/**
	 * 得到客户的姓名
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	public int getCustomerIdcardId() {
		return customerIdcardId;
	}


	public void setCustomerIdcardId(int customerIdcardId) {
		this.customerIdcardId = customerIdcardId;
	}


	/**
	 * 设置客户的姓名
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * 得到客户的民族
	 * @return the customerNation
	 */
	public String getCustomerNation() {
		return customerNation;
	}

	/**
	 * 设置客户的民族
	 * @param customerNation the customerNation to set
	 */
	public void setCustomerNation(String customerNation) {
		this.customerNation = customerNation;
	}

	/**
	 * 得到客户的身份证号码
	 * @return the customerNumber
	 */
	public String getCustomerNumber() {
		return customerNumber;
	}

	/**
	 * 设置客户的身份证号码
	 * @param customerNumber the customerNumber to set
	 */
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	/**
	 * 得到客户的身份证的发证机关
	 * @return the customerOrgan
	 */
	public String getCustomerOrgan() {
		return customerOrgan;
	}

	/**
	 * 设置客户的身份证的发证机关
	 * @param customerOrgan the customerOrgan to set
	 */
	public void setCustomerOrgan(String customerOrgan) {
		this.customerOrgan = customerOrgan;
	}

	/**
	 * 得到客户的身份证的有效期起始时间
	 * @return the customerStart
	 */
	public Date getCustomerStart() {
		return customerStart;
	}

	/**
	 * 设置客户的身份证的有效期起始时间
	 * @param customerStart the customerStart to set
	 */
	public void setCustomerStart(Date customerStart) {
		this.customerStart = customerStart;
	}


	@Override
	public String toString() {
		return "IdCardBean [customerIdcardId=" + customerIdcardId + ", customerbirthday=" + customerbirthday
				+ ", customerFinish=" + customerFinish + ", customerGender=" + customerGender + ", customerName="
				+ customerName + ", customerNation=" + customerNation + ", customerNumber=" + customerNumber
				+ ", customerOrgan=" + customerOrgan + ", customerStart=" + customerStart + ", customerAddress="
				+ customerAddress + "]";
	}

	

	
	
	
}