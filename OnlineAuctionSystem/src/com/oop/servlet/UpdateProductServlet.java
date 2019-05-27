package com.oop.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.glassfish.gmbal.Description;

import com.oop.model.Category;
import com.oop.model.Product;
import com.oop.service.CategoryService;
import com.oop.service.ProductService;
import com.oop.service.impl.CategoryServiceImpl;
import com.oop.service.impl.ProductServiceImpl;

/**
 * Servlet implementation class UpdateProductServlet
 */
@WebServlet("/UpdateProductServlet")
public class UpdateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateProductServlet() {
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
		String des = request.getParameter("des");
		CategoryService category;
		int catID=0;
		try {
			category = new CategoryServiceImpl();
			 catID = category.getCategoryID(request.getParameter("cat"));
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		String brand = request.getParameter("bra");
		String time = request.getParameter("tm");
		double sprice = Double.parseDouble(request.getParameter("bid"));
		String img = request.getParameter("img");
		int proId = Integer.parseInt(request.getParameter("editPid") );
		//String catagory = request.getParameter("catagory");
		//int catagory = Integer.parseInt(request.getParameter("selectedType"));
		
		Product uppro = new Product();
		
		uppro.setProductName(productName);
		uppro.setDescription(des);
		uppro.setCategoryID(catID);
		uppro.setBrand(brand);
		uppro.setTime(time);
		uppro.setStartingBid(sprice);
		uppro.setImage(img);
		
		System.out.println(productName);
		System.out.println(time);
		System.out.println(brand);
		System.out.println(catID);
		
		
		ProductService upproserv = new ProductServiceImpl();
	
		
		try {
			
			boolean isupdated = upproserv.updateProduct(productName,des,brand,time,sprice,img,catID,proId);
			
			if(isupdated == true) {
				RequestDispatcher dispatcer = getServletContext().getRequestDispatcher("/ProductManagement.jsp");
				dispatcer.include(request, response);
				System.out.print("success");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
