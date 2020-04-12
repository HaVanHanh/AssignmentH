/**
 * 
 */
package com.vti.testingsystem;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

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

public class HibernateUtils {
	 private static final SessionFactory sessionFactory = buildSessionFactory();
	 
	  // Hibernate 5:
	  private static SessionFactory buildSessionFactory() {
	      try {
	          // Tạo đối tượng ServiceRegistry từ hibernate.cfg.xml
	          ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()//
	                  .configure("hibernate.cfg.xml").build();
	 
	  
	          // Tạo nguồn siêu dữ liệu (metadata) từ ServiceRegistry
			Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
	 
	          return metadata.getSessionFactoryBuilder().build();
	      } catch (Throwable ex) {
	      
	          System.err.println("Initial SessionFactory creation failed." + ex);
	          throw new ExceptionInInitializerError(ex);
	      }
	  }
	 
	  public static SessionFactory getSessionFactory() {
	      return sessionFactory;
	  }
	 
	  public static void shutdown() {
	      // Giải phóng cache và Connection Pools.
	      getSessionFactory().close();
	  }
	 
}
