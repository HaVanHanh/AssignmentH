/**
 * 
 */
package com.qlks.repository;

import com.qlks.utils.jdbc.JdbcUtil;

/**
 * This class is .
 * 
 * @Description: .
 * @author: HanhHa
 * @create_date: Dec 22, 2019
 * @version: 1.0
 * @param <T>
 * @modifer: HanhHa
 * @modifer_date: Dec 22, 2019
 */
public abstract class RepositoryImpl<T> implements Repository<T> {
	private JdbcUtil jdbc;

	/**
	 * 
	 * Constructor for class RepositoryImpl.
	 * 
	 * @Description: .
	 * @author: HanhHa
	 * @create_date: Dec 22, 2019
	 * @version: 1.0
	 * @modifer: HanhHa
	 * @modifer_date: Dec 22, 2019
	 */
	public RepositoryImpl() {
		jdbc = JdbcUtil.getInstance();
	}

	/**
	 * @return the jdbc
	 */
	protected JdbcUtil getJdbc() {
		return jdbc;
	}
}
