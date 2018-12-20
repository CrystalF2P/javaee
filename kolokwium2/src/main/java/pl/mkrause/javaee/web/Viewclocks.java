package pl.mkrause.javaee.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pl.mkrause.javaee.service.ClockService;


@WebServlet("/viewclocks")
public class Viewclocks extends HttpServlet{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		
		int k=0;
		response.setContentType("text/html; charset=utf-8");
		HttpSession session = request.getSession();
		if (session.getAttribute("shop") == null)
			session.setAttribute("shop", new ClockService());
		
		ClockService cs = (ClockService) session.getAttribute("shop");
		
		PrintWriter printer = response.getWriter();
		

		printer.print("<html><head><meta charset=\"UTF-8\"></head><h1> Zamowienia: </h1>");
		
		while(cs.getList().size()>k) {
			printer.print("Data dostawy: " + cs.getList().get(k).getDataKupienia() +
					"<br>Budzet: " + cs.getList().get(k).getCena() + 
					"<br>Rodzaj cyfr: " + cs.getList().get(k).getCyfry() +
					"<br>Kolory:" );
			

			if(cs.getList().get(k).getCzerwony() == true) {
				printer.print("<br>Czerwony");
			}
	
			if(cs.getList().get(k).getNiebieski() == true) {
				printer.print("<br>Niebieski");
			}			
			
			if(cs.getList().get(k).getBialy() == true) {
				printer.print("<br>Bialy");
			}			
			
			printer.println("<br><form action=\"viewclocks\" method=\"post\">" +
			"<input type=\"radio\" name=\"delete\" value=\"delete\"> Usun zamowienie<br>" +
			"<input type=\"hidden\" name=\"clockid\" value=\""+ cs.getList().get(k).getId() +"\"><br>" +
			"<input type=\"submit\" name=\"submit\" value=\"Submit\"></form>");
			
			
			printer.print("<br><br><br>");
			
			k++;
					
		}
		
		printer.println("<br><br><br><a href=\"http://localhost:8080/clockshop/shop\">Dodaj kolejne zamowienie</a><br>");
	}	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
	
		
		PrintWriter printer = response.getWriter();
		
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		
		ClockService cs = (ClockService) session.getAttribute("shop");
		
		session.setAttribute("shop", new ClockService());	
		
		int num = Integer.parseInt(request.getParameter("clockid"));
		
		cs.removeClock(num);
		
		session.setAttribute("shop", cs);
		
		printer.println("<br><br><br><a href=\"http://localhost:8080/clockshop/shop\">Dodaj kolejne zamowienie</a><br>" +
				"<a href=\"http://localhost:8080/clockshop/viewclocks\">Wyswietl wszystkie zamowienia</a><br>");
		
	}
}