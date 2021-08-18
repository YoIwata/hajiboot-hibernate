
package com.example.hajiboothibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public abstract class AbstractDao<T> {

	public SessionFactory getSessionFactory(T targetClass) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(targetClass.getClass()).buildSessionFactory();
		return sessionFactory;
	}
}
