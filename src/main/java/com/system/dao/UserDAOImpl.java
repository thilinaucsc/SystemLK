/**
 * 
 */
package com.system.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.system.model.User;

/**
 * @author thili
 *
 */

@Repository("userDAO")
public class UserDAOImpl implements UserDAO{

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public String insertNewUser(User user) {

		// inserts into database & return userId (primary_key)
		int userId = (Integer) sessionFactory.getCurrentSession().save(user);
		return "User information saved successfully with User_ID " + userId;
	}

	@Override
	@Transactional
	public User getUser(int userId) {

		// retrieve user based on the id supplied in the formal argument
		User user = (User) sessionFactory.getCurrentSession().get(User.class, userId);
		return user;
	}

	@Override
	@Transactional
	public String updateUser(User user) {

		// update database with user information and return success msg
		sessionFactory.getCurrentSession().update(user);
		return "User information updated successfully";
	}

	@Override
	@Transactional
	public String deleteUser(User user) {

		// delete user information and return success msg
		sessionFactory.getCurrentSession().delete(user);
		return "User information deleted successfully";
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<User> getAllUser() {

		// get all user info from database
		List<User> lstUser = sessionFactory.getCurrentSession().createCriteria(User.class).list();
		return lstUser;
	}
}
