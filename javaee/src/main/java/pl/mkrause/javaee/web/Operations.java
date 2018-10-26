package pl.mkrause.javaee.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pl.mkrause.javaee.domain.Fish;
import pl.mkrause.javaee.service.Storage;


@WebServlet("/operations")
public class Operations extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	HttpSession session = request.getSession();
	
	//Integer idryby = new Integer(0);
	
	
	final String selectedGatunek = "";
	for (String gat : request.getParameterValues("gat")) {
		selectedGatunek += gat + " ";
	}
		
	final String selectedDate = "";
	for (String date : request.getParameterValues("data")) {
		selectedDate += date + " ";
	}
	
	
	final String selectedWaga = "";
	for(String waga: request.getParameterValues("waga")) {
		selectedWaga += waga + " ";
	}
	
	Date data1 = new SimpleDateFormat("dd/MM/yyyy").parse(selectedDate);
	
	double waga1 = Double.parseDouble(selectedWaga);
	
	Fish fish = new Fish(selectedGatunek, data1, waga1);
	
	
	Storage store = new Storage();
	
	
	//response.setContentType("text/html");
	
	

}
	
}
