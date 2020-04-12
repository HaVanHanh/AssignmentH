package com.vti.template.jdbc;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.vti.template.entity.Student;
import com.vti.template.form.StudentForm;

/**
 * This class is program for JDBC.
 * 
 * @Description: .
 * @author: NNDuy
 * @create_date: Dec 7, 2019
 * @version: 1.0
 * @modifer: NNDuy
 * @modifer_date: Dec 7, 2019
 */
public class Program {
	public static void main(String[] args) {

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();

		StudentForm studentForm = new StudentForm();
		studentForm.setAge(12);
		studentForm.setGender(false);
		studentForm.setId(123);
		studentForm.setName("Nguyen Thi A");

		Set<ConstraintViolation<StudentForm>> violations = validator.validate(studentForm);
		for (ConstraintViolation<StudentForm> violation : violations) {
			System.err.println(violation.getMessage());
		}

		/*
		 * Function function = new Function(); function.login();
		 * function.getAllStudent(); function.getStudentByID();
		 * function.createStudent(); function.updateStudent(); function.deleteStudent();
		 * 
		 * function.getUserByID(); function.importListUser();
		 */
	}
}
