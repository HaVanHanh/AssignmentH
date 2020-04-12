package com.vti.template.controller;

import java.util.List;

import com.vti.template.dto.StudentDto;
import com.vti.template.exception.MyCustomSQLException;
import com.vti.template.form.StudentForm;
import com.vti.template.service.StudentService;
import com.vti.template.service.StudentServiceImpl;

/**
 * This class is Student controller.
 * 
 * @Description: .
 * @author: NNDuy
 * @create_date: Dec 7, 2019
 * @version: 1.0
 * @modifer: NNDuy
 * @modifer_date: Dec 7, 2019
 */
public class StudentController {

	private StudentService service;

	/**
	 * Constructor for class StudentController.
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: Dec 7, 2019
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: Dec 7, 2019
	 */
	public StudentController() {
		service = new StudentServiceImpl();
	}

	/**
	 * This method is got all student.
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: Dec 7, 2019
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: Dec 7, 2019
	 * @return List<StudentDto>
	 */
	public List<StudentDto> getAllStudent() {
		try {
			return service.getAllStudent();

		} catch (MyCustomSQLException e) {
			System.out.println(e);
			return null;
		}
	}

	/**
	 * This method is got student by ID.
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: Dec 7, 2019
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: Dec 7, 2019
	 * @param id
	 * @return StudentDto
	 */
	public StudentDto getStudentByID(int id){
		try {
			// TODO validate
			return service.getStudentByID(id);

		} catch (MyCustomSQLException e) {
			System.out.println(e);
			return null;
		}
	}

	/**
	 * This method is created student.
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: Dec 7, 2019
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: Dec 7, 2019
	 * @param form
	 */
	public void createStudent(StudentForm form){
		try {
			// TODO validate
			service.createStudent(form);
			System.out.println("Create success!");
			
		} catch (MyCustomSQLException e) {
			System.out.println(e);
		}
	}

	/**
	 * This method is updated student.
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: Dec 13, 2019
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: Dec 13, 2019
	 * @param form
	 * @return
	 */
	public void updateStudent(StudentForm form) {
		try {
			// TODO validate
			service.updateStudent(form);
			System.out.println("Update success!");
			
		} catch (MyCustomSQLException e) {
			System.out.println(e);
		}
	}

	/**
	 * This method is deleted student.
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: Dec 13, 2019
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: Dec 13, 2019
	 * @param dto
	 */
	public void deleteStudent(int id){
		try {
			// TODO validate
			service.deleteStudent(id);
			System.out.println("Delete success!");
			
		} catch (MyCustomSQLException e) {
			System.out.println(e);
		}
	}

}
