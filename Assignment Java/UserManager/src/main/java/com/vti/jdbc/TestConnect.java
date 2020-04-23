package com.vti.jdbc;

import java.sql.SQLException;

import com.vti.utils.jdbc.JdbcUtil;

public class TestConnect {

	public static void main(String[] args) throws SQLException {

		JdbcUtil jdbcUtil = new JdbcUtil();
		jdbcUtil.getInstance();

	}

}
