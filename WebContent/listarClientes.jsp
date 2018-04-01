<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/botones.css">
<link rel="stylesheet" href="css/tabla.css">
</head>
<body>
<jsp:include page="menu.jsp"></jsp:include>
<h2>LISTADO CLIENTES</h2>


<table id="t01">
 <c:forEach items="${clientes}" var="cliente">
  <tr>
    <th>Nombre</th>
    <th>Apellidos</th> 
    <th>Direccion</th>
    <th>Numero</th>
    <th>Poblacion</th>
    <th>C.P</th>
    <th>Email</th>
    <th>E/P</th>
    
  </tr>
 
  <tr>
	    <td>${cliente.nombre}</td>
	    <td>${cliente.apellidos}</td>
	    <td>${cliente.direccion}</td>
	    <td>${cliente.numero}</td>
	    <td>${cliente.poblacion}</td>
	    <td>${cliente.cp}</td>
	    <td>${cliente.email}</td>
	    <td>${cliente.ep}</td>
	    <td><a class="botones" href="ServletBorrarClientes?id=${cliente.id}">BORRAR</a></td> 
	    <td><a class="botones" href="ServletEditarClientes?id=${cliente.id}">EDITAR</a></td>
     </tr>   
 <table/>	
 </c:forEach>
  

</body>
</html>
