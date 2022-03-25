package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<h3>Welcome Home Page</h3>");
		pw.println("<html><body>");
		pw.println("<br><h3><a href='Student'>Students</a></h3>");
		pw.println("<br><h3><a href='Teacher'>Teacher</a></h3>");
		pw.println("<br><h3><a href='Classes'>Classes</a></h3>");
		pw.println("<br><h3><a href='Subject'>Subject</a></h3>");
		pw.println("<h2>For Student and Teacher Info.</h2>");
		pw.println("<h4><a href='StudentTeacher'>Click Here</a></h4>");	
		pw.println("<br><h3><a href='index.html'>Log Out</a></h3>");
		pw.println("</body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
