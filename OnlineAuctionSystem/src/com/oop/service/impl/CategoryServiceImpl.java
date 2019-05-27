package com.oop.service.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.oop.model.Category;
import com.oop.service.CategoryService;
import com.oop.util.AuctionDBConnection;

public class CategoryServiceImpl implements CategoryService{
	
	private static Connection conn;
	public CategoryServiceImpl() throws ClassNotFoundException, SQLException {
		
		conn = AuctionDBConnection.getDBConnection();
		
	}
	@Override
	public ArrayList<Category> getAllCategory() throws SQLException {
		
		String sql = "select * from product_category";
		Statement statement = conn.createStatement();
		ResultSet rst = statement.executeQuery(sql);
		
		ArrayList<Category> category = new ArrayList<Category>();
		
		while(rst.next()) {
			
			Category cat = new Category();
			
			cat.setCategoryId(Integer.parseInt(rst.getString("category_id")));
			cat.setCategoryName(rst.getString("category"));
			
			category.add(cat);
		}
		return category;
	}
	@Override
	public int getCategoryID(String parameter) throws SQLException {
		String sql ="select category_id from product_category where category='"+parameter+"'";
		Statement statement = conn.createStatement();
		ResultSet rst = statement.executeQuery(sql);
		
		int id=0;
		while(rst.next()) {
			id=Integer.parseInt(rst.getString("category_id"));
		}
		
		
		return id;
	}
	
	

}
