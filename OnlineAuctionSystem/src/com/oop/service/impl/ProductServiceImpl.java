package com.oop.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.oop.model.Product;
import com.oop.service.ProductService;
import com.oop.util.AuctionDBConnection;

public class ProductServiceImpl implements ProductService{
	
	private static Connection conn;
	
	public ProductServiceImpl(){
		
		conn = AuctionDBConnection.getDBConnection();
		
	}

	

	
	@Override
	public boolean addNewProduct(Product product) throws SQLException {
		
		String sql = "Insert Into product values(?,?,?,?,?,?,?,?,?)";
		PreparedStatement pro = conn.prepareStatement(sql);
		
		pro.setObject(1, product.getProductID());
		pro.setObject(2, product.getUserID());	
		pro.setObject(3, product.getProductName());
		pro.setObject(4, product.getCategoryID());
		pro.setObject(5, product.getBrand());
		pro.setObject(6, product.getDescription());
		pro.setObject(7, product.getStartingBid());
		pro.setObject(8, product.getTime());
		pro.setObject(9, product.getImage());
		
		int res = pro.executeUpdate();
		return res>0;
	}
	
	@Override
	public boolean deleteProduct(String product) throws SQLException {
		String sql = "delete from product where product_id='"+product+"'";
		Statement pro = conn.createStatement();
		
		return pro.executeUpdate(sql) >0;
	}
	
	@Override
	public boolean updateProduct(String productName, String des, String brand, String time, double sprice, String img,
			int ccatogary, int proId) throws SQLException {
		String sql = "Update product set product_name='"+productName+"', category_id='"+ccatogary+"', description='"+des+"', brand='"+brand+"', time='"+time+"', starting_bid='"+sprice+"', image='"+img+"'  where product_id='"+proId+"' ";
		System.out.println("sql : "+sql);
		Statement pro = conn.createStatement();		
		return pro.executeUpdate(sql) > 0;
	}
	
	@Override
	public ArrayList<Product> getAllDetails(String pid) throws SQLException{
		int ppid = Integer.parseInt(pid);
		String sql = "Select image,product_name,description,brand,starting_bid,time FROM product where product_id='"+ppid+"'";
		Statement statement = conn.createStatement();
		ResultSet dtl = statement.executeQuery(sql);
		
		ArrayList<Product> details = new ArrayList<Product>();
		
		while(dtl.next()) {
			Product det = new Product();
			
			det.setProductName(dtl.getString("product_name"));
			det.setImage(dtl.getString("image"));
			det.setDescription(dtl.getString("description"));
			det.setBrand(dtl.getString("brand"));
			det.setStartingBid(Double.parseDouble(dtl.getString("starting_bid")));
			det.setTime(dtl.getString("time"));
			det.setProductID(ppid);
			
			details.add(det);
		}
		return details;		
	}
	
	@Override
	public ArrayList<Product> getAllWatches() throws SQLException {
		
		String sql = "Select product_id,product_name,image From product where category_id = 1";
		Statement statement = conn.createStatement();
		ResultSet wrs = statement.executeQuery(sql);
		
		ArrayList<Product> watches = new ArrayList<Product>();
		
		while(wrs.next()) {
			Product wat = new Product();
			
			wat.setProductID(Integer.parseInt(wrs.getString("product_id")));
			wat.setProductName(wrs.getString("product_name"));
			wat.setImage(wrs.getString("image"));
			
			watches.add(wat);
		}
		return watches;
	}

	@Override
	public ArrayList<Product> getAllSunglasses() throws SQLException {
		
		String sql = "Select product_id,product_name,image From product where category_id = 2";
		Statement statement = conn.createStatement();
		ResultSet srs = statement.executeQuery(sql);
		
		ArrayList<Product> sunglass = new ArrayList<Product>();
		
		while(srs.next()) {
			Product sun = new Product();
			
			sun.setProductID(Integer.parseInt(srs.getString("product_id")));
			sun.setProductName(srs.getString("product_name"));
			sun.setImage(srs.getString("image"));
			
			sunglass.add(sun);
		}
		
		return sunglass;
	}
	
	@Override
	public ArrayList<Product> getAllJewelleries() throws SQLException {
		
		String sql = "Select product_id,product_name,image From product where category_id = 3";
		Statement statement =conn.createStatement();
		ResultSet jrs = statement.executeQuery(sql);
		
		ArrayList<Product> jewellery = new ArrayList<Product>();
		
		while(jrs.next()) {
			Product jew = new Product();
			
			jew.setProductID(Integer.parseInt(jrs.getString("product_id")));
			jew.setProductName(jrs.getString("product_name"));
			jew.setImage(jrs.getString("image"));
			
			jewellery.add(jew);
		}
		
		return jewellery;
	}
	
	@Override
	public ArrayList<Product> getAllComputers() throws SQLException {
		
		String sql = "Select product_id,product_name,image From product where category_id = 4";
		Statement statement =conn.createStatement();
		ResultSet crs = statement.executeQuery(sql);
		
		ArrayList<Product> computers = new ArrayList<Product>();
		
		while(crs.next()) {
			Product com = new Product();
			
			com.setProductID(Integer.parseInt(crs.getString("product_id")));
			com.setProductName(crs.getString("product_name"));
			com.setImage(crs.getString("image"));
			
			computers.add(com);
		}
		
		return computers;
	}
	
	@Override
	public ArrayList<Product> getAllHomeHealth() throws SQLException {
		
		String sql = "Select product_id,product_name,image From product where category_id = 5";
		Statement statement =conn.createStatement();
		ResultSet hos = statement.executeQuery(sql);
		
		ArrayList<Product> home = new ArrayList<Product>();
		
		while(hos.next()) {
			Product hom = new Product();
			
			hom.setProductID(Integer.parseInt(hos.getString("product_id")));
			hom.setProductName(hos.getString("product_name"));
			hom.setImage(hos.getString("image"));
			
			home.add(hom);
		}
		
		return home;
	}
	
	@Override
	public ArrayList<Product> getAllSport() throws SQLException {
		
		String sql = "Select product_id,product_name,image From product where category_id = 6";
		Statement statement =conn.createStatement();
		ResultSet sps = statement.executeQuery(sql);
		
		ArrayList<Product> sport = new ArrayList<Product>();
		
		while(sps.next()) {
			Product spo = new Product();
			
			spo.setProductID(Integer.parseInt(sps.getString("product_id")));
			spo.setProductName(sps.getString("product_name"));
			spo.setImage(sps.getString("image"));
			
			sport.add(spo);
		}
		
		return sport;
	}
	
	@Override
	public ArrayList<Product> getAllFashion() throws SQLException {
		
		String sql = "Select product_id,product_name,image From product where category_id = 7";
		Statement statement =conn.createStatement();
		ResultSet fhs = statement.executeQuery(sql);
		
		ArrayList<Product> fashion = new ArrayList<Product>();
		
		while(fhs.next()) {
			Product fas = new Product();
			
			fas.setProductID(Integer.parseInt(fhs.getString("product_id")));
			fas.setProductName(fhs.getString("product_name"));
			fas.setImage(fhs.getString("image"));
			
			fashion.add(fas);
		}
		
		return fashion;
	}
	
	@Override
	public ArrayList<Product> getAllTravel() throws SQLException {
		
		String sql = "Select product_id,product_name,image From product where category_id = 8";
		Statement statement =conn.createStatement();
		ResultSet trvl = statement.executeQuery(sql);
		
		ArrayList<Product> travel = new ArrayList<Product>();
		
		while(trvl.next()) {
			Product tra = new Product();
			
			tra.setProductID(Integer.parseInt(trvl.getString("product_id")));
			tra.setProductName(trvl.getString("product_name"));
			tra.setImage(trvl.getString("image"));
			
			travel.add(tra);
		}
		
		return travel;
	}

	@Override
	public int getCatagoryId(int cat) throws SQLException {
		String sql = "select category_id from product_category where category='"+cat+"' ";
		Statement stm = conn.createStatement();
		ResultSet rst = stm.executeQuery(sql);
		int volume=0;
		
		while(rst.next()) {
			
			volume = Integer.parseInt(rst.getString("qty"));
			
		}
		return volume;
	}




	@Override
	public ArrayList<Product> getAllProducts() throws Exception {
		String sql = "select * from product";
		Statement statement = conn.createStatement();
		ResultSet rst = statement.executeQuery(sql);
		
		ArrayList<Product> product = new ArrayList<Product>();
		
		while(rst.next()) {
			Product pro = new Product();
			
			pro.setProductID(Integer.parseInt(rst.getString("product_id")));
			pro.setUserID(Integer.parseInt(rst.getString("user_id")));
			pro.setProductName(rst.getString("product_name"));
			pro.setCategoryID(Integer.parseInt(rst.getString("category_id")));
			pro.setBrand(rst.getString("brand"));
			pro.setDescription(rst.getString("description"));
			pro.setStartingBid(Double.parseDouble(rst.getString("starting_bid")));
			//System.out.println("DDDDDDDDDDDDDdd"+rst.getTime("time"));
			pro.setTime(rst.getString("time"));
			pro.setImage(rst.getString("image"));
			
			product.add(pro);
		}
		return product;
	}

	
	
	

}
