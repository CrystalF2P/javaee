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
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		if (session.getAttribute("survey") == null)
			session.setAttribute("survey", new SurveyService());
		
		SurveyService ss = (SurveyService) session.getAttribute("survey");
		
		PrintWriter printer = response.getWriter();
		

		printer.print("<html><head><meta charset=\"UTF-8\"></head><h1> Panstwa ankiety: </h1>");
		
		while(ss.getList().size()>k) {
			printer.print("Data Kupienia: " + ss.getList().get(k).getDataKupienia() +
					"<br>Data Zjedzenia: " + ss.getList().get(k).getDataZjedzenia() +
					"<br>Czestotliwosc kupowania w naszym sklepie: " + ss.getList().get(k).getCzestosc() +
					"<br>Uwagi:" );
			

			if(ss.getList().get(k).getNieswieza() == true) {
				printer.print("<br>Ryba jest nieswieza");
			}
	
			if(ss.getList().get(k).getNiesmaczna() == true) {
				printer.print("<br>Ryba jest niesmaczna");
			}			
			
			
			if(ss.getList().get(k).getCena() == true) {
				printer.print("<br>Ryba jest zbyt droga");
			}			
			
			printer.println("<br><form action=\"view\" method=\"post\">" +
			"<input type=\"radio\" name=\"delete\" value=\"delete\"> Usun ankiete<br>" +
			"<input type=\"hidden\" name=\"surveyid\" value=\""+ ss.getList().get(k).getId() +"\"><br>" +
			"<input type=\"submit\" name=\"submit\" value=\"Submit\"></form>");
			
			
			printer.print("<br><br><br>");
			
			k++;
					
		}
		
		printer.println("<br><br><br><a href=\"http://localhost:8080/fishshop/survey\">Dodaj kolejna ankiete</a><br>");
	}	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
	
		
		PrintWriter printer = response.getWriter();
		
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		
		SurveyService ss = (SurveyService) session.getAttribute("survey");
		
		session.setAttribute("survey", new SurveyService());	
		
		int num = Integer.parseInt(request.getParameter("surveyid"));
		
		ss.removeSurvey(num);
		
		session.setAttribute("survey", ss);
		
		printer.println("<br><br><br><a href=\"http://localhost:8080/fishshop/survey\">Dodaj kolejna ankiete</a><br>" +
				"<a href=\"http://localhost:8080/fishshop/view\">Wyswietl wszystkie ankiety</a><br>");
		
	}
}