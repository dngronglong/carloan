package org.project.loan.contractmag.repository;

import org.project.loan.beans.ContractBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * extends JpaRepository<ContractBean, Long> 
 * ContractBean 指定该接口操作的对象类型
 * Long 指定操作对象的ID类型
 * @author pu
 *
 */
public interface ContractRepository extends JpaRepository<ContractBean, Integer>,JpaSpecificationExecutor<ContractBean> {

	
	
	@Modifying//改注解表示，Query注解中的语句 ，会对数据库造成修改
//	@Query(value="",nativeQuery=true) nativeQuery=true 表示Query注解中，直接放置的就是SQL
	@Query(value="update ContractBean as c set c.contractStatus = ?1 where c.contractId = ?2")
	public void updateContractStatus(int contractStatus,int contractId);
}
