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

import pl.mkrause.javaee.domain.Survey;
import pl.mkrause.javaee.service.SurveyService;


@WebServlet("/survey")
public class Ankiety extends HttpServlet{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		
		
		if (session.getAttribute("survey") == null)
			session.setAttribute("survey", new SurveyService());
		
		SurveyService ss = (SurveyService) session.getAttribute("survey");
		
		PrintWriter printer = response.getWriter();
		
		
		
		printer.println("<!DOCTYPE html><html><head><meta charset=\"utf-8\"></head><body><h2>Ankieta:</h2>" +
				"<form action=\"survey\" method=\"post\">" +
				"Data kupienia ryby:" + 
				"<br>" + 
				"<input type=\"date\" id=\"datakupienia\" name=\"datakupienia\" required=\"required\">" + 
				"<br>" + 
				"Data zjedzenia ryby:" + 
				"<br>" + 
				"(W przypadku niezjedzenia ryby prosze wybrac date zauwazenia nieswiezosci)" +
				"<br>" +
				"<input type=\"date\" id=\"datazjedzenia\" name=\"datazjedzenia\" required=\"required\">" + 
				"<br>" + 
				"Jak czesto je Pan/Pani nasze ryby?" + 
				"<br>" + 
				"<input type=\"radio\" name=\"czestosc\" value=\"codziennie\">Codziennie<br>" + 
				"<input type=\"radio\" name=\"czestosc\" value=\"tygodniowo\">Raz w tygodniu<br>" + 
				"<input type=\"radio\" name=\"czestosc\" value=\"rzadziej\">Rzadziej niz raz w tygodniu<br>" + 
				"<br>" + 
				"Zglaszane uwagi:" + 
				"<br>" + 
				"<input type=\"checkbox\" name=\"nieswieza\" value=\"nieswieza\"> Ryba byla nieswieza<br>" + 
				"<input type=\"checkbox\" name=\"niesmaczna\" value=\"niesmaczna\"> Ryba byla niesmaczna<br>" + 
				"<input type=\"checkbox\" name=\"cena\" value=\"cena\"> Ryba jest zbyt droga" + 
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
			
			SurveyService ss = (SurveyService) session.getAttribute("survey");
			
			session.setAttribute("survey", new SurveyService());
			
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			
			Date dateBought;
			Date dateEaten;
			
			dateBought = sdf.parse(request.getParameter("datakupienia"));
			dateEaten = sdf.parse(request.getParameter("datazjedzenia"));
			
			long msBought = dateBought.getTime();
			long msEaten = dateEaten.getTime();
			
			Date parsedDateBought = new Date(msBought);	
			Date parsedDateEaten = new Date(msEaten);
			
			boolean nsw = false;
			boolean nsm = false;
			boolean cen = false;
			
			if(request.getParameter("nieswieza") != null && request.getParameter("nieswieza").equals("nieswieza")) {
				nsw = true;
			}
			else {
				nsw = false;
			}
			
			if(request.getParameter("niesmaczna") != null && request.getParameter("niesmaczna").equals("niesmaczna")) {
				nsm = true;
			}
			else {
				nsm = false;
			}
			
			
			if(request.getParameter("cena") != null && request.getParameter("cena").equals("cena")) {
				cen = true;
			}
			else {
				cen = false;
			}
		
			
			
		ss.addSurvey(new Survey (parsedDateBought, parsedDateEaten, request.getParameter("czestosc"), nsw, nsm, cen));
		
		session.setAttribute("survey", ss);
		
		
		printer.println("<br><br><br><a href=\"http://localhost:8080/fishshop/survey\">Dodaj kolejna ankiete</a><br>" +
						"<a href=\"http://localhost:8080/fishshop/view\">Wyswietl wszystkie ankiety</a><br>");
		
	} catch (ParseException e) {
		
		e.printStackTrace();
	}
	
	}
	
}
