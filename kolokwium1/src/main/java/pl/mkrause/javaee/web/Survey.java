package pl.mkrause.javaee.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


@WebServlet("/survey")
public class Survey extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
        if(request.getParameter("survey")==null) {
            response.sendRedirect("err.jsp");
        } else {
            response.sendRedirect("err.jsp");
        }
    }
	
	 @Override
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        PrintWriter out = response.getWriter();

	        if(request.getParameter("survey")==null) {
	            response.sendRedirect("err.jsp");
	        } else {
	            request.getSession().setAttribute("rodo",true);
	            response.sendRedirect("err.jsp");
	        }
	        
	    	HttpSession session = request.getSession();


}
}
	
