<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<title>Produto</title>
</head>
<body>

<table border="1">
	<tr>
		<td>Descrição</td>
		<td>Preço</td>
	</tr>
	
	<c:forEach var="atual" items="${lista}">
		<tr>
			<td>${atual.descricao}</td>
			<td>${atual.preco}</td>
		</tr>
	</c:forEach>
</table>

</body>
</html>