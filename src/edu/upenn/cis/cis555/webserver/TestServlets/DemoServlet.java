package edu.upenn.cis.cis555.webserver;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class DemoServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<HTML><HEAD><TITLE>Simple Servlet</TITLE></HEAD><BODY>");
		out.println("<P>Hello!</P>");
		//out.println("Params: " + request.getParameterMap());
		//out.println("Path info: " + request.getPathInfo());
		out.println("</BODY></HTML>");
		//response.sendError(123, "Wtf Error");
		//response.sendRedirect("http://www.google.com");
		//int[] a = new int[2];
		//a[3] = 4;
	}
/**	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Params: " + request.getParameterMap());
	}**/
}
