package com.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.RequestAction;

@Component
public class RequestActionDAOImpl implements RequestActionDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void addRequest(RequestAction action) {
		// TODO Auto-generated method stub
        Session session=sessionFactory.openSession();
		
		session.getTransaction().begin();
		session.save(action);
		session.flush();
		session.getTransaction().commit();
		session.close();

	}

	@Override
	public  RequestAction findRequest(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		RequestAction action=session.get(RequestAction.class, id);
		return action;
	}

	@Override
	public List<RequestAction> findAllRequest() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		List<RequestAction> Requestlist=session.createQuery("select i from RequestAction i").list();
		return Requestlist;
	}

	@Override
	public boolean updateRequest(RequestAction action) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.update(action);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}

	@Override
	public boolean deleteRequest(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		RequestAction action=session.find(RequestAction.class, id);
		session.getTransaction().begin();
		session.delete(action);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}

}
