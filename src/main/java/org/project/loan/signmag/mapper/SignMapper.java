package org.project.loan.signmag.mapper;

import org.apache.ibatis.annotations.*;
import org.project.loan.beans.SignBean;

public interface SignMapper {
    @Select("select * FROM  t_sign WHERE sign_id=#{id}")
    @Results({
            @Result(id = true,property = "signId",column = "sign_id"),
            @Result(column="sign_bankCard",property="sign_bankCard"),
            @Result(column="sign_application", property="sign_application"),
            @Result(column="sign_smallTable",property="sign_smallTable"),
            @Result(column="sign_debit",property="sign_debit"),
            @Result(column="sign_letterOfAttorney",property="sign_letterOfAttorney"),
            @Result(column="sign_repayment",property="sign_repayment"),
            @Result(column="sign_agreement",property="sign_agreement"),
            @Result(column="sign_contract",property="sign_contract"),
            @Result(column="sign_letterOfAttorneyCar",property="sign_letterOfAttorneyCar"),
            @Result(column="sign_photoForCar",property="sign_photoForCar"),
            @Result(column="sign_phtotCar",property="sign_phtotCar"),
            @Result(column="sign_money",property="sign_money"),
            @Result(column="sign_bank",property="sign_bank"),
            @Result(column="sign_date",property="sign_date"),
            @Result(column="sign_accountNumber",property="sign_accountNumber"),
            @Result(column="sign_bankAddress",property="sign_bankAddress"),
            @Result(column="sign_time",property="sign_time")
    })
    public SignBean findSignById(@Param("id")int id);
}
