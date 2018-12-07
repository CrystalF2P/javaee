<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="storage" class="pl.mkrause.javaee.service.Storage" scope="application" />
<jsp:useBean id="fish" class="pl.mkrause.javaee.domain.Fish" scope="session" />

<form action="addFish.jsp">
  
  Gatunek :<input type="text" name="gatunek" value="${fish.gatunek}" /><br />
  Waga :<input type="number" name="waga" value="${fish.waga}" /><br />
  Data zlowienia :<input type="text"  name="dataZlowienia" value="${fish.dataZlowienia}" /><br />
  <input type="submit" value=" OK ">
  
</form>

</body>
</html>