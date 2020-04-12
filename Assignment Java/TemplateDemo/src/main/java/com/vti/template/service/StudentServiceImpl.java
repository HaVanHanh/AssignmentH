package com.vti.template.service;

import java.util.ArrayList;
import java.util.List;

import com.vti.template.dto.StudentDto;
import com.vti.template.entity.Student;
import com.vti.template.exception.ExceptionConstant;
import com.vti.template.exception.MyCustomSQLException;
import com.vti.template.form.StudentForm;
import com.vti.template.repository.StudentRepository;
import com.vti.template.repository.StudentRepositoryImpl;

/**
 * This class is implement Student Service.
 * 
 * @Description: .
 * @author: NNDuy
 * @create_date: Dec 7, 2019
 * @version: 1.0
 * @modifer: NNDuy
 * @modifer_date: Dec 7, 2019
 */
public class StudentServiceImpl implements StudentService {

	private StudentRepository repository;

	/**
	 * Constructor for class StudentServiceImpl.
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: Dec 7, 2019
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: Dec 7, 2019
	 */
	public StudentServiceImpl() {
		repository = new StudentRepositoryImpl();
	}

	/*
	 * @see com.vti.template.service.StudentService#getAllStudent()
	 */
	@Override
	public List<StudentDto> getAllStudent() throws MyCustomSQLException {
		List<StudentDto> dtos = new ArrayList<>();

		List<Student> students = repository.getAll();

		if (students != null) {
			// convert to dto
			for (int i = 0; i < students.size(); i++) {
				dtos.add(new StudentDto(students.get(i)));
			}
		}

		return dtos;
	}

	/*
	 * @see com.vti.template.service.StudentService#getStudentByID(int)
	 */
	@Override
	public StudentDto getStudentByID(int id) throws MyCustomSQLException{
		return new StudentDto(repository.getByID(id));
	}

	/*
	 * @see
	 * com.vti.template.service.StudentService#createStudent(com.vti.template.
	 * entity.Student)
	 */
	@Override
	public void createStudent(StudentForm form) throws MyCustomSQLException {
		// if name exist then return business exception
		if (repository.exists(form.getName())) {
			throw new MyCustomSQLException(
					ExceptionConstant.CODE_CREATE_STUDENT_EXISTS,
					ExceptionConstant.MS_CREATE_STUDENT_EXISTS);
		}

		// create
		repository.create(form.toEntityCreate());
	}

	/*
	 * @see
	 * com.vti.template.service.StudentService#updateStudent(com.vti.template.
	 * entity.Student)
	 */
	@Override
	public void updateStudent(StudentForm form) throws MyCustomSQLException {
		// if id is not exist then return business exception
		if (!repository.exists(form.getId())) {
			throw new MyCustomSQLException(
					ExceptionConstant.CODE_UPDATE_STUDENT_NOT_EXISTS,
					ExceptionConstant.MS_UPDATE_STUDENT_NOT_EXISTS);
		}

		// update
		repository.update(form.toEntityUpdate());
	}

	/*
	 * @see com.vti.template.service.StudentService#deleteStudent(int)
	 */
	@Override
	public void deleteStudent(int id) throws MyCustomSQLException {
		// if id is not exist then return business exception
		if (!repository.exists(id)) {
			throw new MyCustomSQLException(
					ExceptionConstant.CODE_DELETE_STUDENT_NOT_EXISTS,
					ExceptionConstant.MS_DELETE_STUDENT_NOT_EXISTS);
		}

		// delete
		repository.delete(id);
	}

	/*
	 * @see com.vti.template.service.StudentService#existsStudent(int)
	 */
	@Override
	public boolean existsStudent(int id) throws MyCustomSQLException{
		return repository.exists(id);
	}

	/*
	 * @see
	 * com.vti.template.service.StudentService#existsStudent(java.lang.String)
	 */
	@Override
	public boolean existsStudent(String name) throws MyCustomSQLException{
		return repository.exists(name);
	}
}
