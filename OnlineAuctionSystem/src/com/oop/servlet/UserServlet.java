package com.oop.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oop.model.User;
import com.oop.service.UserService;
import com.oop.service.impl.UserServiceImpl;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
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
		
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		UserService userServ = new UserServiceImpl();
		
		try {
			
			//GET uSER details from database 
			User user = userServ.LoginFunction(userName,password);
			
			HttpSession session = request.getSession();
			
			
			//check User id 
			
			if(user.getUserId()==0) {
				
				//if user id is 0  set session message
				
				String sessionError = "UserName Or Password is Invalid";
				session.setAttribute("sessionError","UserName Or Password is Invalid");
				
				
				response.sendRedirect("LoginJsp.jsp");
				
				
				
			}else {
				
				//check User Position  
				
				if(user.getPosition().equals("customer")) {
					
					
					//if user position is customer ,set sessions  
					session.setAttribute("UserId",user.getUserId());
					System.out.println(user.getUserId());
					
					session.setAttribute("UserName",user.getUserName());
					session.setAttribute("UserId",user.getUserId());
					session.setAttribute("first_name", user.getFname());
					session.setAttribute("last_name", user.getLname());
					session.setAttribute("gender", user.getGender());
					session.setAttribute("email", user.getEmail());
					System.out.println(user.getEmail());
					session.setAttribute("mobile", user.getMobile());
					session.setAttribute("password", user.getPassword());
					session.setAttribute("uid",user.getUserId());
					
					
					
					session.setAttribute("Log", "Logged");
					session.setAttribute("position","customer");
					
					
					RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
					dispatcher.forward(request,response);
					
				}
				
				
				if(user.getPosition().equals("seller")) {
					
					
					
					RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/HomeSeller.jsp");
					dispatcher.forward(request,response);
					
				}
				if(user.getPosition().equals("Admin")) {
					
					
					RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Admin.jsp");
					dispatcher.forward(request,response);
					
				}
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		doGet(request, response);
	}

}
