package org.project.loan.beans;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.Serializable;

/**
 * 公司的实体类
 * @author 李山
 *
 */
@Entity
@Table(name="t_company")
public class CompanyBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	@GenericGenerator(name="hibernate.strategy", strategy="identity")
	@GeneratedValue(generator="hibernate.strategy")
	private int companyId;//公司的id
	
	@Column(name="company_name")
	private String companyName;//公司的名字
	
	public CompanyBean() {
		super();
	}

	/**
	 * 得到公司的id
	 * @return the companyId
	 */
	public int getCompanyId() {
		return companyId;
	}

	/**
	 * 设置公司的id
	 * @param companyId the companyId to set
	 */
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	/**
	 * 得到公司的名字
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * 设置公司的名字
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CompanyBean [companyId=" + companyId + ", companyName=" + companyName + "]";
	}
	
	
	
	

}
