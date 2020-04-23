//
package com.vti.utils;

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
public class Constant {

	// MySQL
	public static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/User?autoReconnect=true&useSSL=false&characterEncoding=latin1&relaxAutoCommit=true";
	public static final String DRIVER_SQL_NAME = "com.mysql.cj.jdbc.Driver";
	public static final String DATABASE_USERNAME = "root";
	public static final String DATABASE_PASSWORD = "root";

	// declare message for connect database
	public static final String ERROR_LOAD_FILE_DATABASE_PROPERTIES = "Error! Cannot load file database.properties";
	public static final String ERROR_CONNECT_DATABASE_STR = "Error! connect database.";
	public static final String ERROR_DISCONNECT_DATABASE_STR = "Error! disconnect database.";
	public static final String ERROR_SQL_STATEMENT_IS_NULL = "Error! SQL statement must != null";
	public static final String ERROR_SQL_PROCEDURE_NAME_IS_NULL = "Error! SQL procedure name must != null";
	public static final String ERROR_SQL_PARAMETER_MUST_NON_EMPTY = "Error! SQL parameter must != null & empty";
	public static final String ERROR_DRIVER_NAME = "Error! driver name.";
	public static final String SUCCESS = "Success!";
	public static final String ERROR = "Error";

	// scanner
	public static final String ERROR_VALIDATE_INT = "Invalid value, Please input interger: ";
	public static final String ERROR_VALIDATE_FLOAT = "Invalid value, Please input float: ";
	public static final String ERROR_VALIDATE_DOUBLE = "Invalid value, Please input double: ";
	public static final String ERROR_VALIDATE_STRING = "Invalid value, Please input string: ";

}
