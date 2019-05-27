package com.oop.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.oop.model.User;

public interface UserService {

	User LoginFunction(String email, String password)throws SQLException;

	boolean addNewUser(User u1)throws SQLException;

	public ArrayList<User> getAllUsers()throws SQLException;

	boolean deleteUser(String userID)throws SQLException;

	boolean updateUser(User u2)throws SQLException;
}
