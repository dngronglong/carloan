package org.project.loan.beans;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * 车内物品的实体类
 * @author 李山
 *
 */
@Entity
public class CarGoodsBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="cargoods_id")
	@GenericGenerator(name="hibernate.strategy", strategy="identity")
	@GeneratedValue(generator="hibernate.strategy")
	private int id;//w物品的id
	
	@Column(name="cargoods_name")
	private String cargoodsName;//物品的名字
	
	@Column(name="cargoods_num")
	private int cargoodsNum;//该物品的数量

	public CarGoodsBean() {
		super();
	}

	/**
	 * 得到物品的id
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * 设置物品的id
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 得到物品的名字
	 * @return the cargoodsName
	 */
	public String getCargoodsName() {
		return cargoodsName;
	}

	/**
	 * 设置物品的名字
	 * @param cargoodsName the cargoodsName to set
	 */
	public void setCargoodsName(String cargoodsName) {
		this.cargoodsName = cargoodsName;
	}

	/**
	 * 得到物品的数量
	 * @return the cargoodsNum
	 */
	public int getCargoodsNum() {
		return cargoodsNum;
	}

	/**
	 * 设置物品的数量
	 * @param cargoodsNum the cargoodsNum to set
	 */
	public void setCargoodsNum(int cargoodsNum) {
		this.cargoodsNum = cargoodsNum;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CarGoodsBean [id=" + id + ", cargoodsName=" + cargoodsName + ", cargoodsNum=" + cargoodsNum + "]";
	}
	
	
	
	
	
}
