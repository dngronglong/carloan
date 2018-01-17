package org.project.loan.beans;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * 用户权限的实体类
 * @author 李山
 *
 */
@Entity
public class PowerBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	@GenericGenerator(name="hibernate.strategy", strategy="identity")
	@GeneratedValue(generator="hibernate.strategy")
	private int powerId;//权限的id
	private String powerName;//权限的名字
	private String powerURL;//权限的路径
	
	
	public PowerBean() {
		super();
	}


	/**
	 * 得到权限的id
	 * @return the powerId
	 */
	public int getPowerId() {
		return powerId;
	}


	/**
	 * 设置权限的id
	 * @param powerId the powerId to set
	 */
	public void setPowerId(int powerId) {
		this.powerId = powerId;
	}


	/**
	 * 得到权限的名字
	 * @return the powerName
	 */
	public String getPowerName() {
		return powerName;
	}


	/**
	 * 设置权限的名字
	 * @param powerName the powerName to set
	 */
	public void setPowerName(String powerName) {
		this.powerName = powerName;
	}


	/**
	 * 得到权限的路径
	 * @return the powerURL
	 */
	public String getPowerURL() {
		return powerURL;
	}


	/**
	 * 设置权限的路径
	 * @param powerURL the powerURL to set
	 */
	public void setPowerURL(String powerURL) {
		this.powerURL = powerURL;
	}


	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PowerBean [powerId=" + powerId + ", powerName=" + powerName + ", powerURL=" + powerURL + "]";
	}

}
