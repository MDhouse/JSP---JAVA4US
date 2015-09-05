<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JAVA 4 US!</title>
</head>
<body>

<h1>Zgloszenie na konferencje</h1>

<form action="Formularz" method="get">
<table>
<tr><td>Imie:</td><td><input type="text" name ="firstName"/></td></tr>
<tr><td>Nazwisko:</td><td><input type="text" name ="lastName"/></td></tr>
<tr><td>Email:</td><td><input type="email" name="email"/></td></tr>
<tr><td>Potwierdz email:</td><td><input type="email" name="emailAuthenticate"/></td></tr>
<tr><td>Nazwa pracodawcy:</td><td><input type="text" name="superior"/></td></tr>
<tr><td>Skad dowiedziales sie o konferencji:</td></tr>
<tr><td></td><td><input name="info" type="radio" value="1"/> Ogloszenie w pracy</td></tr>
<tr><td></td><td><input name="info" type="radio" value="2"/> Ogloszenie na uczelni</td></tr>
<tr><td></td><td><input name="info" type="radio" value="3"/> Facbook</td></tr>
<tr><td></td><td><input name="info" type="radio" value="4"/> Znajomi</td></tr>
<tr><td></td><td><input name="info" type="radio" value="5" onclick="this.form.elements['info'].disabled = !this.checked"/> Inne(Jakie?)</td><td><input type="text" name="inne" disabled="disabled"/></td></tr>
<tr><td>Czym sie zajmujesz:</td><td><input type="text" name="text"/></td></tr>

</table>

	
	<input type="submit" value="Wyslij">

</form>
</body>
</html>