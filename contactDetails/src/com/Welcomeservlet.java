package com;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Welcomeservlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		String n=request.getParameter("uname");
		
		out.println("<h2>Welcome<br>"+n+"</h2>");
		
		out.println("<a href='Myprofileservlet'>myProfile</a><br>");
		
		
		/*out.println("<form action ='Myprofileservlet' method ='get'>");
		out.println("<input type='hidden' name='hname' value="+n+">");
		out.println("<input type='submit' value='Myprofile'>");*/
		
		out.println("<a href='Empsearch.html'>Employee search</a><br>");
		
		out.println("</form>");
	}


}
