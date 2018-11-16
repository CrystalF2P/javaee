<%@ page import="pl.mkrause.javaee.domain.Form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="formService" class="pl.mkrause.javaee.service.FormService" scope="application" />
<jsp:useBean id="db" class="pl.mkrause.javaee.service.SurveyService" scope="session" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Dodano ankietę</title>
</head>
<body>

<% 
	db.add(formService.getForm(Integer.valueOf(request.getParameter("id"))));
	formService.removeForm(Integer.valueOf(request.getParameter("id")));
%>

<p>Twoja ankieta została dodana: </p>
  <a href="err.jsp">Powrót na stronę główną</a>
</p>
</body>
</html>