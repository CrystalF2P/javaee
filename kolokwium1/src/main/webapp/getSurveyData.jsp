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
<jsp:useBean id="form" class="pl.mkrause.javaee.domain.Form" scope="session" />

<form action="addForm.jsp">
  
  Data kupienia :<input type="text"  name="dataKupienia" value="${fish.dataKupienia}" /><br />
  Data zjedzenia :<input type="text"  name="dataKupienia" value="${fish.dataKupienia}" /><br />
  Gatunek :<input type="text" name="gatunek" value="${fish.gatunek}" /><br />
  Waga :<input type="number" name="waga" value="${fish.waga}" /><br />
  Data kupienia :<input type="text"  name="dataKupienia" value="${fish.dataKupienia}" /><br />
  <input type="submit" value=" OK ">
  
</form>

</body>
</html>