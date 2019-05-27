	package com.oop.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.model.Bid;
import com.oop.service.BidService;
import com.oop.service.impl.BidServiceImpl;

/**
 * Servlet implementation class AddBidServlet
 */
@WebServlet("/AddBidServlet")
public class AddBidServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBidServlet() {
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
		//doGet(request, response);
		
		
		String pID = request.getParameter("productIdName");
		String bidPrice= request.getParameter("bidform");
		
		String userID = request.getParameter("userId");
		
		
		Bid b1 = new Bid();
		
		b1.setBidPrice(Double.parseDouble(bidPrice));
		b1.setpID(Integer.parseInt(pID));
		b1.setUserID(Integer.parseInt(userID));
		b1.setBidInit(1000);
		BidService bService = new BidServiceImpl();
		
		
		try {
			boolean isAdded = bService.addNewBid(b1);
			
			if(isAdded == true) {
				
				System.out.println("Success");
				PrintWriter writer = response.getWriter();
				
				writer.println("<script>");
				writer.println("alert('Added Successfully')");
				writer.println("</script>");
				
				
				
				
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
				dispatcher.include(request,response);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private int parseInteger(String parameter) {
		// TODO Auto-generated method stub
		return 0;
	}

}



