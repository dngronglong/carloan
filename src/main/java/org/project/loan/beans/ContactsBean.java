package org.project.loan.beans;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * 客户的联系人实体类
 * @author 李山
 *
 */
@Entity
public class ContactsBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	@GenericGenerator(name="hibernate.strategy", strategy="identity")
	@GeneratedValue(generator="hibernate.strategy")
	private int contactsId;//联系人的id
	private String contactsName;//联系人的姓名
	private int contactsPhone;//联系人的电话号码
	private String contactsAddress;//联系人的家庭住址或单位地址
	private String contactsCompany;//联系人的单位名称
	private String contactsRelation;//联系人客户的关系
	private String contactsType;//联系人的类型

	public ContactsBean(){

	}

	/**
	 * 得到联系人的id
	 * @return the contactsId
	 */
	public int getContactsId() {
		return contactsId;
	}

	/**
	 * 设置联系人的id
	 * @param contactsId the contactsId to set
	 */
	public void setContactsId(int contactsId) {
		this.contactsId = contactsId;
	}

	/**
	 * 得到联系人的姓名
	 * @return the contactsName
	 */
	public String getContactsName() {
		return contactsName;
	}

	/**
	 * 设置联系人的姓名
	 * @param contactsName the contactsName to set
	 */
	public void setContactsName(String contactsName) {
		this.contactsName = contactsName;
	}

	/**
	 * 得到联系人的电话号码
	 * @return the contactsPhone
	 */
	public int getContactsPhone() {
		return contactsPhone;
	}

	/**
	 * 设置联系人的电话号码
	 * @param contactsPhone the contactsPhone to set
	 */
	public void setContactsPhone(int contactsPhone) {
		this.contactsPhone = contactsPhone;
	}

	/**
	 * 得到联系人的的家庭地址或单位地址
	 * @return the contactsAddress
	 */
	public String getContactsAddress() {
		return contactsAddress;
	}

	/**
	 * 设置联系人的家庭地址或单位地址
	 * @param contactsAddress the contactsAddress to set
	 */
	public void setContactsAddress(String contactsAddress) {
		this.contactsAddress = contactsAddress;
	}

	/**
	 * 得到联系人的单位名称
	 * @return the contactsCompany
	 */
	public String getContactsCompany() {
		return contactsCompany;
	}

	/**
	 * 设置联系人的单位名称
	 * @param contactsCompany the contactsCompany to set
	 */
	public void setContactsCompany(String contactsCompany) {
		this.contactsCompany = contactsCompany;
	}

	/**
	 * 得到联系人的与客服的关系
	 * @return the contactsRelation
	 */
	public String getContactsRelation() {
		return contactsRelation;
	}

	/**
	 * 设置联系人的与客户的关系
	 * @param contactsRelation the contactsRelation to set
	 */
	public void setContactsRelation(String contactsRelation) {
		this.contactsRelation = contactsRelation;
	}

	/**
	 * 得到联系人的类型
	 * @return the contactsType
	 */
	public String getContactsType() {
		return contactsType;
	}

	/**
	 * 设置联系人的类型
	 * @param contactsType the contactsType to set
	 */
	public void setContactsType(String contactsType) {
		this.contactsType = contactsType;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ContactsBean [contactsId=" + contactsId + ", contactsName=" + contactsName + ", contactsPhone="
				+ contactsPhone + ", contactsAddress=" + contactsAddress + ", contactsCompany=" + contactsCompany
				+ ", contactsRelation=" + contactsRelation + ", contactsType=" + contactsType + "]";
	}

	

}