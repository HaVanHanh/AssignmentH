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
public class SqlStatement {

	
	public static final String LOGIN_TRAINEE = "SELECT 	account,password " + "FROM 	Infor "+ "WHERE account=? AND password= ?";
	public static final String	SELECT_ALL_TRAINEE = "SELECT account, first-name, last-name,email,password " + "FROM 	Infor "+ "WHERE account=? AND password= ?";
}
