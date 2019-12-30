/**
 * 
 */
package com.vti.trainee.utils.jdbc;

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
public class SqlParameter {
	private int number;
	private Object values;

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
