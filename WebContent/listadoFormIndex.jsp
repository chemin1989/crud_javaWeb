<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/botones.css">
<link rel="stylesheet" href="css/tabla.css">

<title>Listado usuarios</title>
<jsp:include page="menu.jsp"></jsp:include>
</head>
<body>

	<table id="t01">
		<c:forEach items="${usuarios}" var="user">
			<tr>
				<th>Nombre</th>
				<th>Email</th>
				<th>Comentario</th>	
			</tr>
			<tr>
				<td>${user.nombre}</td>
				<td>${user.email}</td>
				<td>${user.comentario}</td>
			</tr>
			<table />
		</c:forEach>
</body>
</html>