package org.project.loan.beans;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.GenericGenerator;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * 客户基本信息实体类
 * @author 李山
 *
 */
@Entity
@Table(name="t_customer")
public class CustomerBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="customer_id")
	@GenericGenerator(name="hibernate.strategy", strategy="identity")
	@GeneratedValue(generator="hibernate.strategy")
	private int customerId;//客户信息的id
	@Column(name="customer_lendTime")
	private Date customer_lendTime;//客户希望申请最长还款期限
	
	@Column(name="customer_application",length=100)
	private String customerApplication;//客户的车贷申请表 
	
	@Column(name="customer_child",length=100)
	private String customerChild;//客户有无子女
	
	@Column(name="customer_chum",length=100)
	private String customerChum;//客户有无共同的居住者
	
	@Column(name="customer_comAdderss",length=100)
	private String customerComAdderss;//客户的工作单位地址

	@Column(name="customer_commissioner",length=100)
	private String customerCommissioner;//客户的车贷专员 
	
	@Column(name="customer_comNun",length=11)
	private int customerComNun;//客户的单位电话 
	
	@Column(name="customer_company",length=100)
	private String customerCompany;//客户的单位名称
	
	@Column(name="customer_date")
	private Date customerDate;//客户申请的日期
	
	@Column(name="customer_demand",length=100)
	private String customerDemand;//客户的借款详细用途 
	
	@Column(name="customer_department",length=100)
	private String customerDepartment;//客户在单位的所在部门 
	
	@Column(name="customer_duty",length=100)
	private String customerDuty;//客户在单位的职务 
	
	@Column(name="customer_education",length=100)
	private String customerEducation;//客户的最高学历
	
	@Column(name="customer_enclosure",length=100)
	private String customerEnclosure;//客户申请资料的其他附件 
	
	@Column(name="customer_house",length=100)
	private String customerHouse;//客户的房产状态 
	
	@Column(name="customer_idcard",length=100)
	private String customerIdcard;//客户的身份证(原件) 
	
	@Column(name="customer_lendLimit",length=11)
	private int customerIendLimit;//客户的希望申请借款额度 
	
	@Column(name="customer_income",length=11)
	private int customerIncome;//客户的月收入
	
	@Column(name="customer_joinCom")
	private Date customerJoinCom;//客户进入该单位时间
	
	@Column(name="customer_know",length=100)
	private String customerKnow;//客户如何得知惠普
	
	@Column(name="customer_marry",length=100)
	private String customerMarry;//客户的婚姻状况
	
	@Column(name="customer_newAddress",length=100)
	private String customerNewAddress;//客户的现住址 
	
	@Column(name="customer_payLimit",length=11)
	private int customerPayLimit;//客户可承受月还款额度
	
	@Column(name="customer_phone",length=11)
	private int customerPhone;//客户的手机号码
	
	@Column(name="customer_postcode",length=11)
	private int customerPostcode;//客户的居住地的邮政编码
	
	@Column(name="customer_quality",length=100)
	private String customerQuality;//客户所在单位的单位性质 
	
	@Column(name="customer_saleman",length=100)
	private String customerSaleman;//客户的业务员姓名 
	
	@Column(name="customer_scale",length=11)
	private int customerScale;//客户所在单位的公司规模
	
	@Column(name="customer_sort",length=100)
	private String customerSort;//客户所在单位的行业类别
	
	@Column(name="customer_tel",length=11)
	private int customerTel;//客户电话号码 
	
	@Column(name="customer_type",length=100)
	private String customerType;//客户类型
	
	@OneToMany(fetch=FetchType.LAZY)
	@Cascade(value= {CascadeType.PERSIST})
	@JoinColumn(name="fk_customer_id")
	private Set<ContactsBean> customerContactsList;//该客户有哪些联系人
	
	@OneToOne(fetch=FetchType.LAZY)
	@Cascade(value= {CascadeType.ALL})
	@JoinColumn(name="fk_idcard_id")
	private IdCardBean customerIdcardBean;//客户的身份证

	public CustomerBean(){

	}

	/**
	 * 得到客户的id
	 * @return the customerId
	 */
	public int getCustomerId() {
		return customerId;
	}

	/**
	 * 设置客户的id
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	/**
	 * 得到客户的希望申请最长还款期限
	 * @return the customer_lendTime
	 */
	public Date getCustomer_lendTime() {
		return customer_lendTime;
	}

	/**
	 * 设置客户的希望申请最长还款期限
	 * @param customer_lendTime the customer_lendTime to set
	 */
	public void setCustomer_lendTime(Date customer_lendTime) {
		this.customer_lendTime = customer_lendTime;
	}

	/**
	 * 得到客户的车贷申请表
	 * @return the customerApplication
	 */
	public String getCustomerApplication() {
		return customerApplication;
	}

	/**
	 * 设置客户的车贷申请表
	 * @param customerApplication the customerApplication to set
	 */
	public void setCustomerApplication(String customerApplication) {
		this.customerApplication = customerApplication;
	}

	/**
	 * 得到客户的有无子女的情况
	 * @return the customerChild
	 */
	public String getCustomerChild() {
		return customerChild;
	}

	/**
	 * 设置客户的有无子女的情况
	 * @param customerChild the customerChild to set
	 */
	public void setCustomerChild(String customerChild) {
		this.customerChild = customerChild;
	}

	/**
	 * 得到客户的有误共同的居住者情况
	 * @return the customerChum
	 */
	public String getCustomerChum() {
		return customerChum;
	}

	/**
	 * 设置客户的有误共同的居住者情况
	 * @param customerChum the customerChum to set
	 */
	public void setCustomerChum(String customerChum) {
		this.customerChum = customerChum;
	}

	/**
	 * 得到客户的单位的地址
	 * @return the customerComAdderss
	 */
	public String getCustomerComAdderss() {
		return customerComAdderss;
	}

	/**
	 * 设置客户的单位的地址
	 * @param customerComAdderss the customerComAdderss to set
	 */
	public void setCustomerComAdderss(String customerComAdderss) {
		this.customerComAdderss = customerComAdderss;
	}

	/**
	 * 得到客户的车贷专员
	 * @return the customerCommissioner
	 */
	public String getCustomerCommissioner() {
		return customerCommissioner;
	}

	/**
	 * 设置客户的车贷专员
	 * @param customerCommissioner the customerCommissioner to set
	 */
	public void setCustomerCommissioner(String customerCommissioner) {
		this.customerCommissioner = customerCommissioner;
	}

	/**
	 * 得到客户的单位电话
	 * @return the customerComNun
	 */
	public int getCustomerComNun() {
		return customerComNun;
	}

	/**
	 * 设置客户的单位电话
	 * @param customerComNun the customerComNun to set
	 */
	public void setCustomerComNun(int customerComNun) {
		this.customerComNun = customerComNun;
	}

	/**
	 * 得到客户的单位的全名
	 * @return the customerCompany
	 */
	public String getCustomerCompany() {
		return customerCompany;
	}

	/**
	 * 设置客户的单位的全名
	 * @param customerCompany the customerCompany to set
	 */
	public void setCustomerCompany(String customerCompany) {
		this.customerCompany = customerCompany;
	}

	/**
	 * 得到客户的申请日期
	 * @return the customerDate
	 */
	public Date getCustomerDate() {
		return customerDate;
	}

	/**
	 * 设置客户的申请日期
	 * @param customerDate the customerDate to set
	 */
	public void setCustomerDate(Date customerDate) {
		this.customerDate = customerDate;
	}

	/**
	 * 得到客户的借款用途
	 * @return the customerDemand
	 */
	public String getCustomerDemand() {
		return customerDemand;
	}

	/**
	 * 设置客户的借款用途
	 * @param customerDemand the customerDemand to set
	 */
	public void setCustomerDemand(String customerDemand) {
		this.customerDemand = customerDemand;
	}

	/**
	 * 得到客户在单位所在的部门
	 * @return the customerDepartment
	 */
	public String getCustomerDepartment() {
		return customerDepartment;
	}

	/**
	 * 设置客户在单位所在的部门
	 * @param customerDepartment the customerDepartment to set
	 */
	public void setCustomerDepartment(String customerDepartment) {
		this.customerDepartment = customerDepartment;
	}

	/**
	 * 得到客户在单位的职位
	 * @return the customerDuty
	 */
	public String getCustomerDuty() {
		return customerDuty;
	}

	/**
	 * 设置客户在单位的职位
	 * @param customerDuty the customerDuty to set
	 */
	public void setCustomerDuty(String customerDuty) {
		this.customerDuty = customerDuty;
	}

	/**
	 * 得到客户的最高学历
	 * @return the customerEducation
	 */
	public String getCustomerEducation() {
		return customerEducation;
	}

	/**
	 * 设置客户的最高学历
	 * @param customerEducation the customerEducation to set
	 */
	public void setCustomerEducation(String customerEducation) {
		this.customerEducation = customerEducation;
	}

	/**
	 * 得到客户的申请资料的其他附件
	 * @return the customerEnclosure
	 */
	public String getCustomerEnclosure() {
		return customerEnclosure;
	}

	/**
	 * 设置客户的申请资料的其他附件
	 * @param customerEnclosure the customerEnclosure to set
	 */
	public void setCustomerEnclosure(String customerEnclosure) {
		this.customerEnclosure = customerEnclosure;
	}

	/**
	 * 得到客户的房产状态
	 * @return the customerHouse
	 */
	public String getCustomerHouse() {
		return customerHouse;
	}

	/**
	 * 设置客户的房产状态
	 * @param customerHouse the customerHouse to set
	 */
	public void setCustomerHouse(String customerHouse) {
		this.customerHouse = customerHouse;
	}

	/**
	 * 得到客户的身份证（原件）
	 * @return the customerIdcard
	 */
	public String getCustomerIdcard() {
		return customerIdcard;
	}

	/**
	 * 设置客户的身份证（原件）
	 * @param customerIdcard the customerIdcard to set
	 */
	public void setCustomerIdcard(String customerIdcard) {
		this.customerIdcard = customerIdcard;
	}

	/**
	 * 得到
	 * @return the customerIendLimit
	 */
	public int getCustomerIendLimit() {
		return customerIendLimit;
	}

	/**
	 * 设置客户所希望借款的额度
	 * @param customerIendLimit the customerIendLimit to set
	 */
	public void setCustomerIendLimit(int customerIendLimit) {
		this.customerIendLimit = customerIendLimit;
	}

	/**
	 * 得到客户的月收入
	 * @return the customerIncome
	 */
	public int getCustomerIncome() {
		return customerIncome;
	}

	/**
	 * 设置客户的月收入
	 * @param customerIncome the customerIncome to set
	 */
	public void setCustomerIncome(int customerIncome) {
		this.customerIncome = customerIncome;
	}

	/**
	 * 得到客户进入单位的时间
	 * @return the customerJoinCom
	 */
	public Date getCustomerJoinCom() {
		return customerJoinCom;
	}

	/**
	 * 设置客户进入单位的时间
	 * @param customerJoinCom the customerJoinCom to set
	 */
	public void setCustomerJoinCom(Date customerJoinCom) {
		this.customerJoinCom = customerJoinCom;
	}

	/**
	 * 得到客户是如何知道惠普的
	 * @return the customerKnow
	 */
	public String getCustomerKnow() {
		return customerKnow;
	}

	/**
	 * 设置客户是如何知道惠普的
	 * @param customerKnow the customerKnow to set
	 */
	public void setCustomerKnow(String customerKnow) {
		this.customerKnow = customerKnow;
	}

	/**
	 * 得到客户是否结婚的情况
	 * @return the customerMarry
	 */
	public String getCustomerMarry() {
		return customerMarry;
	}

	/**
	 * 设置客户是否结婚的情况
	 * @param customerMarry the customerMarry to set
	 */
	public void setCustomerMarry(String customerMarry) {
		this.customerMarry = customerMarry;
	}

	/**
	 * 得到客户的现居住地的地址
	 * @return the customerNewAddress
	 */
	public String getCustomerNewAddress() {
		return customerNewAddress;
	}

	/**
	 * 设置客户的现居住地的地址
	 * @param customerNewAddress the customerNewAddress to set
	 */
	public void setCustomerNewAddress(String customerNewAddress) {
		this.customerNewAddress = customerNewAddress;
	}

	/**
	 * 得到客户可承受的还款额度
	 * @return the customerPayLimit
	 */
	public int getCustomerPayLimit() {
		return customerPayLimit;
	}

	/**
	 * 设置客户可承受的还款额度
	 * @param customerPayLimit the customerPayLimit to set
	 */
	public void setCustomerPayLimit(int customerPayLimit) {
		this.customerPayLimit = customerPayLimit;
	}

	/**
	 * 得到客户的手机号码
	 * @return the customerPhone
	 */
	public int getCustomerPhone() {
		return customerPhone;
	}

	/**
	 * 设置客户的手机号码
	 * @param customerPhone the customerPhone to set
	 */
	public void setCustomerPhone(int customerPhone) {
		this.customerPhone = customerPhone;
	}

	/**
	 * 得到客户的居住地的邮政编码
	 * @return the customerPostcode
	 */
	public int getCustomerPostcode() {
		return customerPostcode;
	}

	/**
	 * 设置客户的居住地的邮政编码
	 * @param customerPostcode the customerPostcode to set
	 */
	public void setCustomerPostcode(int customerPostcode) {
		this.customerPostcode = customerPostcode;
	}

	/**
	 * 得到客户所在单位的类型
	 * @return the customerQuality
	 */
	public String getCustomerQuality() {
		return customerQuality;
	}

	/**
	 * 设置客户所在单位的类型
	 * @param customerQuality the customerQuality to set
	 */
	public void setCustomerQuality(String customerQuality) {
		this.customerQuality = customerQuality;
	}

	/**
	 * 得到客户的业务员姓名
	 * @return the customerSaleman
	 */
	public String getCustomerSaleman() {
		return customerSaleman;
	}

	/**
	 * 设置客户的业务员姓名
	 * @param customerSaleman the customerSaleman to set
	 */
	public void setCustomerSaleman(String customerSaleman) {
		this.customerSaleman = customerSaleman;
	}

	/**
	 * 得到客户所在单位的规模
	 * @return the customerScale
	 */
	public int getCustomerScale() {
		return customerScale;
	}

	/**
	 * 设置客户所在单位的规模
	 * @param customerScale the customerScale to set
	 */
	public void setCustomerScale(int customerScale) {
		this.customerScale = customerScale;
	}

	/**
	 * 得到客户所在 行业的类别
	 * @return the customerSort
	 */
	public String getCustomerSort() {
		return customerSort;
	}

	/**
	 * 设置客户所在 行业的类别
	 * @param customerSort the customerSort to set
	 */
	public void setCustomerSort(String customerSort) {
		this.customerSort = customerSort;
	}

	/**
	 * 得到客户的电话号码
	 * @return the customerTel
	 */
	public int getCustomerTel() {
		return customerTel;
	}

	/**
	 * 设置客户的电话号码
	 * @param customerTel the customerTel to set
	 */
	public void setCustomerTel(int customerTel) {
		this.customerTel = customerTel;
	}

	/**
	 * 得到客户的类别
	 * @return the customerType
	 */
	public String getCustomerType() {
		return customerType;
	}

	/**
	 * 设置客户的类别
	 * @param customerType the customerType to set
	 */
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	/**
	 * 得到客户的身份证
	 * @return the customerIdcardBean
	 */
	public IdCardBean getCustomerIdcardBean() {
		return customerIdcardBean;
	}

	/**
	 * 设置客户的身份证
	 * @param customerIdcardBean the customerIdcardBean to set
	 */
	public void setCustomerIdcardBean(IdCardBean customerIdcardBean) {
		this.customerIdcardBean = customerIdcardBean;
	}

	/**
	 * 得到客户联系人的集合
	 * @return the customerContactsList
	 */
	public Set<ContactsBean> getCustomerContactsList() {
		return customerContactsList;
	}

	/**
	 * 设置客户联系人
	 * @param customerContactsList the customerContactsList to set
	 */
	public void setCustomerContactsList(Set<ContactsBean> customerContactsList) {
		this.customerContactsList = customerContactsList;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CustomerBean [customerId=" + customerId + ", customer_lendTime=" + customer_lendTime
				+ ", customerApplication=" + customerApplication + ", customerChild=" + customerChild
				+ ", customerChum=" + customerChum + ", customerComAdderss=" + customerComAdderss
				+ ", customerCommissioner=" + customerCommissioner + ", customerComNun=" + customerComNun
				+ ", customerCompany=" + customerCompany + ", customerDate=" + customerDate + ", customerDemand="
				+ customerDemand + ", customerDepartment=" + customerDepartment + ", customerDuty=" + customerDuty
				+ ", customerEducation=" + customerEducation + ", customerEnclosure=" + customerEnclosure
				+ ", customerHouse=" + customerHouse + ", customerIdcard=" + customerIdcard + ", customerIendLimit="
				+ customerIendLimit + ", customerIncome=" + customerIncome + ", customerJoinCom=" + customerJoinCom
				+ ", customerKnow=" + customerKnow + ", customerMarry=" + customerMarry + ", customerNewAddress="
				+ customerNewAddress + ", customerPayLimit=" + customerPayLimit + ", customerPhone=" + customerPhone
				+ ", customerPostcode=" + customerPostcode + ", customerQuality=" + customerQuality
				+ ", customerSaleman=" + customerSaleman + ", customerScale=" + customerScale + ", customerSort="
				+ customerSort + ", customerTel=" + customerTel + ", customerType=" + customerType
				+ ", customerContactsList=" + customerContactsList + ", customerIdcardBean=" + customerIdcardBean + "]";
	}

	

}