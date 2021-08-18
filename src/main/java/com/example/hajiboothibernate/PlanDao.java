package com.example.hajiboothibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

@Repository
public class PlanDao extends AbstractDao<Plan> {

	@SuppressWarnings("unchecked")
	public List<Plan> getPlanList() {
		SessionFactory sessionFactory = getSessionFactory(new Plan());
		Session session = sessionFactory.getCurrentSession();

		List<Plan> planList = new ArrayList();
		try {
			session.beginTransaction();

			// Hibernate Query Language (HQL)を使う方法
			// From ドメイン名
			planList = session.createQuery("from Plan WHERE HOTEL_ID = 0000000001 AND PLAN_ID = 0000000001").list();

			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			sessionFactory.close();
		}

		return planList;
	}

	@SuppressWarnings("unchecked")
	public Plan getPlan() {
		SessionFactory sessionFactory = getSessionFactory(new Plan());
		Session session = sessionFactory.getCurrentSession();

		Plan plan = new Plan();
		try {
			session.beginTransaction();

			// ネイティブSQLを使う方法
			String sql = "SELECT * from PLAN WHERE HOTEL_ID = 0000000001 AND PLAN_ID = 0000000001";
			SQLQuery query = session.createSQLQuery(sql);
			query.addEntity(Plan.class);
			plan = (Plan) query.list().get(0);

			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			sessionFactory.close();
		}

		return plan;
	}
}
