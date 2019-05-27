package com.oop.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.service.ProductService;
import com.oop.service.impl.ProductServiceImpl;

/**
 * Servlet implementation class DeleteProductServlet
 */
@WebServlet("/DeleteProductServlet")
public class DeleteProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteProductServlet() {
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
		String proid = request.getParameter("delete");
		ProductService proservice = new ProductServiceImpl();
		System.out.println(proid);
		
		try{
		boolean isDeleted = proservice.deleteProduct(proid);
		
		if(isDeleted == true) {
			RequestDispatcher dispatcer = getServletContext().getRequestDispatcher("/ProductManagement.jsp");
			dispatcer.include(request, response);
			System.out.print("success");
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
