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
	<legend><h1 sytle="color:blue">Pide tu pizza</h1></legend>
	
	<h2>Usuario: ${nombre}</h2>
	
	<form action="realizarPedido" method="post">
	
	Direccion entrega:<input type="text" name="direccion" placeholder="calle falsa" required>
	
	<h3>Tamaño de la pizza</h3>
	<input type="radio" name="tamaño" value="pequeño" checked>Pequeño(5 euros)
	<input type="radio" name="tamaño" value="mediano">Mediano(10 euros)
	<input type="radio" name="tamaño" value="grande">Grande(15 euros)
	
	<h3>Ingredientes extra:</h3>(2 euros cada ingrediente)<br>
	<input type="checkbox" name="ingredientes" value="bacon"> Bacon<br>
	<input type="checkbox" name="ingredientes" value="mozzarella"> Mozzarella<br>
	<input type="checkbox" name="ingredientes" value="cebolla"> Cebolla<br>
	<input type="checkbox" name="ingredientes" value="salsa barbacoa"> Salsa barbacoa<br>
	<input type="submit" value="Realizar pedido">
	</fieldset>
	</form>
	
	<a href="formularioLogin">Log out</a>
	
	
	
</body>
</html>