package pl.mkrause.javaee.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/sklep")
public class Sklep extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
	response.setContentType("text/html");
	
	PrintWriter out = response.getWriter();
	
	
	
	
	
	out.println("<html><body><h1>Witam w sklepie z rybami</h1><br><p>Wybierz produkt</p>" +
				 "<form action='cart'>" +
				"<input type='checkbox' name='ryba' value='cod'>Cod<br />" +
				"<input type='checkbox' name='ryba' value='salmon'>Salmon<br />" +
				"<input type='checkbox' name='ryba' value='trout'>Trout<br />" +
				"<input type='checkbox' name='ryba' value='catfish'>Catfish<br />" +
				"<input type='submit' value=' Do koszyka ' />" +
				"<p>Lub dodaj do bazy:</p>" +
				"<form action='operations'>" +
				"Gatunek: <input type='text' name='gat'><br>" +
				"Data Zlowienia: <input type='text' name='data'><br>" +
				"Waga: <input type='text' name='waga'><br>" +
				"<input type='submit' value='Dodaj' />" +
				"</form></body></html>");

}
	
}
