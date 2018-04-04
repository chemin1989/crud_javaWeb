<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include><br/>

		<div>
		<h1><a>Registro Ropa</a></h1>
		</div>
		<form action="ServletRegistroRopa" method="post" enctype="multipart/form-data">				
		Marca 
		<div>
			<input name="campoMarca"  type="text" value=""/> 
		</div> 
		Pais 
		<div>
			<input name="campoPais"  type="text" value=""/> 
		</div>  
		Modelo 
		<div>
			<input  name="campoModelo"  type="text"  value=""/> 
		</div> 				
		Coste 
		<div>
			<input name="campoCoste"  type="text"  value=""/> 
		</div> 				
		Talla 
		<div>
			<input name="campoTalla"  type="text" value=""/> 
		</div> 			
		Color 
		<div>
			<input name="campoColor"  type="text" value=""/> 
		</div>						
		Descipcion
		<div>
			<textarea name="campoDescripcion" ></textarea> 
		</div>  
		Imagen
		<div>
			<input type="file" name="campoImagen"/>
		</div>   
				<input type="submit" value="Registrar" />		
		</form>					
</body>
</html>