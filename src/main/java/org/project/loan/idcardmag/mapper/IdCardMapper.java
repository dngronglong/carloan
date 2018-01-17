package org.project.loan.idcardmag.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.project.loan.beans.CustomerBean;
import org.project.loan.beans.IdCardBean;

public interface IdCardMapper {
	
	/**
	 * 根据id查询身份证信息
	 * @param id
	 * @return 
	 */
	
	@Select("select * from t_idcard where customeridcard_id = #{id} ")
	@ResultMap("idCardMap")
	public IdCardBean findIdCardById(@Param("id")int id);
	
}
