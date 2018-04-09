<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/botones.css">
<link rel="stylesheet" href="css/tabla.css">

<title>Listado ropa</title>
<jsp:include page="menu.jsp"></jsp:include>
</head>
<body>
	<table id="t01">
		<c:forEach items="${ropa}" var="prendas">
			<tr>
				<th>Marca</th>
				<th>Modelo</th>
				<th>País</th>
				<th>Coste</th>
				<th>Talla</th>
				<th>Color</th>
				<th>E/P</th>
			</tr>
			<tr>
				<td>${prendas.marca}</td>
				<td>${prendas.modelo}</td>
				<td>${prendas.pais}</td>
				<td>${prendas.coste}</td>
				<td>${prendas.talla}</td>
				<td>${prendas.color}</td>
				<td>${prendas.descripcion}</td>
				<td><img src="${producto.rutaImagen}" height="35"></td>
				<td><a class="botones"
					href="ServletBorrarRopa?id=${prendas.id}">BORRAR</a></td>
				<td><a class="botones"
					href="ServletEditarRopa?id=${prendas.id}">EDITAR</a></td>
			</tr>
			<table />
		</c:forEach>
</body>
</html>
















