package org.project.loan.signmag.repository;

import org.project.loan.beans.SignBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * extends JpaRepository<SignBean, Long> 
 * SignBean 指定该接口操作的对象类型
 * Long 指定操作对象的ID类型
 * @author pu
 *
 */
public interface SignRepository extends JpaRepository<SignBean, Integer>,JpaSpecificationExecutor<SignBean> {


}
