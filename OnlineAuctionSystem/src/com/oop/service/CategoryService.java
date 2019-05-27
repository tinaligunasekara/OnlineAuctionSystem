package com.oop.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.oop.model.Category;


public interface CategoryService {

	ArrayList<Category> getAllCategory() throws SQLException;

	int getCategoryID(String parameter)throws SQLException;

}
