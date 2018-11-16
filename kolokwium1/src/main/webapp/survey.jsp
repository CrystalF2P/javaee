<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>rodo</title>
</head>
<body>
	<form action="survey" method="post">
		Data kupienia ryby:
		<br>
		<input type="text" id="datakupienia" name="datakupienia" required="required">
		<br>
		Data zjedzenia ryby:
		<br>
		<input type="text" id="datazjedzenia" name="datazjedzenia">
		<br>
   	 	Jak często je Pan/Pani nasze ryby?
   	 	<br>
    	<input type="radio" name="czestosc" value="codziennie">Codziennie<br>
    	<input type="radio" name="czestosc" value="tygodniowo">Raz w tygodniu<br>
    	<input type="radio" name="czestosc" value="rzadziej">Rzadziej niż raz w tygodniu<br>
    	<br>
    	Zgłaszane uwagi:
    	<br>
    	<input type="checkbox" name="nieswieza" value="nieswieza"> Ryba była nieświeża
    	<input type="checkbox" name="niesmaczna" value="niesmaczna"> Ryba była niesmaczna
    	<input type="checkbox" name="cena" value="cena"> Ryba jest zbyt droga
    	<br>
    	<input type="submit" value="submit">
	</form>
</body>
</html>