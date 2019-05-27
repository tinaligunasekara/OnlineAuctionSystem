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

import com.oop.service.BidService;
import com.oop.service.impl.BidServiceImpl;

/**
 * Servlet implementation class DeleteBidServlet
 */
@WebServlet("/DeleteBidServlet")
public class DeleteBidServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteBidServlet() {
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
		
		String bidID = request.getParameter("deleteValue");
		
		BidService bService = new BidServiceImpl();
		
		
		try {
			boolean isDeleted = bService.deleteBid(bidID);
			if(isDeleted) {
				
				PrintWriter writer = response.getWriter();
				
				writer.println("<script>");
				writer.println("alert('Deleted Successfully')");
				writer.println("</script>");
				
				RequestDispatcher dispatcer = getServletContext().getRequestDispatcher("/BidTable.jsp");
				dispatcer.include(request, response);
				System.out.print("success");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
