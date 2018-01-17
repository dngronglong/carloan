package org.project.loan.usermag.service.impl;

import javax.annotation.Resource;

import org.project.loan.beans.UserBean;
import org.project.loan.usermag.repository.UserRepository;
import org.project.loan.usermag.service.IUserWriteService;
import org.springframework.stereotype.Service;

@Service
public class UserWriteServiceImpl implements IUserWriteService {
	
	@Resource
	private UserRepository userRepository;

	@Override
	public void addUser(UserBean user) {
		// TODO Auto-generated method stub
		userRepository.save(user);

	}

	@Override
	public void deleteUserByUserId(int userid) {
		// TODO Auto-generated method stub
		userRepository.delete(userid);;

	}

	@Override
	public void updateUserByUser(UserBean user) {
		// TODO Auto-generated method stub
		userRepository.saveAndFlush(user);

	}

}
