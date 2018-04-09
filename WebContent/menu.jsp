<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet" href="css/style.css">


<c:if test="${sessionScope.identificado == null}"> 

<ul id="menu-bar">
 <li class="active"><a href="ServletIdentificacionAdmin">Login</a></li>
<li><a href="login.jsp">Login</a></li>
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
 <li><a href="ServletListadoUsuarios">Contacto Usuarios</a></li>
 <li><a href="ServletLogOut">LogOut</a></li>
</ul>
</c:if>



