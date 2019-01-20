package pl.mkrause.javaee.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pl.mkrause.javaee.service.ClockService;


@WebServlet("/orders")
public class Zamowienia extends HttpServlet{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		
		
		response.setContentType("text/html; charset=utf-8");
		HttpSession session = request.getSession();
		
		
		if (session.getAttribute("shop") == null)
			session.setAttribute("shop", new ClockService());
		if (getServletContext().getAttribute("clock") == null)
			getServletContext().setAttribute("clock", new ClockService());
		
		ClockService cs = (ClockService) session.getAttribute("shop");
		ClockService as = (ClockService) getServletContext().getAttribute("clock");
		
		PrintWriter printer = response.getWriter();
		
		int k=0;

		printer.print("<html><head><meta charset=\"UTF-8\"></head><h1> Wszystkie zamowienia: </h1>");
		
		while(as.getOrderList().size()>k) {
			printer.print("Data dostawy: " + as.getOrderList().get(k).getDataKupienia() +
					"<br>Budzet: " + as.getOrderList().get(k).getCena() + 
					"<br>Rodzaj cyfr: " + as.getOrderList().get(k).getCyfry() +
					"<br>Kolory:" );
			

			if(as.getOrderList().get(k).getCzerwony() == true) {
				printer.print("<br> - Czerwony");
			}
	
			if(as.getOrderList().get(k).getNiebieski() == true) {
				printer.print("<br> - Niebieski");
			}			
			
			if(as.getOrderList().get(k).getBialy() == true) {
				printer.print("<br> - Bialy");
			}			
			
			printer.print("<br><br>");
			
			k++;
					
		}
		printer.println("<br><br><br><a href=\"/clockshop/viewclocks\">Powrot do koszyka</a><br>");
	}

	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
	
		
		PrintWriter printer = response.getWriter();
		
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		
		ClockService cs = (ClockService) session.getAttribute("shop");
		ClockService as = (ClockService) getServletContext().getAttribute("clock");
		
		session.setAttribute("shop", new ClockService());	
		
		session.setAttribute("shop", cs);
		
		printer.println("<br><br><br><br>" +
				"<a href=\"/clockshop/viewclocks\">Wyswietl koszyk</a><br>");
		
	}
}