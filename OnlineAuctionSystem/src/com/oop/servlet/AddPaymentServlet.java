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

import com.oop.model.Payment;
import com.oop.service.PaymentService;
import com.oop.service.impl.PaymentServiceImpl;

/**
 * Servlet implementation class AddPaymentServlet
 */
@WebServlet("/AddPaymentServlet")
public class AddPaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPaymentServlet() {
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
		
		String fname = request.getParameter("firstname");
		String lname = request.getParameter("lastname");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String country = request.getParameter("Country");
		int postalCode = Integer.parseInt(request.getParameter("postalcode"));
		int contactNumber = Integer.parseInt(request.getParameter("contactnumber"));
		int  fax = Integer.parseInt(request.getParameter("fax"));
		String method = request.getParameter("card");
		
	

     Payment pay = new Payment();
     
     pay.setFirstName(fname);
     pay.setLastName(lname);
     pay.setAddress(address);
     pay.setEmail(email);
     pay.setCity(city);
     pay.setState(state);
     pay.setCountry(country);
     pay.setPostalCode(postalCode);
     pay.setContactNumber(contactNumber);
     pay.setFax(fax);
     pay.setMethod(method);
     
     PaymentService payService = new PaymentServiceImpl();
     
     try {
		boolean isAdded = payService.addNewPayment(pay);
		
		if(isAdded == true) {
			System.out.println("Success");
			
			PrintWriter  writer = response.getWriter();
			writer.println("<script>");
			writer.println("alert (' Added Successfully ')");
			writer.println("</script>");
			
			RequestDispatcher dispatcher =getServletContext().getRequestDispatcher("/index.jsp");
			dispatcher.include(request, response);

			
					
			
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     
	}
     

	
}
