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

import com.oop.model.User;
import com.oop.service.UserService;
import com.oop.service.impl.UserServiceImpl;

/**
 * Servlet implementation class addUserServlet
 */
@WebServlet("/addUserServlet")
public class addUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String uName;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addUserServlet() {
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
		// TODO Auto-generated method stub
		

		String userName = request.getParameter("uName");
		String firstName = request.getParameter("fName");
		String lastName = request.getParameter("lName");
		String uGender = request.getParameter("Gender");
		String uMobile = request.getParameter("mobile");
		String uEmail = request.getParameter("email");
		String uPwd = request.getParameter("pwd");
		String uPos = request.getParameter("Pos");
		
		User u1 = new User();
		u1.setUserName(userName);
		u1.setFname(firstName);
		u1.setLname(lastName);
		u1.setGender(uGender);
		u1.setMobile(uMobile);
		u1.setEmail(uEmail);
		u1.setPassword(uPwd);
		u1.setPosition(uPos);
		
		UserService userService = new UserServiceImpl();
		
		
		try {
			boolean isAdded = userService.addNewUser(u1);
			
			if(isAdded = true) {
				System.out.println("Success");
				
				
				PrintWriter writer = response.getWriter();
				writer.println("<script>");
				writer.println("alert('Added successfully')");
				writer.println("</script>");
				
				
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/LoginJsp.jsp");
				dispatcher.include(request, response);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
