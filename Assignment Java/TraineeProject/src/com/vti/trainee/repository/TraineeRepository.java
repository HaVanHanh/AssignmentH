/**
 * 
 */
package com.vti.trainee.repository;

import com.vti.trainee.entites.Trainee;

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
public interface TraineeRepository extends Repository<Trainee> {
	public boolean loginTrainee(String account, String password);
}
