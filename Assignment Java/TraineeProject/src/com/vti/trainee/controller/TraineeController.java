/**
 * 
 */
package com.vti.trainee.controller;

import java.util.List;

import com.vti.trainee.dto.TraineeDto;
import com.vti.trainee.service.TraineeService;
import com.vti.trainee.service.TraineeServiceImpl;

/**
 * This class is .
 * 
 * @Description: .
 * @author: HanhHa
 * @create_date: Dec 21, 2019
 * @version: 1.0
 * @modifer: HanhHa
 * @modifer_date: Dec 21, 2019
 */
public class TraineeController {

	private TraineeService service;

	/**
	 * Constructor for class TraineeController.
	 * 
	 * @Description: .
	 * @author: HanhHa
	 * @create_date: Dec 21, 2019
	 * @version: 1.0
	 * @modifer: HanhHa
	 * @modifer_date: Dec 21, 2019
	 * @param service
	 */
	public TraineeController() {
		service = new TraineeServiceImpl();
	}

	public List<TraineeDto> getAllTrainee() {
		return service.getAllTrainee();
	}

	public boolean login(String account, String password) {
		return service.login(account, password);
	}

}
