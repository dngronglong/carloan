package org.project.loan.carmag.dao;

import org.project.loan.beans.CarBean;

public interface ICarDao {
	
	/**
	 * 根据车辆的id查询id
	 * @param id
	 * @return
	 */
	public CarBean findCarById(int id);

}
