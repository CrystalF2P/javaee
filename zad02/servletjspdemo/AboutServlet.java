package com.example.servletjspdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/about")
public class AboutServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
	response.setContentType("text/html");
	
	PrintWriter out = response.getWriter();
	
	out.println("<html><body><h1>O mnie</h1><p1>Michal Krause</p1><br><p2>Jezyki programowania:</p2><ul>"
			+ "<li>C</li><li>Java</li><li>Assembler</li></ul></body></html>");
}
	
}
