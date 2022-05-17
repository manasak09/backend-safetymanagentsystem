package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.model.UserProfileDetails;
@Component
public class UserProfileDAOImpl  implements UserProfileDAO{
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void addProfile(UserProfileDetails profile) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(profile);
		session.flush();
		session.getTransaction().commit();
		session.close();
		
	}

	@Override
	public UserProfileDetails findProfile(String useremail) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		UserProfileDetails profile=session.find(UserProfileDetails.class, useremail);
		
		return  profile;
	}

	@Override
	public List<UserProfileDetails> findAllProfile() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		List<UserProfileDetails> profilelist=session.createQuery("select i from UserProfileDetails i").list();
		
		return profilelist;
		
	}

	@Override
	public boolean updateProfile(UserProfileDetails profile) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.update(profile);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
		
	}

	@Override
	public boolean deleteProfile(String useremail) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		UserProfileDetails profile=session.find(UserProfileDetails.class,useremail);
		session.getTransaction().begin();
		session.delete(profile);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}

}
