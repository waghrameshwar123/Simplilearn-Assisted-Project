package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo
 */
public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Demo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Welcome to Web Application");
		String emailid =	request.getParameter("emailid");
		String password =	request.getParameter("password");
		//JDBC code to check emailid and passwrod check from database.
		response.setContentType("text/html");
		RequestDispatcher rd1 = request.getRequestDispatcher("Home");
		RequestDispatcher rd2 = request.getRequestDispatcher("index.html");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
//	        System.out.println("Driver loaded successfully");
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_database","root","admin");
//	        System.out.println("Database connected...");
			PrintWriter pw = response.getWriter();
			PreparedStatement pstmt = con.prepareStatement("select * from login where emailid = ? and password = ?");
			pstmt.setString(1, emailid);
			pstmt.setString(2, password);
				ResultSet rs = pstmt.executeQuery();
				if(rs.next()) {
					pw.println("Successfully Login");
					rd1.forward(request, response);
				}else {
					pw.println("Invalid email or password");
					rd2.include(request, response);
				}
		}catch (Exception e) {
			
			// TODO: handle exception
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
