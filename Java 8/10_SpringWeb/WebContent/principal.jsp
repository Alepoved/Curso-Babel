<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <%
 	String nombre = (String)session.getAttribute("nombre");
 %>
 
 <%=nombre%>
 
 <h1>${nombre}</h1>
 
 <p align="center">
 	<font color="red">
 		<a href="ScopeServlet">Pulsa para recargar</a>
 	</font>
 </p>
 
 <table>
 	<tr>
 		<td>Singleton</td>
 		<td>${msgSingleton}</td>
 	</tr>	
 		<td>Prototipo 1</td>
 		<td>${msgPrototype1}</td>
 	<tr>	
 		<td>Prototipo 2</td>
 		<td>${msgPrototype2}</td>
 	</tr>	
 		<td>Request 1</td>
 		<td>${msgRequest1}</td>
 	<tr>
 		<td>Request 2</td>
 		<td>${msgRequest2}</td>
 	</tr>
 	<tr>
 		<td>Session 1</td>
 		<td>${msgSession}</td>
 	</tr>
 </table>
 
</body>
</html>