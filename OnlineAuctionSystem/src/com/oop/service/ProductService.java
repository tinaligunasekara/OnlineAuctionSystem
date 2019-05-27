package com.oop.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.oop.model.Product;



public interface ProductService {

	ArrayList<Product> getAllProducts() throws Exception;

	boolean addNewProduct(Product product) throws SQLException;

	boolean deleteProduct(String product) throws SQLException;

	public boolean updateProduct(String productName, String des, String brand, String time, double sprice, String img,
			int ccatogary, int proId)throws SQLException;
	
	public int getCatagoryId(int catID) throws SQLException;

	ArrayList<Product> getAllDetails(String pid) throws SQLException;
	
	ArrayList<Product> getAllWatches() throws SQLException;

	ArrayList<Product> getAllSunglasses() throws SQLException;

	ArrayList<Product> getAllJewelleries() throws SQLException;

	ArrayList<Product> getAllComputers() throws SQLException;
	
	ArrayList<Product> getAllHomeHealth() throws SQLException;

	ArrayList<Product> getAllSport() throws SQLException;

	ArrayList<Product> getAllFashion() throws SQLException;

	ArrayList<Product> getAllTravel() throws SQLException;
	
	
}
