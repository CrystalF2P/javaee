<%@ page import="pl.mkrause.javaee.domain.Fish" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="fishService" class="pl.mkrause.javaee.service.FishService" scope="application" />
<jsp:useBean id="db" class="pl.mkrause.javaee.service.Storage" scope="session" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Dodano do Twojego koszyka</title>
</head>
<body>

<% 
	db.add(fishService.getFish(Integer.valueOf(request.getParameter("id"))));
	fishService.removeFish(Integer.valueOf(request.getParameter("id")));
%>

<p>Ryba zostala dodana: </p>
  <a href="sklep.jsp">Powrót na stronę główną</a>
</p>
</body>
</html>