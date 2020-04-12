package com.vti.service;

import java.util.List;

import com.vti.dtos.TraineeDto;
import com.vti.form.FindTraineeForm;

public interface TraineeService {

	// Lay danh sach thuc tap sinh
	public List<TraineeDto> getAllTrainee();

	// Tra ve thuc tap sinh  
	public TraineeDto getTrainee(FindTraineeForm form);

	// Update thong tin cua thuc tap sinh
	public boolean updateTrainee(String account);

	// Xoa thong tin cua thuc tap sinh
	public boolean deleteTrainee(String account);

	// Tao mot thuc tap sinh
	public void createTrainee();
}
