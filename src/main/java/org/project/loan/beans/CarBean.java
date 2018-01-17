package org.project.loan.beans;

import org.hibernate.annotations.GenericGenerator;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * 车辆的实体类
 * 
 * @author 李山
 *
 */
@Entity
@Table(name = "t_car")
public class CarBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "car_id")
	@GenericGenerator(name = "hibernate.strategy", strategy = "identity")
	@GeneratedValue(generator = "hibernate.strategy")
	private int carId;// 车辆的id

	@Column(name = "car_number")
	private String carNumber;// 车牌号码

	@Column(name = "car_model")
	private String carModel;// 车辆的厂牌型号

	@Column(name = "car_engine")
	private String carEngine;// 车辆的发动机号

	@Column(name = "car_color")
	private String carColor;// 车辆的颜色

	@Column(name = "car_onedata")
	private Date carOnedata;// 车辆的初次登记日期

	@Column(name = "car_twodata")
	private Date carTwodata;// 车辆的年检有效期

	@Column(name = "car_frame")
	private String carFrame;// 车辆的车架号

	@Column(name = "car_price")
	private double carPrice;// 车辆的车辆评估价格

	@Column(name = "car_mileage")
	private double carMileage;// 车辆目前已行驶里程

	@Column(name = "car_idcard")
	private String carIdcard;// 是否交付身份证以及交付身份证的类型֤

	@Column(name = "car_permit")
	private String carPermit;// 车辆的车辆购置证֤

	@Column(name = "car_traffic")
	private String carTraffic;// 车辆的交强保险单

	@Column(name = "car_key")
	private String carKey;// 车辆的钥匙

	@Column(name = "car_registration")
	private String carRegistration;// 车辆的机动车登记证֤

	@Column(name = "car_business")
	private String carBusiness;// 车辆的商业保险单

	@Column(name = "car_travel")
	private String carTravel;// 车辆的车辆行驶证֤

	@Column(name = "car_invoice")
	private String carInvoice;// 车辆的车辆原始发票

	@Column(name = "car_tax")
	private String carTax;// 车辆的车辆完税证֤

	@Column(name = "car_import")
	private String carImport;// 进口车辆的进口车辆证明

	@Column(name = "car_assessment")
	private String carAssessment;// 车辆的抵押车辆评估表(附件)

	@Column(name = "car_photo")
	private String carPhoto;// 车辆的照片(附件)

	@Column(name = "car_certificate")
	private String carCertificate;// 车辆的车辆登记证书(附件)

	@Column(name = "car_driving")
	private String carDriving;// 车辆的行驶证副本(附件)

	@Column(name = "car_commercial")
	private String carCommercial;// 车辆的保单（商业险)(附件)

	@Column(name = "car_insurance")
	private String carInsurance;// 车辆的保单（交强险）（附件）

	@Column(name = "car_other")
	private String carOther;// 车辆的其他附件

	@OneToMany
	private List<CarGoodsBean> cgbList;// 车内物品

	public CarBean() {
		super();
	}

	/**
	 * 得到车辆的id
	 * 
	 * @return the carId
	 */
	public int getCarId() {
		return carId;
	}

	/**
	 * 设置车辆的id
	 * 
	 * @param carId
	 *            the carId to set
	 */
	public void setCarId(int carId) {
		this.carId = carId;
	}

	/**
	 * 得到车辆的车牌号码
	 * 
	 * @return the carNumber
	 */
	public String getCarNumber() {
		return carNumber;
	}

	/**
	 * 设置车辆的车牌号码
	 * 
	 * @param carNumber
	 *            the carNumber to set
	 */
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	/**
	 * 得到车辆的厂牌型号
	 * 
	 * @return the carModel
	 */
	public String getCarModel() {
		return carModel;
	}

	/**
	 * 设置车辆的厂牌型号
	 * 
	 * @param carModel
	 *            the carModel to set
	 */
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	/**
	 * 得到车辆的发动机号码
	 * 
	 * @return the carEngine
	 */
	public String getCarEngine() {
		return carEngine;
	}

	/**
	 * 设置车辆的发动机号码
	 * 
	 * @param carEngine
	 *            the carEngine to set
	 */
	public void setCarEngine(String carEngine) {
		this.carEngine = carEngine;
	}

	/**
	 * 得到车辆的颜色
	 * 
	 * @return the carColor
	 */
	public String getCarColor() {
		return carColor;
	}

	/**
	 * 设置车辆的颜色
	 * 
	 * @param carColor
	 *            the carColor to set
	 */
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	/**
	 * 得到车辆的初次登记日期
	 * 
	 * @return the carOnedata
	 */
	public Date getCarOnedata() {
		return carOnedata;
	}

	/**
	 * 设置车辆的初次登记日期
	 * 
	 * @param carOnedata
	 *            the carOnedata to set
	 */
	public void setCarOnedata(Date carOnedata) {
		this.carOnedata = carOnedata;
	}

	/**
	 * 得到车辆的年检有效期
	 * 
	 * @return the carTwodata
	 */
	public Date getCarTwodata() {
		return carTwodata;
	}

	/**
	 * 设置车辆的年检有效期
	 * 
	 * @param carTwodata
	 *            the carTwodata to set
	 */
	public void setCarTwodata(Date carTwodata) {
		this.carTwodata = carTwodata;
	}

	/**
	 * 得到车辆的的车架编号
	 * 
	 * @return the carFrame
	 */
	public String getCarFrame() {
		return carFrame;
	}

	/**
	 * 设置车辆的的车架编号
	 * 
	 * @param carFrame
	 *            the carFrame to set
	 */
	public void setCarFrame(String carFrame) {
		this.carFrame = carFrame;
	}

	/**
	 * 得到车辆的评估价格
	 * 
	 * @return the carPrice
	 */
	public double getCarPrice() {
		return carPrice;
	}

	/**
	 * 设置车辆的评估价格
	 * 
	 * @param carPrice
	 *            the carPrice to set
	 */
	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}

	/**
	 * 得到车辆的已行驶里程
	 * 
	 * @return the carMileage
	 */
	public double getCarMileage() {
		return carMileage;
	}

	/**
	 * 设置车辆的已行驶里程
	 * 
	 * @param carMileage
	 *            the carMileage to set
	 */
	public void setCarMileage(double carMileage) {
		this.carMileage = carMileage;
	}

	/**
	 * 得到车辆所属人是否交付身份证以及交付身份证的类型
	 * 
	 * @return the carIdcard
	 */
	public String getCarIdcard() {
		return carIdcard;
	}

	/**
	 * 设置车辆所属人是否交付身份证以及交付身份证的类型
	 * 
	 * @param carIdcard
	 *            the carIdcard to set
	 */
	public void setCarIdcard(String carIdcard) {
		this.carIdcard = carIdcard;
	}

	/**
	 * 得到车辆的购置证
	 * 
	 * @return the carPermit
	 */
	public String getCarPermit() {
		return carPermit;
	}

	/**
	 * 设置车辆的购置证
	 * 
	 * @param carPermit
	 *            the carPermit to set
	 */
	public void setCarPermit(String carPermit) {
		this.carPermit = carPermit;
	}

	/**
	 * 得到车辆的交强险保单
	 * 
	 * @return the carTraffic
	 */
	public String getCarTraffic() {
		return carTraffic;
	}

	/**
	 * 设置车辆的交强险保单
	 * 
	 * @param carTraffic
	 *            the carTraffic to set
	 */
	public void setCarTraffic(String carTraffic) {
		this.carTraffic = carTraffic;
	}

	/**
	 * 得到车辆的钥匙
	 * 
	 * @return the carKey
	 */
	public String getCarKey() {
		return carKey;
	}

	/**
	 * 设置车辆的钥匙
	 * 
	 * @param carKey
	 *            the carKey to set
	 */
	public void setCarKey(String carKey) {
		this.carKey = carKey;
	}

	/**
	 * 得到车辆的机动车登记证
	 * 
	 * @return the carRegistration
	 */
	public String getCarRegistration() {
		return carRegistration;
	}

	/**
	 * 设置车辆的机动车登记证
	 * 
	 * @param carRegistration
	 *            the carRegistration to set
	 */
	public void setCarRegistration(String carRegistration) {
		this.carRegistration = carRegistration;
	}

	/**
	 * 得到车辆的商业保险
	 * 
	 * @return the carBusiness
	 */
	public String getCarBusiness() {
		return carBusiness;
	}

	/**
	 * 设置车辆的商业保险
	 * 
	 * @param carBusiness
	 *            the carBusiness to set
	 */
	public void setCarBusiness(String carBusiness) {
		this.carBusiness = carBusiness;
	}

	/**
	 * 得到车辆的行驶证
	 * 
	 * @return the carTravel
	 */
	public String getCarTravel() {
		return carTravel;
	}

	/**
	 * 设置车辆的行驶证
	 * 
	 * @param carTravel
	 *            the carTravel to set
	 */
	public void setCarTravel(String carTravel) {
		this.carTravel = carTravel;
	}

	/**
	 * 得到车辆的原始发票
	 * 
	 * @return the carInvoice
	 */
	public String getCarInvoice() {
		return carInvoice;
	}

	/**
	 * 设置车辆的原始发票
	 * 
	 * @param carInvoice
	 *            the carInvoice to set
	 */
	public void setCarInvoice(String carInvoice) {
		this.carInvoice = carInvoice;
	}

	/**
	 * 得到车辆的完税证明
	 * 
	 * @return the carTax
	 */
	public String getCarTax() {
		return carTax;
	}

	/**
	 * 设置车辆的完税证明
	 * 
	 * @param carTax
	 *            the carTax to set
	 */
	public void setCarTax(String carTax) {
		this.carTax = carTax;
	}

	/**
	 * 得到车辆的进口证明（如果是进口车）
	 * 
	 * @return the carImport
	 */
	public String getCarImport() {
		return carImport;
	}

	/**
	 * 设置车辆的进口证明（如果是进口车）
	 * 
	 * @param carImport
	 *            the carImport to set
	 */
	public void setCarImport(String carImport) {
		this.carImport = carImport;
	}

	/**
	 * 得到车辆的抵押车辆评估表(附件)
	 * 
	 * @return the carAssessment
	 */
	public String getCarAssessment() {
		return carAssessment;
	}

	/**
	 * 设置车辆的抵押车辆评估表(附件)
	 * 
	 * @param carAssessment
	 *            the carAssessment to set
	 */
	public void setCarAssessment(String carAssessment) {
		this.carAssessment = carAssessment;
	}

	/**
	 * 得到车辆的照片
	 * 
	 * @return the carPhoto
	 */
	public String getCarPhoto() {
		return carPhoto;
	}

	/**
	 * 设置车辆的照片
	 * 
	 * @param carPhoto
	 *            the carPhoto to set
	 */
	public void setCarPhoto(String carPhoto) {
		this.carPhoto = carPhoto;
	}

	/**
	 * 得到车辆的车辆登记证书(附件)
	 * 
	 * @return the carCertificate
	 */
	public String getCarCertificate() {
		return carCertificate;
	}

	/**
	 * 设置车辆的车辆登记证书(附件)
	 * 
	 * @param carCertificate
	 *            the carCertificate to set
	 */
	public void setCarCertificate(String carCertificate) {
		this.carCertificate = carCertificate;
	}

	/**
	 * 得到车辆的车辆行驶证副本(附件)
	 * 
	 * @return the carDriving
	 */
	public String getCarDriving() {
		return carDriving;
	}

	/**
	 * 设置车辆的车辆行驶证副本(附件)
	 * 
	 * @param carDriving
	 *            the carDriving to set
	 */
	public void setCarDriving(String carDriving) {
		this.carDriving = carDriving;
	}

	/**
	 * 得到车辆的保单（商业险)(附件)
	 * 
	 * @return the carCommercial
	 */
	public String getCarCommercial() {
		return carCommercial;
	}

	/**
	 * 设置车辆的保单（商业险)(附件)
	 * 
	 * @param carCommercial
	 *            the carCommercial to set
	 */
	public void setCarCommercial(String carCommercial) {
		this.carCommercial = carCommercial;
	}

	/**
	 * 得到车辆的保单（交强险）（附件）
	 * 
	 * @return the carInsurance
	 */
	public String getCarInsurance() {
		return carInsurance;
	}

	/**
	 * 设置车辆的保单（交强险）（附件）
	 * 
	 * @param carInsurance
	 *            the carInsurance to set
	 */
	public void setCarInsurance(String carInsurance) {
		this.carInsurance = carInsurance;
	}

	/**
	 * 得到车辆的其他附件
	 * 
	 * @return the carOther
	 */
	public String getCarOther() {
		return carOther;
	}

	/**
	 * 设置车辆的其他附件
	 * 
	 * @param carOther
	 *            the carOther to set
	 */
	public void setCarOther(String carOther) {
		this.carOther = carOther;
	}

	/**
	 * 得到车辆内的物品集合
	 * 
	 * @return the cgbList
	 */
	public List<CarGoodsBean> getCgbList() {
		return cgbList;
	}

	/**
	 * 设置车辆内的物品集合
	 * 
	 * @param cgbList
	 *            the cgbList to set
	 */
	public void setCgbList(List<CarGoodsBean> cgbList) {
		this.cgbList = cgbList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CarBean [carId=" + carId + ", carNumber=" + carNumber + ", carModel=" + carModel + ", carEngine="
				+ carEngine + ", carColor=" + carColor + ", carOnedata=" + carOnedata + ", carTwodata=" + carTwodata
				+ ", carFrame=" + carFrame + ", carPrice=" + carPrice + ", carMileage=" + carMileage + ", carIdcard="
				+ carIdcard + ", carPermit=" + carPermit + ", carTraffic=" + carTraffic + ", carKey=" + carKey
				+ ", carRegistration=" + carRegistration + ", carBusiness=" + carBusiness + ", carTravel=" + carTravel
				+ ", carInvoice=" + carInvoice + ", carTax=" + carTax + ", carImport=" + carImport + ", carAssessment="
				+ carAssessment + ", carPhoto=" + carPhoto + ", carCertificate=" + carCertificate + ", carDriving="
				+ carDriving + ", carCommercial=" + carCommercial + ", carInsurance=" + carInsurance + ", carOther="
				+ carOther + ", cgbList=" + cgbList + "]";
	}

}
