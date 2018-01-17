package org.project.loan.customermag.repository;

import org.project.loan.beans.CustomerBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * extends JpaRepository<CustomerBean, Long> 
 * CustomerBean 指定该接口操作的对象类型
 * Long 指定操作对象的ID类型
 * @author pu
 *
 */
public interface CustomerRepository extends JpaRepository<CustomerBean, Integer>,JpaSpecificationExecutor<CustomerBean> {


}
