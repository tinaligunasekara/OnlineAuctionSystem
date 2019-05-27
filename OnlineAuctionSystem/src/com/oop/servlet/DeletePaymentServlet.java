package com.oop.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.service.PaymentService;
import com.oop.service.impl.PaymentServiceImpl;

/**
 * Servlet implementation class DeletePaymentServlet
 */
@WebServlet("/DeletePaymentServlet")
public class DeletePaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeletePaymentServlet() {
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
		String payId = request.getParameter("deleteValue");
		System.out.println(payId);
		
		 PaymentService payService = new PaymentServiceImpl();
		 boolean isDeleted = false;
		try {
			isDeleted = payService.deletePayment(payId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 if(isDeleted == true) {
			 PrintWriter  writer = response.getWriter();
			 
				writer.println("<script>");
				writer.println("alert (' Deleted Successfully ')");
				writer.println("</script>");
				
				RequestDispatcher dispatcher =getServletContext().getRequestDispatcher("/index1.jsp");
				dispatcher.include(request, response);

				
		 }
	}

}
