<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="fish" class="pl.mkrause.javaee.domain.Fish" scope="session" />

<jsp:setProperty name="fish" property="*" /> 

<jsp:useBean id="storage" class="pl.mkrause.javaee.service.Storage" scope="application" />

<%-- Konwersja stringa na SimpleDateFormat --%>
<% 
  storage.add(fish);
%>

<p>Ryba zostala dodana: </p>
<p>Gatunek: ${fish.gatunek} </p>
<p>Waga: ${fish.waga} </p>
<p>Data zlowienia: ${fish.dataZlowienia} </p>
<%-- <p>Data zlowienia: <jsp:getProperty name="fish" property="dataZlowienia"></jsp:getProperty></p>
--%>
  <a href="showAllFish.jsp">Pokaz wszystkie ryby</a>
</p>
</body>
</html>