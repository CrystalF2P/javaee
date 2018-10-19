

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
	
	
	
	
	
	out.println("<html><body><h1>Witam w sklepie z rybami</h1><br><p>Wybierz produkt</p>"
			+ "<form action=\"cart\" target=\"_blank\" method=\"GET\">"
			+ "<input type=\"radio\" name=\"szprot\" id=\"szprot\" value=\"szprot\" /><label for=\"szprot\">Szprot</label><br />"
			+ "<input type=\"radio\" name=\"losos\" id=\"losos\" value=\"losos\" /><label for=\"track\">Losos</label><br />"
			+ "<input type=\"radio\" name=\"sledz\" id=\"sledz\" value=\"sledz\" /><label for=\"track\">Sledz</label><br />"
			+ "<input type=\"submit\" value=\"Wyslij\"</body></html>");

}
	
}
