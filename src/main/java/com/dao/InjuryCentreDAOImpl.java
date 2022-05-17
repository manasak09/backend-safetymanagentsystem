package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.InjuryCentre;

@Component
public class InjuryCentreDAOImpl  implements InjuryCentreDAO{
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void addInjury(InjuryCentre centre) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	Session session=sessionFactory.openSession();
		
		session.getTransaction().begin();
		session.save(centre);
		session.flush();
		session.getTransaction().commit();
		session.close();
		
	}

	@Override
	public InjuryCentre findInjury(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		InjuryCentre centre=session.get(InjuryCentre.class, id);
		return centre;
		
	}

	@Override
	public List<InjuryCentre> findAllInjury() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		List<InjuryCentre> personlist=session.createQuery("select i from InjuryCentre i").list();
		return personlist;
	}

	@Override
	public boolean updateInjury(InjuryCentre centre) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.update(centre);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}

	@Override
	public boolean deleteInjury(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		InjuryCentre centre=session.find(InjuryCentre.class, id);
		session.getTransaction().begin();
		session.delete(centre);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}



}
