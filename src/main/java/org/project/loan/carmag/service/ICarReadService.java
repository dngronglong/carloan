package org.project.loan.carmag.service;

import org.project.loan.beans.CarBean;

public interface ICarReadService {
	
	/**
	 * 根据车辆的id查询车辆的信息
	 * @param id
	 * @return
	 */
	public CarBean findCarById(int id);

}
