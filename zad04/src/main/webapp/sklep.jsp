<%@ page import="pl.mkrause.javaee.service.FishService" %>
<%@ page import="pl.mkrause.javaee.service.Storage" %>
<%@ page import="pl.mkrause.javaee.domain.Fish" %>
<%@ page import="java.util.Map" %>

<jsp:useBean id="fishService" class="pl.mkrause.javaee.service.FishService" scope="application" />
<jsp:useBean id="db" class="pl.mkrause.javaee.service.Storage" scope="session" />

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
    if(session.getAttribute("rodo")==null) {
        response.sendRedirect("errRodo.jsp");
    }
%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Sklep</title>
</head>
<body>
	<jsp:useBean id="guestsession" class="pl.mkrause.javaee.domain.Guest" scope="session"/>
	<h1>Witaj w naszym sklepie rybnym ${guestsession.name} ${guestsession.surname}!</h1>
	<p>Lista ryb:</p>
	
	<%
        for(Map.Entry<Integer, Fish> entry : fishService.getMap().entrySet()) {
    %>
        <form action="addFish.jsp" method="post">
        <p>
        	<%out.println(entry.getValue());%>
        	<input type="hidden" name="id" value="<%out.print(entry.getKey());%>">
        	<input type="submit" value="Dodaj do koszyka">
        </p>
        </form>
    <%
    }
        %>
        <h3>Koszyk</h3>
        <%
            if (db!=null)
            for(Fish f : db.getAllFish()){ %><p><%out.println(f);}%></p><%
        %>
</body>
</html>