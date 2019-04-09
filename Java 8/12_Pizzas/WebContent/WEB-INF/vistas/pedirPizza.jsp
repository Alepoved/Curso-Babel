<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Pide tu pizza :)</h1>
	
	<h2>Usuario: ${nombre}</h2>
	
	<form action="realizarPedido" method="post">
	Direccion entrega:<input type="text" name="direccion">
	
	<h3>Tamaño de la pizza</h3>
	<input type="radio" name="tamaño" value="pequeño">Pequeño
	<input type="radio" name="tamaño" value="mediano">Mediano
	<input type="radio" name="tamaño" value="grande">Grande
	
	<h3>Ingredientes extra:</h3>
	<input type="checkbox" name="ingredientes" value="bacon"> Bacon<br>
	<input type="checkbox" name="ingredientes" value="mozzarella"> Mozzarella<br>
	<input type="checkbox" name="ingredientes" value="cebolla"> Cebolla<br>
	<input type="checkbox" name="ingredientes" value="lagrimas de bebe"> Lagrimas de bebe<br>
	<input type="submit" value="Realizar pedido">
	
	</form>
	
	
</body>
</html>