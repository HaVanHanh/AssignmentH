//
package com.vti.utils.jdbc;

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
public class SqlStatement {
	// login
	public static final String SQL_LOGIN = "SELECT 	`Email`, `FullName`,   FROM "+	"User "
			+ "WHERE 	`Email` = ? AND `Password` = ?";
}
