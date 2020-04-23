//
package com.vti.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vti.entity.Manager;
import com.vti.form.LoginForm;
import com.vti.utils.jdbc.JdbcUtil;
import com.vti.utils.jdbc.SqlParam;
import com.vti.utils.jdbc.SqlStatement;

/**
 * This class is .
 * 
 * @Description: .
 * @author: HVHanh
 * @create_date: Apr 12, 2020
 * @version: 1.0
 * @modifer: HVHanh
 * @modifer_date: Apr 12, 2020
 */
public class UserRepositoryImpl implements UserRepository<Manager> {

	private JdbcUtil jdbc = JdbcUtil.getInstance();;

	/*
	 * @see com.vti.repository.UserRepository#register()
	 */
	public void register() {
		// TODO Auto-generated method stub

	}

	/*
	 * @see com.vti.repository.UserRepository#login(com.vti.form.LoginForm)
	 */
	public boolean login(LoginForm form) {
		List<SqlParam> params = new ArrayList<>();

		params.add(new SqlParam(1, form.getEmail()));
		params.add(new SqlParam(2, form.getPassword()));

		try {
			// execute query
			ResultSet result = jdbc.selectPreparationStatement(SqlStatement.SQL_LOGIN, params);

			// get result
			return result.next();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			jdbc.disconnect();
		}
		return false;
	}

}
