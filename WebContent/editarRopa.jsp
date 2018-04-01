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
<form   action="ServletGuardarCambiosRopa" method="post">
		
		<br/>		
		Marca 
		<div>
			<input name="campoMarca"  type="text" value="${editar.marca}"/> 
		</div> 
		Pais 
		<div>
			<input name="campoPais"  type="text" value="${editar.pais}"/> 
		</div>  
		Modelo 
		<div>
			<input  name="campoModelo"  type="text"  value="${editar.modelo}"/> 
		</div> 				
		Coste 
		<div>
			<input name="campoCoste"  type="text"  value="${editar.coste}"/> 
		</div> 				
		Talla 
		<div>
			<input name="campoTalla"  type="text" value="${editar.talla}"/> 
		</div> 			
		Color 
		<div>
			<input name="campoColor"  type="text" value="${editar.color}"/> 
		</div>						
		Descipcion
		<div>
			<textarea name="campoDescripcion" value="${editar.descripcion}" ></textarea> 
		
		<input type ="hidden" name="campoId" value="${editar.id}"/>
		</div>    
				<input type="submit" value="Registrar" />
		</form>	



</body>
</html>