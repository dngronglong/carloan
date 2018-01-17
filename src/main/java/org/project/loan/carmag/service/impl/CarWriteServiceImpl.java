package org.project.loan.carmag.service.impl;

import javax.annotation.Resource;

import org.project.loan.beans.CarBean;
import org.project.loan.carmag.repository.CarRepository;
import org.project.loan.carmag.service.ICarWriteService;
import org.springframework.stereotype.Service;

@Service
public class CarWriteServiceImpl implements ICarWriteService {

	@Resource
	private CarRepository carRepository;

	@Override
	public void addCar(CarBean car) {
		// TODO Auto-generated method stub

		carRepository.save(car);

	}

	@Override
	public void updateCar(CarBean car) {
		// TODO Auto-generated method stub

		carRepository.saveAndFlush(car);

	}

}
