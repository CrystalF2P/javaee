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

<jsp:useBean id="surveyservice" class="pl.mkrause.javaee.service.SurveyService" scope="application" />
<%
  for (Form form : SurveyService.getAllForms()) {
	  out.println("<p>Gatunek: " + fish.getGatunek() + "Waga: " + fish.getWaga() + "; Data Zlowienia: " + fish.getDataZlowienia() + "</p>");
  }
%>
<p>
  <a href="getFishData.jsp">Dodaj kolejna rybe</a>
</p>

</body>
</html>