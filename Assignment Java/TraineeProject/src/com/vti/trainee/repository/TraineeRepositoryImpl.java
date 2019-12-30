/**
 * 
 */
package com.vti.trainee.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vti.trainee.entites.Trainee;
import com.vti.trainee.utils.jdbc.SqlParameter;
import com.vti.trainee.utils.jdbc.SqlStatement;

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
public class TraineeRepositoryImpl extends RepositoryImpl<Trainee> implements TraineeRepository {

	/*
	 * @see com.vti.trainee.repository.Repository#getAll()
	 */

	@Override
	public List<Trainee> getAll() {

		List<Trainee> entities = new ArrayList<>();
		ResultSet result = getJdbc().selectStatement(SqlStatement.SELECT_ALL_TRAINEE);

		if (null == result) {
			getJdbc().disconnect();
			return null;
		}
		try {
			while (result.next()) {
				entities.add( new Trainee(result.getString("account"), result.getString("first-name"),
						result.getString("last-name"), result.getString("email"), result.getString("password")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		getJdbc().disconnect();
		return entities;
	}

	/*
	 * @see com.vti.trainee.repository.Repository#getByID(int)
	 */

	@Override
	public Trainee getByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * @see com.vti.trainee.repository.Repository#create(java.lang.Object)
	 */

	@Override
	public boolean create(Trainee entity) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * @see com.vti.trainee.repository.Repository#update(java.lang.Object)
	 */

	@Override
	public boolean update(Trainee entity) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * @see com.vti.trainee.repository.Repository#delete(int)
	 */

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * @see com.vti.trainee.repository.Repository#login(java.lang.String,
	 * java.lang.String)
	 */

	@Override
	public boolean login(String account, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * @see
	 * com.vti.trainee.repository.TraineeRepository#loginTrainee(java.lang.String,
	 * java.lang.String)
	 */

	@Override
	public boolean loginTrainee(String account, String password) {

		List<SqlParameter> params = new ArrayList<>();

		params.add(new SqlParameter(1, account));
		params.add(new SqlParameter(2, password));
		ResultSet result = getJdbc().selectPreparationStatement(SqlStatement.LOGIN_TRAINEE, params);

		if (result == null) {
			getJdbc().disconnect();
			return false;
		}
		try {
			while (result.next()) {
				getJdbc().disconnect();
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		getJdbc().disconnect();
		return false;
	}

}
