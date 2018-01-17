package org.project.loan.beans;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * 车贷产品类
 * 
 * @author zou
 *
 */
@Entity
public class ProductBean implements Serializable {
	@Id
	@Column
	@GenericGenerator(name="hibernate.strategy", strategy="identity")
	@GeneratedValue(generator="hibernate.strategy")
	private int productsId;// 产品id

	private String productsName;// 产品名称

	private int productsPeriods;// 贷款期数

	private double productsRate;// 贷款年利率

	private double productsMaxmoney;// 可贷最高额度
	
	public ProductBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    /**
     * 得到产品id
     * @return
     */
	public int getProductsId() {
		return productsId;
	}
    
	/**
	 *設置产品id
	 * @param productsId
	 */
	public void setProductsId(int productsId) {
		this.productsId = productsId;
	}
	
	/**
	 *得到产品名称
	 * @return
	 */

	public String getProductsName() {
		return productsName;
	}
	
	/**
	 * 设置产品名称
	 * @param productsName
	 */

	public void setProductsName(String productsName) {
		this.productsName = productsName;
	}
   /**
    * 得到贷款期数
    * @return
    */
	public int getProductsPeriods() {
		return productsPeriods;
	}
	/**
	 * 设置贷款期数
	 * @param productsPeriods
	 */

	public void setProductsPeriods(int productsPeriods) {
		this.productsPeriods = productsPeriods;
	}
    
	/**
	 * 得到贷款年利率
	 * @return
	 */
	public double getProductsRate() {
		return productsRate;
	}
    /**
     * 设置贷款年利率
     * @param productsRate
     */
	public void setProductsRate(double productsRate) {
		this.productsRate = productsRate;
	}
    /**
     * 得到可贷的最大金额
     * @return
     */
	public double getProductsMaxmoney() {
		return productsMaxmoney;
	}
	/**
	 * 设置可贷的最大金额
	 * @param productsMaxmoney
	 */

	public void setProductsMaxmoney(double productsMaxmoney) {
		this.productsMaxmoney = productsMaxmoney;
	}

	@Override
	public String toString() {
		return "Products [productsId=" + productsId + ", productsName=" + productsName + ", productsPeriods="
				+ productsPeriods + ", productsRate=" + productsRate + ", productsMaxmoney=" + productsMaxmoney + "]";
	}

	
	
	
	

}
