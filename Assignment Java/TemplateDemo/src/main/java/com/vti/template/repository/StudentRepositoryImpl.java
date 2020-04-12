package com.vti.template.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vti.template.entity.Student;
import com.vti.template.exception.ExceptionConstant;
import com.vti.template.exception.MyCustomSQLException;
import com.vti.template.utils.jdbc.SqlParameter;
import com.vti.template.utils.jdbc.SqlStatement;

/**
 * This class is implement student repository.
 * 
 * @Description: .
 * @author: NNDuy
 * @create_date: Dec 7, 2019
 * @version: 1.0
 * @modifer: NNDuy
 * @modifer_date: Dec 7, 2019
 */
public class StudentRepositoryImpl extends RepositoryImpl<Student> implements StudentRepository {

	/*
	 * @see com.vti.template.repository.Repository#getAll()
	 */
	@Override
	public List<Student> getAll() throws MyCustomSQLException {
		List<Student> entities = new ArrayList<>();

		try {
			// execute query
			ResultSet result = getJdbc().selectStatement(SqlStatement.SELECT_ALL_STUDENT);
	
			// get result
			while (result.next()) {
				entities.add(new Student()
						.setRN(result.getInt("RN"))
						.setName(result.getString("Name"))
						.setAge(result.getInt("Age"))
						.setGender(result.getInt("Gender"))
						.setPassword(result.getString("Password"))
						);
			}
			
		} catch (SQLException e) {	
			throw new MyCustomSQLException(
					ExceptionConstant.CODE_GET_ALL_STUDENT_COMMON_ERROR, 
					e.getMessage());
		} finally {
			getJdbc().disconnect();
		}
		
		return entities;
	}
	
	/*
	 * @see com.vti.template.repository.Repository#getByID(int)
	 */
	@Override
	public Student getByID(int id) throws MyCustomSQLException {

		// init list parameters
		List<SqlParameter> params = new ArrayList<>();
		params.add(new SqlParameter(1, id));

		try {
			// execute query
			ResultSet result = getJdbc().selectPreparationStatement(SqlStatement.SQL_GET_BY_ID_STUDENT, params);

			// get result
			// if has any records
			if(result.next()){
				return new Student()
							.setRN(result.getInt("RN"))
							.setName(result.getString("Name"))
							.setAge(result.getInt("Age"))
							.setGender(result.getInt("Gender"))
							.setPassword(result.getString("Password"));
			}else{
				// if has not any records
				throw new MyCustomSQLException(
						ExceptionConstant.CODE_GET_STUDENT_BY_ID_CANNOT_FIND_ID, 
						ExceptionConstant.MS_GET_STUDENT_BY_ID_CANNOT_FIND_ID);
			}
			
		} catch (SQLException e) {	
			throw new MyCustomSQLException(
					ExceptionConstant.CODE_GET_STUDENT_BY_ID_COMMON_ERROR, 
					e.getMessage());
		} finally {
			getJdbc().disconnect();
		}
	}


	/*
	 * @see com.vti.template.repository.Repository#create(java.lang.Object)
	 */
	@Override
	public void create(Student entity) throws MyCustomSQLException {
		
		// init list parameters
		List<SqlParameter> params = new ArrayList<>();
		params.add(new SqlParameter(1, entity.getName()));
		params.add(new SqlParameter(2, entity.getAge()));
		params.add(new SqlParameter(3, entity.getGender()));
		params.add(new SqlParameter(4, entity.getPassword()));
		
		try {
			// execute query
			int result = getJdbc().updatePreparationStatement(SqlStatement.SQL_CREATE_STUDENT, params);
			
			// create fail
			if(result != 1){
				throw new MyCustomSQLException(
						ExceptionConstant.CODE_COMMON_ERROR_THE_NUMBER_OF_ROWS_AFFECTED	,
						ExceptionConstant.MS_COMMON_ERROR_THE_NUMBER_OF_ROWS_AFFECTED);
			}
			
		} catch (SQLException e) {	
			throw new MyCustomSQLException(
					ExceptionConstant.CODE_CREATE_STUDENT_COMMON_ERROR, 
					e.getMessage());
		} finally {
			getJdbc().disconnect();
		}
	}

	/*
	 * @see com.vti.template.repository.Repository#update(java.lang.Object)
	 */
	@Override
	public void update(Student entity) throws MyCustomSQLException {
		// init list parameters
		List<SqlParameter> params = new ArrayList<>();
		params.add(new SqlParameter(1, entity.getName()));
		params.add(new SqlParameter(2, entity.getAge()));
		params.add(new SqlParameter(3, entity.getPassword()));		
		params.add(new SqlParameter(4, entity.getRN()));
	
		try{
			// execute query
			int result = getJdbc().updatePreparationStatement(SqlStatement.SQL_UPDATE_STUDENT, params);
			
			// update fail
			if(result != 1){
				throw new MyCustomSQLException(
						ExceptionConstant.CODE_COMMON_ERROR_THE_NUMBER_OF_ROWS_AFFECTED	,
						ExceptionConstant.MS_COMMON_ERROR_THE_NUMBER_OF_ROWS_AFFECTED);
			}
			
		} catch (SQLException e) {	
			throw new MyCustomSQLException(
					ExceptionConstant.CODE_UPDATE_STUDENT_COMMON_ERROR, 
					e.getMessage());
		} finally {
			getJdbc().disconnect();
		}
	}

	/*
	 * @see com.vti.template.repository.Repository#deleteGroup(java.lang.Object)
	 */
	@Override
	public void delete(int id) throws MyCustomSQLException {
		// init list parameters
		List<SqlParameter> params = new ArrayList<>();
		params.add(new SqlParameter(1, id));
		
		try{
			// execute query
			int result = getJdbc().updatePreparationStatement(SqlStatement.SQL_DELETE_STUDENT, params);
			
			// delete fail
			if(result != 1){
				throw new MyCustomSQLException(
						ExceptionConstant.CODE_COMMON_ERROR_THE_NUMBER_OF_ROWS_AFFECTED	,
						ExceptionConstant.MS_COMMON_ERROR_THE_NUMBER_OF_ROWS_AFFECTED);
			}
			
		} catch (SQLException e) {	
			throw new MyCustomSQLException(
					ExceptionConstant.CODE_DELETE_STUDENT_COMMON_ERROR, 
					e.getMessage());
		} finally {
			getJdbc().disconnect();
		}
	}


	/*
	 * @see com.vti.template.repository.Repository#exists(int)
	 */
	@Override
	public boolean exists(int id) throws MyCustomSQLException {

		// init list parameters
		List<SqlParameter> params = new ArrayList<>();
		params.add(new SqlParameter(1, id));

		try {
			// execute query
			ResultSet result = getJdbc().selectPreparationStatement(SqlStatement.SQL_EXITS_STUDENT_BY_ID, params);

			// get result
			return result.next();
			
		} catch (SQLException e) {	
			throw new MyCustomSQLException(
					ExceptionConstant.CODE_EXISTS_ID_STUDENT_COMMON_ERROR, 
					e.getMessage());
		} finally {
			getJdbc().disconnect();
		}		
	}
	
	/* 
	* @see com.vti.template.repository.StudentRepository#exists(java.lang.String)
	*/
	@Override
	public boolean exists(String name) throws MyCustomSQLException {

		// init list parameters
		List<SqlParameter> params = new ArrayList<>();
		params.add(new SqlParameter(1, name));

		try {
			// execute query
			ResultSet result = getJdbc().selectPreparationStatement(SqlStatement.SQL_EXITS_STUDENT_BY_NAME, params);

			// get result
			return result.next();
			
		} catch (SQLException e) {	
			throw new MyCustomSQLException(
					ExceptionConstant.CODE_EXISTS_NAME_STUDENT_COMMON_ERROR, 
					e.getMessage());
		} finally {
			getJdbc().disconnect();
		}		
	}

}
