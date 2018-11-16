<%@ page import="pl.mkrause.javaee.service.SurveyService" %>
<%@ page import="pl.mkrause.javaee.service.FormService" %>
<%@ page import="pl.mkrause.javaee.domain.Form" %>
<%@ page import="java.util.Map" %>

<jsp:useBean id="formService" class="pl.mkrause.javaee.service.FormService" scope="application" />
<jsp:useBean id="db" class="pl.mkrause.javaee.service.SurveyService" scope="session" />

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Sklep</title>
</head>
<body>
        <h1>Wszystkie ankiety</h1>
        <%
            if (db!=null)
            for(Form f : db.getAllForms()){ %><p><%out.println(f);}%></p><%
        %>
</body>
</html>