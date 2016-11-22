package com.msr.springhbm.test;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

public class TestMain {

	public static void main(String[] args) {
		
		Properties hibernateProperties = new Properties();
		 hibernateProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
	     hibernateProperties.put("hibernate.show_sql", "true");
	     hibernateProperties.put("hibernate.format_sql", "true");
	     hibernateProperties.put("hibernate.hbm2ddl_auto", "create");
		
	     DriverManagerDataSource dataSource = new DriverManagerDataSource();
	      dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	      dataSource.setUrl("jdbc:mysql://10.25.3.209:3306/test");
	      dataSource.setUsername("root");
	      dataSource.setPassword("hadoop");
		
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		 sessionFactory.setHibernateProperties(hibernateProperties);
		 sessionFactory.setDataSource(dataSource);
		 sessionFactory.setPackagesToScan(new String[] { "com.msr.springhbm.dto" });
		 
		 SessionFactory session = sessionFactory.getObject();
		 
		 session.openSession();
		 
		 
		
	}
}
