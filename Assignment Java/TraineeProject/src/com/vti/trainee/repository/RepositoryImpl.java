/**
 * 
 */
package com.vti.trainee.repository;

import com.vti.trainee.utils.jdbc.JdbcUtil;

/**
 * This class is .
 * 
 * @Description: .
 * @author: HanhHa
 * @create_date: Dec 21, 2019
 * @version: 1.0
 * @param <T>
 * @modifer: HanhHa
 * @modifer_date: Dec 21, 2019
 */
public abstract class RepositoryImpl<T> implements Repository<T> {
	private JdbcUtil jdbc;

	/**
	 * 
	 * Constructor for class RepositoryImpl.
	 * 
	 * @Description: .
	 * @author: HanhHa
	 * @create_date: Dec 21, 2019
	 * @version: 1.0
	 * @modifer: HanhHa
	 * @modifer_date: Dec 21, 2019
	 */
	public RepositoryImpl() {
		jdbc = JdbcUtil.getInstance();
	}

	/**
	 * 
	 * This method is .
	 * 
	 * @Description: .
	 * @author: HanhHa
	 * @create_date: Dec 21, 2019
	 * @version: 1.0
	 * @modifer: HanhHa
	 * @modifer_date: Dec 21, 2019
	 * @return
	 */
	protected JdbcUtil getJdbc() {
		return jdbc;
	}
}
