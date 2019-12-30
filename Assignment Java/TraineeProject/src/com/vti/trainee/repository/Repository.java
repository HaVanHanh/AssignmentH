/**
 * 
 */
package com.vti.trainee.repository;

import java.util.List;

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
public interface Repository<T> {
	public List<T> getAll();

	public T getByID(int id);

	public boolean create(T entity);

	public boolean update(T entity);

	public boolean delete(int id);

	public boolean login(String account, String password);
	
}
