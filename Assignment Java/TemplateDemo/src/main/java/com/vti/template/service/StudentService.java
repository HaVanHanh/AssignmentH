package com.vti.template.service;

import java.util.List;

import com.vti.template.dto.StudentDto;
import com.vti.template.exception.MyCustomSQLException;
import com.vti.template.form.StudentForm;

/**
 * This class is student service.
 * 
 * @Description: .
 * @author: NNDuy
 * @create_date: Dec 7, 2019
 * @version: 1.0
 * @modifer: NNDuy
 * @modifer_date: Dec 7, 2019
 */
public interface StudentService {

	/**
	 * This method uses for getting all student. 
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: Jan 15, 2020
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: Jan 15, 2020
	 * @return List<StudentDto>
	 * @throws MyCustomSQLException
	 */
	public List<StudentDto> getAllStudent() throws MyCustomSQLException;

	/**
	 * This method uses for getting student by id. 
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: Jan 15, 2020
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: Jan 15, 2020
	 * @param id
	 * @return StudentDto
	 * @throws MyCustomSQLException
	 */
	public StudentDto getStudentByID(int id) throws MyCustomSQLException;

	/**
	 * This method uses for creating student . 
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: Jan 15, 2020
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: Jan 15, 2020
	 * @param form
	 * @throws MyCustomSQLException
	 */
	public void createStudent(StudentForm form) throws MyCustomSQLException;

	/**
	 * This method uses for updating student . 
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: Jan 15, 2020
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: Jan 15, 2020
	 * @param form
	 * @throws MyCustomSQLException
	 */
	public void updateStudent(StudentForm form) throws MyCustomSQLException;

	/**
	 * This method uses for deleting student . 
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: Jan 15, 2020
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: Jan 15, 2020
	 * @param id
	 * @throws MyCustomSQLException
	 */
	public void deleteStudent(int id) throws MyCustomSQLException;

	/**
	 * This method is checked student exists by id .
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: Jan 15, 2020
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: Jan 15, 2020
	 * @param id
	 * @return
	 * @throws MyCustomSQLException
	 */
	public boolean existsStudent(int id) throws MyCustomSQLException;
	
	/**
	 * This method is checked student exists by name .
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
	public boolean existsStudent(String name) throws MyCustomSQLException;
}
