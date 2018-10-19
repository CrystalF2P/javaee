package com.example.servletjspdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cart")
public class Cart extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
	response.setContentType("text/html");
	
	PrintWriter out = response.getWriter();
	
	protected void doGet(HttpServletRequest request, 
            HttpServletResponse response)
      throws ServletException, IOException {
	}
		
	out.println("<html><body><h1>Koszyk:</h1></body></html>");
}
	
}
