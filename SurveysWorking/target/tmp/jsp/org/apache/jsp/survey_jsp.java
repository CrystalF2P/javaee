package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class survey_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>rodo</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form action=\"survey\" method=\"post\">\r\n");
      out.write("\t\tData kupienia ryby:\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<input type=\"text\" id=\"datakupienia\" name=\"datakupienia\" required=\"required\">\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\tData zjedzenia ryby:\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<input type=\"text\" id=\"datazjedzenia\" name=\"datazjedzenia\">\r\n");
      out.write("\t\t<br>\r\n");
      out.write("   \t \tJak często je Pan/Pani nasze ryby?\r\n");
      out.write("   \t \t<br>\r\n");
      out.write("    \t<input type=\"radio\" name=\"czestosc\" value=\"codziennie\">Codziennie<br>\r\n");
      out.write("    \t<input type=\"radio\" name=\"czestosc\" value=\"tygodniowo\">Raz w tygodniu<br>\r\n");
      out.write("    \t<input type=\"radio\" name=\"czestosc\" value=\"rzadziej\">Rzadziej niż raz w tygodniu<br>\r\n");
      out.write("    \t<br>\r\n");
      out.write("    \tZgłaszane uwagi:\r\n");
      out.write("    \t<br>\r\n");
      out.write("    \t<input type=\"checkbox\" name=\"nieswieza\" value=\"nieswieza\"> Ryba była nieświeża\r\n");
      out.write("    \t<input type=\"checkbox\" name=\"niesmaczna\" value=\"niesmaczna\"> Ryba była niesmaczna\r\n");
      out.write("    \t<input type=\"checkbox\" name=\"cena\" value=\"cena\"> Ryba jest zbyt droga\r\n");
      out.write("    \t<br>\r\n");
      out.write("    \t<input type=\"submit\" value=\"submit\">\r\n");
      out.write("\t</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
