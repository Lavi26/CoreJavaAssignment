package com.hibernateutil;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.mysql.cj.Session;

public class HibernateUtil {

	static SessionFactory sessionFactoryObj;
	static Session sessionObj;

	public static SessionFactory buildSessionFactory() {

		// Creating Configuration Instance & Passing Hibernate Configuration File
		Configuration configurationObj = new Configuration();
		configurationObj.configure("hibernate.cfg.xml");
		SchemaExport(cfg).create(true, true);
		// // Since Hibernate Version 4.x, ServiceRegistry Is Being Used
		ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder()
				.applySettings(configurationObj.getProperties()).build();

		// Creating Hibernate SessionFactory Instance
		sessionFactoryObj = configurationObj.buildSessionFactory(serviceRegistryObj);
		return sessionFactoryObj;
	}
		
}