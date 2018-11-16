<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>rodo</title>
</head>
<body>
	<form action="sklep" method="post">
		Imię:
		<br>
		<input type="text" id="name" name="name" required="required">
		<br>
		Nazwisko:
		<br>
		<input type="text" id="surname" name="surname" required="required">
		<br>
   	 	Zgadzam się na przetwarzanie danych osobowych przez firmę rybną w celach handlowych.
   	 	<br>
    	<input type="checkbox" name="rodo" required="required">
    	<br>
    	Zgadzam się także na przesyłanie do mnie e-maili.
    	<br>
    	<input type="checkbox" name="email" required="required">
    	<br>
    	<input type="submit" value="submit">
	</form>
</body>
</html>