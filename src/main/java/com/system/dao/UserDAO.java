/**
 * 
 */
package com.system.dao;

import java.util.List;

import com.system.model.User;

/**
 * @author thili
 *
 */
public interface UserDAO {

	public String insertNewUser(User user);
	public User getUser(int userId);
	public String updateUser(User user);
	public String deleteUser(User user);
	public List<User> getAllUser();
}
