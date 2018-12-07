<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%
    if(session.getAttribute("rodo")==null) {
        response.sendRedirect("errRodo.jsp");
    } else {
        response.sendRedirect("sklep.jsp");
    }%>
    </body>
</html>
