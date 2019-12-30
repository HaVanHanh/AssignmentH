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
public class StringParameter {
	private Object values1;
	private Object values2;

	public StringParameter(Object values1, Object values2) {
		this.values1 = values1;
		this.values2 = values2;
	}

	public Object getNumber() {
		return values1;
	}

	public Object getValues() {
		return values2;
	}
}
