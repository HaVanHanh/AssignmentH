package com.vti.template.repository;

import com.vti.template.entity.Student;
import com.vti.template.exception.MyCustomSQLException;

/**
 * This class is student repository.
 * 
 * @Description: .
 * @author: NNDuy
 * @create_date: Dec 7, 2019
 * @version: 1.0
 * @modifer: NNDuy
 * @modifer_date: Dec 7, 2019
 */
public interface StudentRepository extends Repository<Student> {

	/**
	 * This method is checked student exists by name
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: Jan 15, 2020
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: Jan 15, 2020
	 * @param name
	 * @return
	 * @throws MyCustomSQLException
	 */
	public boolean exists(String name) throws MyCustomSQLException;
}
