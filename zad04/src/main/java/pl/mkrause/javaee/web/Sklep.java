package pl.mkrause.javaee.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pl.mkrause.javaee.domain.Guest;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


@WebServlet("/sklep")
public class Sklep extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		String name = request.getParameter("name");
		String surname = request.getParameter("surname");
		
		
		Guest guest = null;
		if (session.getAttribute("guestsession") == null) {
			guest = new Guest (name, surname);
		}
		else {
			guest = (Guest) session.getAttribute("guestsession");
		}
		
		session.setAttribute("guestsession", guest);
		
        if(request.getParameter("rodo")==null) {
            response.sendRedirect("errRodo.jsp");
        } else {
            response.sendRedirect("sklep.jsp");
        }
    }
	
	 @Override
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        PrintWriter out = response.getWriter();

	        if(request.getParameter("rodo")==null) {
	            response.sendRedirect("errRodo.jsp");
	        } else {
	            request.getSession().setAttribute("rodo",true);
	            response.sendRedirect("sklep.jsp");
	        }
	        
	    	HttpSession session = request.getSession();
			
			String name = request.getParameter("name");
			String surname = request.getParameter("surname");
			
			
			Guest guest = null;
			if (session.getAttribute("guestsession") == null) {
				guest = new Guest (name, surname);
			}
			else {
				guest = (Guest) session.getAttribute("guestsession");
			}
			
			session.setAttribute("guestsession", guest);
			
	        if(request.getParameter("rodo")==null) {
	            response.sendRedirect("errRodo.jsp");
	        } else {
	            response.sendRedirect("sklep.jsp");
	        }
	    }


}
	
