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
 * Servlet implementation class UpdateUserServlet
 */
@WebServlet("/UpdateUserServlet")
public class UpdateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateUserServlet() {
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
		
		String userName = request.getParameter("uName");
		String firstName = request.getParameter("fName");
		String lastName = request.getParameter("lName");
		String uGender = request.getParameter("uGender");
		String uMobile = request.getParameter("uMobile");
		String uEmail = request.getParameter("uEmail");
		String uPwd = request.getParameter("uPassword");
		String uid = request.getParameter("uid");
		
		
		User u1 = new User();
		u1.setUserName(userName);
		u1.setFname(firstName);
		u1.setLname(lastName);
		u1.setGender(uGender);
		u1.setEmail(uEmail);
		u1.setMobile(uMobile);
		u1.setPassword(uPwd);
		u1.setUserId(Integer.parseInt(uid));
		
		UserService u2 = new UserServiceImpl();
		try {
			boolean isUpdated = u2.updateUser(u1);
			if(isUpdated) {
				

				
				PrintWriter writer = response.getWriter();
				writer.println("<script>");
				writer.println("alert('Updated successfully')");
				writer.println("</script>");
				
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
				dispatcher.include(request, response);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
