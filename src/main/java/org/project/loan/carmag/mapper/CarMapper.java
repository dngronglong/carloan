package org.project.loan.carmag.mapper;

import org.apache.ibatis.annotations.Param;
import org.project.loan.beans.CarBean;

public interface CarMapper {
	public CarBean findCarById(@Param("id") int id);
}
