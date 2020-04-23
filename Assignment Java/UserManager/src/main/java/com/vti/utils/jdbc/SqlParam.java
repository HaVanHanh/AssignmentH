//
package com.vti.utils.jdbc;

/**
 * This class is sql parameter.
 * 
 * @Description: .
 * @author: HVHanh
 * @create_date: Apr 12, 2020
 * @version: 1.0
 * @modifer: HVHanh
 * @modifer_date: Apr 12, 2020
 */
public class SqlParam {
	private int index;
	private Object value;

	/**
	 * Constructor for class SqlParam.
	 * 
	 * @Description: .
	 * @author: HVHanh
	 * @create_date: Apr 12, 2020
	 * @version: 1.0
	 * @modifer: HVHanh
	 * @modifer_date: Apr 12, 2020
	 * @param i
	 * @param email
	 */
	public SqlParam(int i, String email) {
		this.index = i;
		this.value = email;

	}

	/**
	 * @return the index
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * @param index the index to set
	 */
	public SqlParam setIndex(int index) {
		this.index = index;
		return this;
	}

	/**
	 * @return the value
	 */
	public Object getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public SqlParam setValue(Object value) {
		this.value = value;
		return this;
	}

}
