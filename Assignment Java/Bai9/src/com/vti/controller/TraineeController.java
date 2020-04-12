package com.vti.controller;

import com.vti.dtos.TraineeDto;
import com.vti.form.FindTraineeForm;
import com.vti.service.TraineeService;
import com.vti.service.TraineeServiceImpl;

public class TraineeController {

	private TraineeService service;

	public TraineeController() {
		service = new TraineeServiceImpl();
	}

	// Tra ve mot thuc tap sinh
	public TraineeDto getTrainee(FindTraineeForm form) {

		return service.getTrainee(form);
	}
}
