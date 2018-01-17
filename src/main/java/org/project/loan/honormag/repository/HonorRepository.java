package org.project.loan.honormag.repository;

import org.project.loan.beans.HonorBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * extends JpaRepository<HonorBean, Long> 
 * HonorBean 指定该接口操作的对象类型
 * Long 指定操作对象的ID类型
 * @author pu
 *
 */
public interface HonorRepository extends JpaRepository<HonorBean, Integer>,JpaSpecificationExecutor<HonorBean> {


}
