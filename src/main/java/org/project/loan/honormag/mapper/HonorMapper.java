package org.project.loan.honormag.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.project.loan.beans.HonorBean;

public interface HonorMapper {
	
	@Select("select * from t_honor where honor_id=#{id}")
	@Results({
		@Result(id = true, column = "honor_id", property = "id"),
		@Result(column = "honor_house", property = "house"),
		@Result(column = "honor_car", property = "car"),
		@Result(column = "honor_carloan", property = "carloan"),
		@Result(column = "honor_mortgage", property = "mortgage"),
		@Result(column = "honor_cardstatus", property = "cardstatus"),
		@Result(column = "honor_overdue", property = "overdue"),
		@Result(column = "honor_rate", property = "rate"),
		@Result(column = "honor_check", property = "check"),
		@Result(column = "honor_otherloan", property = "otherloan"),
		@Result(column = "honor_card", property = "card")
	})
	public HonorBean findHonorById(@Param("id") int id);
}
