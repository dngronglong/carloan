package org.project.loan.signmag.service.impl;

import org.project.loan.beans.SignBean;
import org.project.loan.signmag.dao.ISignDao;
import org.project.loan.signmag.service.ISignReadService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SignReadServiceImpl implements ISignReadService {
    @Resource
    private ISignDao signDaoImpl;
    @Override
    public SignBean findSignById(int id) {
        return signDaoImpl.findSignById(id);
    }
}
