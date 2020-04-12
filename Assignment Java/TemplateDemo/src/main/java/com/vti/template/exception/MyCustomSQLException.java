package com.vti.template.exception;

/**
 * This class is custom Exception.
 * 
 * @Description: .
 * @author: NNDuy
 * @create_date: Jan 10, 2020
 * @version: 1.0
 * @modifer: NNDuy
 * @modifer_date: Jan 10, 2020
 */
public class MyCustomSQLException extends Exception {

	private static final long serialVersionUID = 1L;
	private int code;
	private String message;

	/**
	 * Constructor for class MyCustomSQLException.
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: Jan 10, 2020
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: Jan 10, 2020
	 * @param message
	 */
	public MyCustomSQLException(String message) {
		this.message = message;
	}

	/**
	 * Constructor for class MyCustomSQLException.
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: Jan 10, 2020
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: Jan 10, 2020
	 * @param code
	 * @param message
	 */
	public MyCustomSQLException(int code, String message) {
		this.message = message;
		this.code = code;
	}

	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @return the reason
	 */
	@Override
	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		String result = "";

		// code
		result += "Code Exception: " + code + "\n";

		// user can see exception
		if (code > 100) {
			result += "Message Exception: " + message;
		} else {
			// only developer see detail message
			result += "Message Exception: " + ExceptionConstant.MS_COMMON_ERROR_EXECUTING + "\n";
			result += "Detail messgage: " + message;
		}
		return result;
	}

}
