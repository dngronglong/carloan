package org.project.loan.carmag.repository;

import org.project.loan.beans.CarBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * extends JpaRepository<CarBean, Long> 
 * CarBean 指定该接口操作的对象类型
 * Long 指定操作对象的ID类型
 * @author pu
 *
 */
public interface CarRepository extends JpaRepository<CarBean, Integer>,JpaSpecificationExecutor<CarBean> {
	

}
