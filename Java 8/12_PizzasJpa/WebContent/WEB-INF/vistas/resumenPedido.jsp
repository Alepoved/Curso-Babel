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
	<legend><h1>Resumen del Pedido</h1></legend>
	
	<h2>Usuario: ${nombre}</h2>
	<h2>Direccion entrega: ${direccion}</h2>
	
	<h3>Tamaño de la pizza: ${tamaño}</h3>
	
	<h3>Ingredientes extra: ${ingredientes}</h3>
	
	<h1 style="color:red">Precio total: ${precio}</h1>
	</fieldset>
	<a href="pedirPizza">Atras</a>
	
</body>
</html>