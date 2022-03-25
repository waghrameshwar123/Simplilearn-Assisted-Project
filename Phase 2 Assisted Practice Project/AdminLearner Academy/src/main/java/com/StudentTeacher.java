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
 * Servlet implementation class StudentTeacher
 */
public class StudentTeacher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentTeacher() {
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
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_database","root","admin");
//	        System.pw.println("Database connected...");
			
	        Statement stmt = con.createStatement();  
            ResultSet rs = stmt.executeQuery("select t.tname,t.subject,t.cls,s.sname from teacher t inner join student s on t.tid = s.tsid");
			
			pw.println("<table border=1 width=10% height=10%>");  
            pw.println("<tr><th>Teacher Name</th><th>Subject</th><th>Class</th><th>Student</th><tr>");  
            while (rs.next()) 
            {  
                 
                String n = rs.getString("tname");
                String o = rs.getString("subject");  
                String p = rs.getString("cls");
                String q = rs.getString("sname");
                pw.println("<tr><td>" + n + "</td><td>" + o + "</td><td>" + p + "</td><td>" + q +"</td></tr>");   
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
