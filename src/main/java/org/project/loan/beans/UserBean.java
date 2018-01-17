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

import java.io.Serializable;

/**
 * 用户的实体类
 * @author 李山
 *
 */
@Entity
@Table(name="t_user")
public class UserBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="user_id")
	@GenericGenerator(name="hibernate.strategy", strategy="identity")
	@GeneratedValue(generator="hibernate.strategy")
	private int userId;//用户的id
	
	@Column(name="user_name")
	private String userName;//用户的名字
	
	@Column(name="user_loginname")
	private String userLoginName;//用户的登录名字
	
	@Column(name="user_password")
	private String userPassword;//用户的登录密码
	
	@ManyToOne(fetch=FetchType.LAZY)
	@Cascade(value= {CascadeType.SAVE_UPDATE})
	@JoinColumn(name="fk_companyid")
	private CompanyBean userCompanyBean;//用户所在的公司
	
	@ManyToOne(fetch=FetchType.LAZY)
	@Cascade(value= {CascadeType.SAVE_UPDATE})
	@JoinColumn(name="fk_roleid")
	private RoleBean userRoleBean;//用户的角色
	
	public UserBean() {
		super();
	}

	/**
	 * 得到用户的id
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * 设置用户的id
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * 得到用户的姓名
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * 设置用户的姓名
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * 得到
	 * @return the userLoginName
	 */
	public String getUserLoginName() {
		return userLoginName;
	}

	/**
	 * 设置用户的登录名
	 * @param userLoginName the userLoginName to set
	 */
	public void setUserLoginName(String userLoginName) {
		this.userLoginName = userLoginName;
	}

	/**
	 * 得到用户的登录密码
	 * @return the userPassword
	 */
	public String getUserPassword() {
		return userPassword;
	}

	/**
	 * 设置用户的登录密码
	 * @param userPassword the userPassword to set
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	/**
	 * 得到用户所在的公司
	 * @return the userCompanyBean
	 */
	public CompanyBean getUserCompanyBean() {
		return userCompanyBean;
	}

	/**
	 * 设置用户所在的公司
	 * @param userCompanyBean the userCompanyBean to set
	 */
	public void setUserCompanyBean(CompanyBean userCompanyBean) {
		this.userCompanyBean = userCompanyBean;
	}

	/**
	 * 得到用户的角色
	 * @return the userRoleBean
	 */
	public RoleBean getUserRoleBean() {
		return userRoleBean;
	}

	/**
	 * 设置用户的角色
	 * @param userRoleBean the userRoleBean to set
	 */
	public void setUserRoleBean(RoleBean userRoleBean) {
		this.userRoleBean = userRoleBean;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserBean [userId=" + userId + ", userName=" + userName + ", userLoginName=" + userLoginName
				+ ", userPassword=" + userPassword + ", userCompanyBean=" + userCompanyBean + ", userRoleBean="
				+ userRoleBean + "]";
	}
	
	
	
    
}
