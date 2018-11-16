<%@page import="pl.mkrause.javaee.domain.Form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="storage" class="pl.mkrause.javaee.service.SurveyService" scope="application" />
<%
  for (Form form : storage.getAllForms()) {
	  out.println("<p>Data Kupienia:" + form.getDataKupienia() + "Data Zjedzenia:" + form.getDataZjedzenia() + "Czestosc:" + form.getCzestosc() + "Nieswieza?" + form.getNieswieza() + "Niesmaczna?" + form.getNiesmaczna() + "Cena?" + form.getCena() +"</p>");
  }
%>
<p>
  <a href="getSurveyData.jsp">Dodaj kolejną ankietę</a>
</p>

</body>
</html>