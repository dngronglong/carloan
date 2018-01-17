package org.project.loan.carmag.service;

import org.project.loan.beans.CarBean;

public interface ICarWriteService {

	/**
	 * 添加车辆信息
	 * @param car
	 */
	public void addCar(CarBean car);
	
	/**
	 * 修改车辆的信息
	 * @param car
	 */
	public void updateCar(CarBean car);
}
