//
package com.vti.utils.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Properties;

import com.mysql.cj.util.StringUtils;
import com.vti.utils.Constant;

/**
 * This class is JDBC Util..
 * 
 * @Description: .
 * @author: HVHanh
 * @create_date: Apr 12, 2020
 * @version: 1.0
 * @modifer: HVHanh
 * @modifer_date: Apr 12, 2020
 */
public class JdbcUtil {
	private static JdbcUtil instance;

	private Connection connection;
	private Statement statement;
	private PreparedStatement preparedStatement;

	/**
	 * 
	 * kiểm tra xem đã thực hiện kế
	 * 
	 * @Description: .
	 * @author: HVHanh
	 * @create_date: Apr 12, 2020
	 * @version: 1.0
	 * @modifer: HVHanh
	 * @modifer_date: Apr 12, 2020
	 * @return
	 * @throws SQLException
	 */
	public static JdbcUtil getInstance() {
		if (null == instance) {
			instance = new JdbcUtil();
		}

		return instance;

	}

	/**
	 * 
	 * Constructor for class JdbcUtil.
	 * 
	 * @Description: .
	 * @author: HVHanh
	 * @create_date: Apr 12, 2020
	 * @version: 1.0
	 * @throws SQLException
	 * @modifer: HVHanh
	 * @modifer_date: Apr 12, 2020
	 */
	public JdbcUtil() {

	}

	/**
	 * 
	 * This method is connect to database .
	 * 
	 * @Description: .
	 * @author: HVHanh
	 * @create_date: Apr 12, 2020
	 * @version: 1.0
	 * @modifer: HVHanh
	 * @modifer_date: Apr 12, 2020
	 * @throws SQLException
	 */

	private void connect() throws SQLException {
		try {
			// if connect is null or close then connect again
			if (null == connection || connection.isClosed()) {

				Properties properties = new Properties();
				properties.setProperty("user", Constant.DATABASE_USERNAME);// Constant.DATABASE_USERNAME
				properties.setProperty("password", Constant.DATABASE_PASSWORD);

				Class.forName("com.mysql.cj.jdbc.Driver");

				// open connect
				Connection connection = DriverManager.getConnection(Constant.CONNECTION_STRING, properties);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * This method is disconnect database .
	 * 
	 * @Description: .
	 * @author: HVHanh
	 * @create_date: Apr 12, 2020
	 * @version: 1.0
	 * @modifer: HVHanh
	 * @modifer_date: Apr 12, 2020
	 */
	public void disconnect() {
		try {
			// if connect is a connection then disconnect
			if (null != connection && !connection.isClosed()) {
				connection.close();
			}
		} catch (SQLException e) {
			System.out.println(Constant.ERROR_DISCONNECT_DATABASE_STR);
		}
	}

	/**
	 * 
	 * This method is selectStatement.
	 * 
	 * @Description: .
	 * @author: HVHanh
	 * @create_date: Apr 12, 2020
	 * @version: 1.0
	 * @modifer: HVHanh
	 * @modifer_date: Apr 12, 2020
	 * @param sql
	 * @return
	 * @throws SQLException
	 */
	public ResultSet selectStatement(String sql) throws SQLException {
		// validate sql statement
		if (StringUtils.isNullOrEmpty(sql)) {
			throw new SQLException(Constant.ERROR_SQL_STATEMENT_IS_NULL);
		}

		// Connect to database
		connect();

		// if has connect then create new statement
		statement = connection.createStatement();

		// execute Query
		return statement.executeQuery(sql);
	}

	/**
	 * 
	 * This method is select with parameter .
	 * 
	 * @Description: .
	 * @author: HVHanh
	 * @create_date: Apr 12, 2020
	 * @version: 1.0
	 * @modifer: HVHanh
	 * @modifer_date: Apr 12, 2020
	 * @param sql
	 * @param params
	 * @return
	 * @throws SQLException
	 */

	public ResultSet selectPreparationStatement(String sql, List<SqlParam> params) throws SQLException {
		// validate sql statement
		if (StringUtils.isNullOrEmpty(sql)) {
			throw new SQLException(Constant.ERROR_SQL_STATEMENT_IS_NULL);
		}

		// validate parameters
		if (params == null || params.size() == 0) {
			throw new SQLException(Constant.ERROR_SQL_PARAMETER_MUST_NON_EMPTY);
		}

		// Connect to database
		connect();

		// if has connect then create new statement
		preparedStatement = connection.prepareStatement(sql);

		// set parameters to statement
		for (SqlParam param : params) {
			preparedStatement.setObject(param.getIndex(), param.getValue());
		}

		// execute Query
		return preparedStatement.executeQuery();
	}
}
