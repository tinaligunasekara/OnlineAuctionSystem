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
 * Servlet implementation class UpdatePaymentServlet
 */
@WebServlet("/UpdatePaymentServlet")
public class UpdatePaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatePaymentServlet() {
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
        int paymentId = Integer.parseInt(request.getParameter("paymentId"));
        String fname = request.getParameter("firstname");
		String lname = request.getParameter("lastname");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String country = request.getParameter("Country");
		String postalCode = request.getParameter("postalcode");
		String contactNumber =request.getParameter("contactnumber");
		String  fax =request.getParameter("fax");
		String method = request.getParameter("card");
		
		//int payID = Integer.parseInt(paymentId);
		int postCod = Integer.parseInt(postalCode);
		int contNum = Integer.parseInt(contactNumber);
		int fa = Integer.parseInt(fax);
		
		PaymentService payService = new PaymentServiceImpl();
		 
		 
		 try {
			boolean isUpdate = payService.UpdatePayment(paymentId, postCod, contNum,fname,lname,address,email,city,state,country,fax);
			 
			 if(isUpdate == true) {
				 PrintWriter  writer = response.getWriter();
				 
					writer.println("<script>");
					writer.println("alert (' Updated Successfully ')");
					writer.println("</script>");
					
					RequestDispatcher dispatcher =getServletContext().getRequestDispatcher("/index1.jsp");
					dispatcher.include(request, response);

					
			 }
			 
		 } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			
			
		
		
	
	}
	

}
