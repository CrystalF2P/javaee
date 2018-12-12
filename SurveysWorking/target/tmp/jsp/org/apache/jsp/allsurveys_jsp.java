package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import pl.mkrause.javaee.service.SurveyService;
import pl.mkrause.javaee.service.FormService;
import pl.mkrause.javaee.domain.Form;
import java.util.Map;

public final class allsurveys_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      pl.mkrause.javaee.service.FormService formService = null;
      synchronized (application) {
        formService = (pl.mkrause.javaee.service.FormService) _jspx_page_context.getAttribute("formService", PageContext.APPLICATION_SCOPE);
        if (formService == null){
          try {
            formService = (pl.mkrause.javaee.service.FormService) java.beans.Beans.instantiate(this.getClass().getClassLoader(), "pl.mkrause.javaee.service.FormService");
          } catch (ClassNotFoundException exc) {
            throw new InstantiationException(exc.getMessage());
          } catch (Exception exc) {
            throw new ServletException("Cannot create bean of class " + "pl.mkrause.javaee.service.FormService", exc);
          }
          _jspx_page_context.setAttribute("formService", formService, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      pl.mkrause.javaee.service.SurveyService db = null;
      synchronized (session) {
        db = (pl.mkrause.javaee.service.SurveyService) _jspx_page_context.getAttribute("db", PageContext.SESSION_SCOPE);
        if (db == null){
          db = new pl.mkrause.javaee.service.SurveyService();
          _jspx_page_context.setAttribute("db", db, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\t<title>Sklep</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("        <h1>Wszystkie ankiety</h1>\r\n");
      out.write("        ");

            if (db!=null)
            for(Form f : db.getAllForms()){ 
      out.write("<p>");
out.println(f);}
      out.write("</p>");

        
      out.write("\r\n");
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
