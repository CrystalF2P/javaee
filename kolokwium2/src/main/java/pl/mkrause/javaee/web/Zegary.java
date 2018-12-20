package pl.mkrause.javaee.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pl.mkrause.javaee.domain.Clock;
import pl.mkrause.javaee.service.ClockService;


@WebServlet("/shop")
public class Zegary extends HttpServlet{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		
		
		if (session.getAttribute("shop") == null)
			session.setAttribute("shop", new ClockService());
		
		ClockService cs = (ClockService) session.getAttribute("shop");
		
		PrintWriter printer = response.getWriter();
		
		
		
		printer.println("<!DOCTYPE html><html><head><meta charset=\"utf-8\"></head><body><h2>Sklep:</h2>" +
				"<form action=\"survey\" method=\"post\">" +
				"Na kiedy dostawa:" + 
				"<br>" + 
				"<input type=\"date\" id=\"datakupienia\" name=\"datakupienia\" required=\"required\">" + 
				"<br>" + 
				"Jaki rodzaj cyfr chcialby Pan/Pani na swoim zegarze?" + 
				"<br>" + 
				"<input type=\"radio\" name=\"cyfry\" value=\"arabskie\">Arabskie<br>" + 
				"<input type=\"radio\" name=\"cyfry\" value=\"rzymskie\">Rzymskie<br>" + 
				"<input type=\"radio\" name=\"cyfry\" value=\"dladzieci\">Dla dzieci (bajkowe)<br>" + 
				"<br>" + 
				"Przedzial cenowy (budzet, z przecinkiem):" +
				"<br>" +
				"<input type=\"text\" name=\"cena\">" +
				"Kolor zegara:" + 
				"<br>" + 
				"<input type=\"checkbox\" name=\"czerwony\" value=\"czerwony\"> Czerwony<br>" + 
				"<input type=\"checkbox\" name=\"niebieski\" value=\"niebieski\"> Niebieski<br>" + 
				"<input type=\"checkbox\" name=\"bialy\" value=\"bialy\"> Bialy" + 
				"<br>" + 
				"<input type=\"submit\" value=\"Submit\">" + 
				"</form>" + 
				"</body>" + 
				"</html>");
		printer.close();
		
		
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		PrintWriter printer = response.getWriter();
		
		
		try {
			response.setContentType("text/html");
			HttpSession session = request.getSession();
			
			ClockService cs = (ClockService) session.getAttribute("shop");
			
			session.setAttribute("shop", new ClockService());
			
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			
			Date dateBought;
			
			dateBought = sdf.parse(request.getParameter("datakupienia"));
			
			long msBought = dateBought.getTime();
			
			Date parsedDateBought = new Date(msBought);	
			
			boolean cze = false;
			boolean nie = false;
			boolean bia = false;
			
			if(request.getParameter("czerwoy") != null && request.getParameter("czerwony").equals("czerwony")) {
				cze = true;
			}
			else {
				cze = false;
			}
			
			if(request.getParameter("niebieski") != null && request.getParameter("niebieski").equals("niebieski")) {
				nie = true;
			}
			else {
				nie = false;
			}
			
			
			if(request.getParameter("bialy") != null && request.getParameter("bialy").equals("bialy")) {
				bia = true;
			}
			else {
				bia = false;
			}
		
			
			double cyfrydouble = Double.parseDouble(request.getParameter("cena").replaceAll(",", "."));
			
			
		cs.addClock(new Clock (parsedDateBought, request.getParameter("cyfry"), cyfrydouble, cze, nie, bia));
	
		session.setAttribute("survey", cs);
		
		
		printer.println("<br><br><br><a href=\"http://localhost:8080/clockshop/shop\">Zamow kolejny zegar</a><br>" +
						"<a href=\"http://localhost:8080/clockshop/viewclocks\">Wyswietl wszystkie zamowienia</a><br>");
		
	} catch (ParseException e) {
		
		e.printStackTrace();
	}
	
	}
	
}
