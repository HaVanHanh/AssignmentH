/**
 * 
 */
package com.vti.trainee.service;

import java.util.List;

import com.vti.trainee.dto.TraineeDto;

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
public interface TraineeService {

	public TraineeDto getTraineeByAcc(String account);
	
	public List<TraineeDto> getAllTrainee();

	public boolean updateAcc(TraineeDto dto);

	public boolean login(String account, String password);

	public boolean deleteAcc();
	

}
