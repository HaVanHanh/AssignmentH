//
package com.vti.repository;

import com.vti.form.LoginForm;

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
public interface UserRepository<T> {

	public boolean login(LoginForm form);

	public void register();
}
