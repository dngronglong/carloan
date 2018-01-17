package org.project.loan.pojos;

import java.util.Date;

public class IdCard  {

	private int customerIdcardId;//客户身份证的id
	

	private Date customerbirthday;//客户的出生日期

	private Date customerFinish;//客户身份证的有效期截止时间

	private String customerGender;//客户的性别

	private String customerName;//客户的名字

	private String customerNation;//客户的民族
	

	private String customerNumber;//客户的身份证号码

	private String customerOrgan;//身份证发证机关
	

	private Date customerStart;//客户身份证的有效期起始时间

	private String customerAddress;//客户的户籍 地址
	
	private int  productId;//客户选择的产品

	public int getCustomerIdcardId() {
		return customerIdcardId;
	}

	public void setCustomerIdcardId(int customerIdcardId) {
		this.customerIdcardId = customerIdcardId;
	}

	public Date getCustomerbirthday() {
		return customerbirthday;
	}

	public void setCustomerbirthday(Date customerbirthday) {
		this.customerbirthday = customerbirthday;
	}

	public Date getCustomerFinish() {
		return customerFinish;
	}

	public void setCustomerFinish(Date customerFinish) {
		this.customerFinish = customerFinish;
	}

	public String getCustomerGender() {
		return customerGender;
	}

	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerNation() {
		return customerNation;
	}

	public void setCustomerNation(String customerNation) {
		this.customerNation = customerNation;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getCustomerOrgan() {
		return customerOrgan;
	}

	public void setCustomerOrgan(String customerOrgan) {
		this.customerOrgan = customerOrgan;
	}

	public Date getCustomerStart() {
		return customerStart;
	}

	public void setCustomerStart(Date customerStart) {
		this.customerStart = customerStart;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	@Override
	public String toString() {
		return "IdCard [customerIdcardId=" + customerIdcardId + ", customerbirthday=" + customerbirthday
				+ ", customerFinish=" + customerFinish + ", customerGender=" + customerGender + ", customerName="
				+ customerName + ", customerNation=" + customerNation + ", customerNumber=" + customerNumber
				+ ", customerOrgan=" + customerOrgan + ", customerStart=" + customerStart + ", customerAddress="
				+ customerAddress + ", productId=" + productId + "]";
	}
	
	

}
