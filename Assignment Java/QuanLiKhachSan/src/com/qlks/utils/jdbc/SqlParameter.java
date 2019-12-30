package com.qlks.utils.jdbc;

/**
 * 
 * This class is model of 1 param in statement query.
 * 
 * @Description: .
 * @author: HanhHa
 * @create_date: Dec 22, 2019
 * @version: 1.0
 * @modifer: HanhHa
 * @modifer_date: Dec 22, 2019
 */
public class SqlParameter {

	private int number;
	private Object values;

	/**
	 * 
	 * Constructor for class SqlParameter.
	 * 
	 * @Description: .
	 * @author: HanhHa
	 * @create_date: Dec 22, 2019
	 * @version: 1.0
	 * @modifer: HanhHa
	 * @modifer_date: Dec 22, 2019
	 * @param number
	 * @param values
	 */
	public SqlParameter(int number, Object values) {
		this.number = number;
		this.values = values;
	}

	public int getNumber() {
		return number;
	}

	public Object getValues() {
		return values;
	}

}
