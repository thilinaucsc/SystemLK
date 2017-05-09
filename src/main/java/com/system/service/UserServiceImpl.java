/**
 * 
 */
package com.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.dao.UserDAO;
import com.system.model.User;

import lk.system.slk.user.UserListType;
import lk.system.slk.user.UserType;

@Service
public class UserServiceImpl implements IUserService{
	@Autowired
	private UserDAO userDAO;

	@Override
	public String createOrSaveNewUserInfo(UserType userType) {

		User newUser = new User();
		newUser.setId(userType.getId());
		newUser.setName(userType.getName());
		newUser.setEmail(userType.getEmail());
		newUser.setPassword(userType.getPassword());
		return userDAO.insertNewUser(newUser);
	}

	@Override
	public UserType getUserInfo(int userId) {

		User getUser = userDAO.getUser(userId);

		UserType userType = new UserType();
		userType.setId(getUser.getId());
		userType.setName(getUser.getName());
		userType.setPassword(getUser.getPassword());
		userType.setEmail(getUser.getEmail());
		return userType;
	}

	@Override
	public String updateUserInfo(UserType userType) {

		User modifyUser = new User();
		modifyUser.setId(userType.getId());
		modifyUser.setName(userType.getName());
		modifyUser.setPassword(userType.getPassword());
		modifyUser.setEmail(userType.getEmail());
		return userDAO.updateUser(modifyUser);
	}

	@Override
	public String deleteUserInfo(UserType userType) {

		User removeUser = new User();
		removeUser.setId(userType.getId());
		removeUser.setName(userType.getName());
		removeUser.setPassword(userType.getPassword());
		removeUser.setEmail(userType.getEmail());
		return userDAO.deleteUser(removeUser);
	}

	@Override
	public UserListType getAllUserInfo() {

		List<User> lstUser = userDAO.getAllUser();
		UserListType userListType = new UserListType();

		for(User user : lstUser){
			UserType userType = new UserType();
			userType.setId(user.getId());
			userType.setName(user.getName());
			userType.setPassword(user.getPassword());
			userType.setEmail(user.getEmail());
			userListType.getUserType().add(userType);
		}
		return userListType;
	}
}
