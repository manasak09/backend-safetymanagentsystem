package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.User;
@Component
public class UserDAOImpl implements UserDAO {

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
	Session session=sessionFactory.openSession();
		
		session.getTransaction().begin();
		session.save(user);
		session.flush();
		session.getTransaction().commit();
		session.close();
		
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.update(user);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
		
	}


	@Override
	public User findUser(String userEmail) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		User user=session.get(User.class, userEmail);
		return user ;
		
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		List<User>  userlist=session.createQuery("select i  from User i").list();
		return userlist;
		
	}





	@Override
	public boolean deleteUser(String  userEmail) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		User user=session.find(User.class, userEmail);
		session.delete(user);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
		
	}

}
