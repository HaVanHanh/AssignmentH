/**
 * 
 */
package com.vti.testingsystem.query;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.vti.testingsystem.HibernateUtils;
import com.vti.testingsystem.entities.Department;

/**
 * This class is . 
 * 
 * @Description: .
 * @author: Hanh Ha
 * @create_date: Feb 5, 2020
 * @version: 1.0
 * @modifer: Hanh Ha
 * @modifer_date: Feb 5, 2020
 */

public class QueryObjectDemo {
	public static void main(String[] args) {
	      SessionFactory factory = HibernateUtils.getSessionFactory();
	 
	      Session session = factory.getCurrentSession();
	 
	      try {
	          // Tất cả các lệnh hành động với DB thông qua Hibernate
	          // đều phải nằm trong 1 giao dịch (Transaction)
	          // Bắt đầu giao dịch
	          session.getTransaction().begin();
	 
	          // Tạo một câu lệnh HQL query object.
	          // Tương đương với Native SQL:
	          // Select e.* from EMPLOYEE e order by e.EMP_NAME, e.EMP_NO
	 
	          String sql = "Select d from " + Department.class.getName() + " d "
	                  + " order by d.id, d.name ";
	 
	          // Tạo đối tượng Query.
	          Query<Department> query = session.createQuery(sql);
	 
	          // Thực hiện truy vấn.
	          List<Department> department = query.getResultList();
	 
	          for (Department dep : department) {
	              System.out.println("Emp: " + dep.getId() + " : "
	                      + dep.getName());
	          }
	 
	          // Commit dữ liệu
	          session.getTransaction().commit();
	      } catch (Exception e) {
	          e.printStackTrace();
	          // Rollback trong trường hợp có lỗi xẩy ra.
	          session.getTransaction().rollback();
	      }
	  }
	  
}
