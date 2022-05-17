package com.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.IncidentCentre;

@Component
public class IncidentCentreDAOImpl implements IncidentCentreDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void addIncident(IncidentCentre centre) {
		// TODO Auto-generated method stub
        Session session=sessionFactory.openSession();
		
		session.getTransaction().begin();
		session.save(centre);
		session.flush();
		session.getTransaction().commit();
		session.close();

	}

	@Override
	public IncidentCentre findIncident(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		IncidentCentre centre=session.get(IncidentCentre.class, id);
		return centre;
	}

	@Override
	public List<IncidentCentre> findAllIncident() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		List<IncidentCentre> incidentlist=session.createQuery("select i from IncidentCentre i").list();
		return incidentlist;
	}

	@Override
	public boolean updateIncident(IncidentCentre centre) {
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
	public boolean deleteIncident(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		IncidentCentre centre=session.find(IncidentCentre.class, id);
		session.getTransaction().begin();
		session.delete(centre);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}

}