package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.model.InjuryCentre;
import com.model.Reports;
@Component
public class ReportDAOImpl implements ReportsDAO {
@Autowired
SessionFactory sessionFactory;
	@Override
	public void addReports(Reports reports) {
		// TODO Auto-generated method stub
Session session=sessionFactory.openSession();
		
		session.getTransaction().begin();
		session.save(reports);
		session.flush();
		session.getTransaction().commit();
		session.close();
		
	}

	@Override
	public Reports findReports(int id) {
		Session session=sessionFactory.openSession();
		Reports reports=session.get(Reports.class, id);
		return reports;
		
	}

	@Override
	public List<Reports> findAllReports() {
		Session session=sessionFactory.openSession();
		List<Reports> reportlist=session.createQuery("Select i from Report i").list();
		return reportlist;
	}

	@Override
	public boolean updateReports(Reports reports) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.update(reports);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}

	@Override
	public boolean deleteReports(int id) {
		Session session=sessionFactory.openSession();
		Reports reports=session.find(Reports.class, id);
		session.getTransaction().begin();
		session.delete(reports);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}

}
