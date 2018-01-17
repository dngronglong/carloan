package org.project.loan.signmag.dao.impl;

import org.apache.ibatis.annotations.Param;
import org.project.loan.beans.SignBean;
import org.project.loan.signmag.dao.ISignDao;
import org.project.loan.signmag.mapper.SignMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class SignDaoImpl implements ISignDao {
    @Resource
    private SignMapper signMapper;
    @Override
    public SignBean findSignById(int id) {
        return signMapper.findSignById(id);
    }
}
