package org.project.loan.signmag.service.impl;

import org.project.loan.beans.SignBean;
import org.project.loan.signmag.repository.SignRepository;
import org.project.loan.signmag.service.ISignWriteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class SignWriteServiceImpl implements ISignWriteService {
    @Resource
    private SignRepository signRepository;
    @Override
    public void addSign(SignBean sign) {
        signRepository.save(sign);
    }

    @Override
    public void updateSign(SignBean sign) {
        signRepository.saveAndFlush(sign);
    }

    @Override
    public void deleteSign(SignBean sign) {
        signRepository.delete(sign);
    }
}
