package org.project.loan.idcardmag.repository;

import org.project.loan.beans.IdCardBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

	/**
	 * extends JpaRepository<IdCardBean, Long> 
	 * HonorBean 指定该接口操作的对象类型
	 * Long 指定操作对象的ID类型
	 * @author pu
	 *
	 */
	public interface IdCardRepository extends JpaRepository<IdCardBean, Integer>,JpaSpecificationExecutor<IdCardBean> {

	}

