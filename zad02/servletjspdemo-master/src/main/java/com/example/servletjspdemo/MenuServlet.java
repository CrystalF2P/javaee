package com.example.servletjspdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/menu")
public class MenuServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
	response.setContentType("text/html");
	
	PrintWriter out = response.getWriter();
	
	out.println("<html><body><h1>Wybierz strone:</h1><p1><a href=\"http://localhost:8080/servletjspdemo/about\">About</a></p1><br><p2><a href=\"http://localhost:8080/servletjspdemo/date\">Date</a></p2></body></html>");
}
	
}
