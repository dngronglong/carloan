package org.project.loan.beans;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * 角色的实体类
 * @author 李山
 *
 */
@Entity
public class RoleBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	@GenericGenerator(name="hibernate.strategy", strategy="identity")
	@GeneratedValue(generator="hibernate.strategy")
	private int roleId;//角色的id
	private String roleName;//角色的名字
	
	
	public RoleBean() {
		super();
	}


	/**
	 * 得到角色的id
	 * @return the roleId
	 */
	public int getRoleId() {
		return roleId;
	}


	/**
	 * 设置角色的id
	 * @param roleId the roleId to set
	 */
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}


	/**
	 * 得到角色的名字
	 * @return the roleName
	 */
	public String getRoleName() {
		return roleName;
	}


	/**
	 * 设置角色的名字
	 * @param roleName the roleName to set
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RoleBean [roleId=" + roleId + ", roleName=" + roleName + "]";
	}
	
	

}
