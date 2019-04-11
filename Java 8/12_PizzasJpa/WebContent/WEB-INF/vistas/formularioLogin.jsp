<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
	<legend><h2 style="color:blue">Pizzería</h2></legend>
	<h3>Login</h3>
	
	<form action="loginUsuario" method="post">
		Nombre: <input type="text" name="nombre">
		Password: <input type="password" name="password">
		<input type="submit" value="Login">
	</form>
	</fieldset>
	
</body>
</html>