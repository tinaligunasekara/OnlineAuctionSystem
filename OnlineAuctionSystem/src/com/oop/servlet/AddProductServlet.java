package com.oop.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Time;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.jrockit.jfr.RequestDelegate;

import com.oop.model.Product;
import com.oop.service.CategoryService;
import com.oop.service.ProductService;
import com.oop.service.impl.CategoryServiceImpl;
import com.oop.service.impl.ProductServiceImpl;

/**
 * Servlet implementation class AddProductServlet
 */
@WebServlet("/AddProductServlet")
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String productName = request.getParameter("pname");
		String description = request.getParameter("des");
		CategoryService category;
		int catID=0;
		try {
			category = new CategoryServiceImpl();
			 catID = category.getCategoryID(request.getParameter("cat"));
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//int catID = Integer.parseInt(request.getParameter("cat"));
		String brand = request.getParameter("brand");
		String time = request.getParameter("time");
		double strtbid =Double.parseDouble(request.getParameter("sbid"));
		String image = request.getParameter("img");
		
		
		Product product = new Product();
		
		product.setProductName(productName);
		product.setDescription(description);
		product.setCategoryID(catID);
		product.setBrand(brand);
		product.setTime(time);
		product.setStartingBid(strtbid);
		product.setImage(image);
		product.setUserID(1);
		
		ProductService proservice = new ProductServiceImpl();
		
		try{
			boolean isAdded = proservice.addNewProduct(product);
			
			if(isAdded == true) {
				
				RequestDispatcher dispatcer = getServletContext().getRequestDispatcher("/AddProduct.jsp");
				dispatcer.include(request, response);
				System.out.print("success");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
