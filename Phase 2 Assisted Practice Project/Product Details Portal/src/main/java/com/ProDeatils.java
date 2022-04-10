package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProDeatils
 */
public class ProDeatils extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProDeatils() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw = response.getWriter();  
        response.setContentType("text/html");  
        pw.println("<html><body>"); 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
//	        System.pw.println("Driver loaded successfully");
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","admin");
//	        System.pw.println("Database connected...");
			
	        Statement stmt = con.createStatement();  
            ResultSet rs = stmt.executeQuery("select * from products");
			
			pw.println("<table border=1 width=10% height=10%>");  
            pw.println("<tr><th>Product Id</th><th>Product Name</th><tr>");  
            while (rs.next()) 
            {  
                int n = rs.getInt("productId");  
                String nm = rs.getString("productName");    
                pw.println("<tr><td>" + n + "</td><td>" + nm + "</td></tr>");   
            }  
            pw.println("</table>");  
            pw.println("</html></body>");  
            con.close();  
			
		} catch (Exception e) {
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
