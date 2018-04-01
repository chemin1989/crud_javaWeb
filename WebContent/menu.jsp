<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet" href="css/style.css">


<c:if test="${sessionScope.identificado == null}"> 

<ul id="menu-bar">
 <li class="active"><a href="ServletIdentificacionAdmin">Login</a></li>
<li><a href="#">Contacto</a></li>
 <li><a href="#">Ayuda</a></li>
</ul>
</c:if>
<c:if test="${sessionScope.identificado != null}">
 <ul id="menu-bar">
 <li><a>Clientes</a>
  <ul>
   <li><a href="registrarClientes.jsp">Registrar Clientes</a></li>
   <li><a href="ServletListadoClientes">Listar Clientes</a></li>
   
  </ul>
 </li>
 <li><a>Productos</a>
  <ul>
   <li><a href="registroRopa.jsp">Reguistrar Ropa</a></li>
   <li><a href="ServletListadoRopa">Listar Ropa</a></li>
  </ul>
 </li> 
 <li><a href="#">Contacto</a></li>
 <li><a href="#">Ayuda</a></li>
 <li><a href="ServletLogOut">LogOut</a></li>
</ul>
</c:if>




<!-- <div id="header"> -->
<!-- 	<ul class="nav"> -->
<%-- 		<c:if test="${sessionScope.identificado == null}"> --%>
<!-- 			<li><a href="ServletIdentificacionAdmin">LOGIN</a></li> -->
<!-- 			<li><a href="">Ayuda</a></li> -->
<%-- 		</c:if> --%>
<%-- 		<c:if test="${sessionScope.identificado != null}"> --%>
<!-- 			<li><a>Clientes</a> -->
<!-- 				<ul> -->
<!-- 					<li><a href="ServletListadoClientes">Listar Clientes</a></li> -->
<!-- 					<li><a href="ServletResgistroClientes">Agregar Clientes</a></li> -->
<!-- 				</ul></li> -->
<!-- 			<li><a>Ropa</a> -->
<!-- 				<ul> -->
<!-- 					<li><a href="ServletListadoRopa">Listar Ropa</a></li> -->
<!-- 					<li><a href="registroRopa.jsp">Agregar Ropa</a></li> -->
<!-- 				</ul></li> -->
<!-- 			<li><a href="ServletLogOut">Log OUT</a></li> -->
<%-- 		</c:if> --%>
<!-- 	</ul> -->
<!-- </div> -->
<!-- <br/> -->
<!-- <br/> -->