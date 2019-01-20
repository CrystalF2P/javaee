package pl.mkrause.javaee.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pl.mkrause.javaee.domain.Clock;
import pl.mkrause.javaee.service.ClockService;


@WebServlet("/viewclocks")
public class Viewclocks extends HttpServlet{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		
		int k=0;
		response.setContentType("text/html; charset=utf-8");
		HttpSession session = request.getSession();
		
		if (session.getAttribute("shop") == null)
			session.setAttribute("shop", new ClockService());
		if (getServletContext().getAttribute("clock") == null)
			getServletContext().setAttribute("clock", new ClockService());
		
		ClockService cs = (ClockService) session.getAttribute("shop");
		ClockService as = (ClockService) getServletContext().getAttribute("clock");
		
		PrintWriter printer = response.getWriter();
		

		printer.print("<html><head><meta charset=\"UTF-8\"></head><h1> Koszyk: </h1>");
		
		while(cs.getList().size()>k) {
			printer.print("Data dostawy: " + cs.getList().get(k).getDataKupienia() +
					"<br>Budzet: " + cs.getList().get(k).getCena() + 
					"<br>Rodzaj cyfr: " + cs.getList().get(k).getCyfry() +
					"<br>Kolory:" );
			

			if(cs.getList().get(k).getCzerwony() == true) {
				printer.print("<br> - Czerwony");
			}
	
			if(cs.getList().get(k).getNiebieski() == true) {
				printer.print("<br> - Niebieski");
			}			
			
			if(cs.getList().get(k).getBialy() == true) {
				printer.print("<br> - Bialy");
			}			
			
			printer.println("<br><br><form action=\"viewclocks\" method=\"post\">" +
					"<input type=\"radio\" name=\"del\" value=\"del\"> Usun z koszyka" +
					"<input type=\"hidden\" name=\"clockid\" value=\""+ cs.getList().get(k).getId() +"\">" +
					"<input type=\"hidden\" name=\"action\" value=\"delete\"><br>" +
					"<input type=\"submit\" name=\"submit\" value=\"Usun\"></form>");
			
			printer.println("<br><form action=\"viewclocks\" method=\"post\">" +
					"<input type=\"radio\" name=\"order\" value=\"order\"> Dodaj do zamowienia" +
					"<input type=\"hidden\" name=\"action\" value=\"realise\">" +
					"<input type=\"hidden\" name=\"orderid\" value=\""+ cs.getList().get(k).getId() +"\"><br>" +
					"<input type=\"submit\" name=\"submit\" value=\"Zamow\"></form>");
			
			
			printer.print("<br><br><br>");
			
			k++;
					
		}
		
		printer.println("<br><br><br><a href=\"/clockshop/shop\">Dodaj kolejne zamowienie</a><br>");
		printer.println("<a href=\"/clockshop/orders\">Wyswietl wszystkie zamowienia</a><br>");
	}	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
	
		
		PrintWriter printer = response.getWriter();
		
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		
		ClockService cs = (ClockService) session.getAttribute("shop");
		ClockService as = (ClockService) getServletContext().getAttribute("clock");
		Clock clock = null;
		
		
		session.setAttribute("shop", new ClockService());	
		
		if(request.getParameter("action").equals("realise")) {
			if(session.getAttribute("shop") != null) {
				int num = Integer.parseInt(request.getParameter("orderid"));
				clock = cs.getList().get(Integer.parseInt(request.getParameter("orderid")));
				as.addClockOrder(clock);
				cs.remove(num);
			}
		}
		
		if(request.getParameter("action").equals("delete")){
			int num = Integer.parseInt(request.getParameter("clockid"));	
			cs.removeClock(num);
		}
		
		session.setAttribute("shop", cs);
		getServletContext().setAttribute("clock", as);
		
		printer.println("<br><br><br><a href=\"/clockshop/shop\">Dodaj kolejne zamowienie</a><br>" +
				"<a href=\"/clockshop/viewclocks\">Wyswietl koszyk</a><br>");
		
	}
}