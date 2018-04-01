<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="menu.jsp"></jsp:include>
<form   action="ServletGuardarCambiosClientes" method="post">
		
		<!--	//public static final String REGISTRAR_CLIENTE = "insert into tabla_clientes(nombre, apellidos, direccion, numero, poblacion, cp, email, ep) "      -->
		
		
		<br/>		
		Nombre 
		<div>
			<input name="campoNombre"  type="text" value="${editar.nombre}"/> 
		</div> 
		Apellidos 
		<div>
			<input name="campoApellidos"  type="text" value="${editar.apellidos}"/> 
		</div>  
		Dirección 
		<div>
			<input  name="campoDireccion"  type="text"  value="${editar.direccion}"/> 
		</div> 				
		Número 
		<div>
			<input name="campoNumero"  type="text"  value="${editar.numero}"/> 
		</div> 				
		Población 
		<div>
			<input name="campoPoblacion"  type="text" value="${editar.poblacion}"/> 
		</div> 			
		Código Postal 
		<div>
			<input name="campoCp"  type="text" value="${editar.cp}"/> 
		</div>						
		Email 
		<div>
			<input name="campoEmail"  type="text" value="${editar.email}"/> 
		</div>	
		Empresa / Particular 
		<div>
			<input name="campoEP"  type="text" value="${editar.ep}"/> 
		</div>	
		<input type ="hidden" name="campoId" value="${editar.id}"/>
		
				<input type="submit" value="Registrar" />
		</form>	



</body>
</html>