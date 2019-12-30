/**
 * 
 */
package com.vti.trainee.service;

import java.util.List;

import com.vti.trainee.dto.TraineeDto;
import com.vti.trainee.repository.TraineeRepository;
import com.vti.trainee.repository.TraineeRepositoryImpl;

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
public class TraineeServiceImpl implements TraineeService {

	private TraineeRepository repository;
	
	
	
	
	/* 
	* @see com.vti.trainee.service.TraineeService#getTraineeByAcc(java.lang.String)
	*/
	
	
	
	
	/**
	 * Constructor for class TraineeServiceImpl.
	 * 
	 * @Description: .
	 * @author: HanhHa
	 * @create_date: Dec 21, 2019
	 * @version: 1.0
	 * @modifer: HanhHa
	 * @modifer_date: Dec 21, 2019
	 * @param repository
	 */
	public TraineeServiceImpl( ) {
		repository = new TraineeRepositoryImpl();
	}

	@Override
	public TraineeDto getTraineeByAcc(String account) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	* @see com.vti.trainee.service.TraineeService#updateAcc(com.vti.trainee.dto.TraineeDto)
	*/
	
	@Override
	public boolean updateAcc(TraineeDto dto) {
		// TODO Auto-generated method stub
		return false;
	}

	/* 
	* @see com.vti.trainee.service.TraineeService#deleteAcc()
	*/
	
	@Override
	public boolean deleteAcc() {
		// TODO Auto-generated method stub
		return false;
	}

	/* 
	* @see com.vti.trainee.service.TraineeService#login(java.lang.String, java.lang.String)
	*/
	
	@Override
	public boolean login(String account, String password) {
		
		return repository.loginTrainee(account, password);
		
	}

	/* 
	* @see com.vti.trainee.service.TraineeService#getAllTrainee()
	*/
	
	@Override
	public List<TraineeDto> getAllTrainee() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
