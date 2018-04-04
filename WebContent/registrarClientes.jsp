<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registro Clientes</title>
<link rel="stylesheet" type="text/css" href="css/style.css" media="all">


</head>
<body id="main_body" >
	<jsp:include page="menu.jsp"></jsp:include><br/>
	<img id="top" src="img/top.png" alt="">
	<div id="form_container">
	
		<h1><a>Registro Clientes</a></h1>
		
		<form id="form_2844" class="appnitro"  method="post" action="ServletRegistroClientes">
					<div class="form_description">
		
		</div>						
			<ul >
			
					<li id="li_1" >
		<label class="description" for="element_1">Nombre </label>
		<div>
			<input id="element_1" name="campoNombre" class="element text medium" type="text" maxlength="100" value=""/> 
		</div> 
		</li>		<li id="li_2" >
		<label class="description" for="element_2">Apellidos </label>
		<div>
			<input id="element_2" name="campoApellidos" class="element text medium" type="text" maxlength="100" value=""/> 
		</div> 
		</li>		<li id="li_3" >
		<label class="description" for="element_3">Dirección </label>
		<div>
			<input id="element_3" name="campoCalle" class="element text medium" type="text" maxlength="100" value=""/> 
		</div> 
		</li>		<li id="li_4" >
		<label class="description" for="element_4">Nº </label>
		<div>
			<input id="element_4" name="campoN" class="element text medium" type="text" maxlength="100" value=""/> 
		</div> 
		</li>		<li id="li_5" >
		<label class="description" for="element_5">Población </label>
		<div>
			<input id="element_5" name="campoPoblacion" class="element text medium" type="text" maxlength="100" value=""/> 
		</div> 
		</li>		<li id="li_6" >
		<label class="description" for="element_6">C.P </label>
		<div>
			<input id="element_6" name="campoCp" class="element text medium" type="text" maxlength="100" value=""/> 
		</div> 
		</li>		<li id="li_7" >
		<label class="description" for="element_7">Email </label>
		<div>
			<input id="element_7" name="campoEmail" class="element text medium" type="text" maxlength="100" value=""/> 
		</div> 
		</li>		<li id="li_8" >
		<label class="description" for="element_8">Empresa/Particular </label>
		<div>
		<select class="element select medium" id="element_8" name="campoEP"> 
			<option value="Particular" selected="selected"></option>
			<option value="Empresa" >Empresa</option>
			<option value="Particular" >Particular</option>
		</select>
		</div> 
		</li><br/>
		
		
			
					<li class="buttons">
			    <input type="hidden" name="form_id" value="2844" />
			    
				<input id="saveForm" class="button_text" type="submit" value="Submit" />
		</li>
			</ul>
		</form>	
		
	</div>
	<img id="bottom" src="img/bottom.png" alt="">
	</body>
</html>










<%-- <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %> --%>
<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1" --%>
<%--     pageEncoding="ISO-8859-1"%> --%>
<!-- <!DOCTYPE> -->
<!-- <html> -->
<!-- <head> -->
<!-- <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> -->
<!-- <title>Insert title here</title> -->
<!-- </head> -->
<!-- <body> -->
	
	
<!-- 		<div> -->
<!-- 		<h1><a>Registro Clientes</a></h1> -->
<!-- 		</div> -->
<!-- 		<form   action="ServletResgistroClientes" method="post"> -->
							
			
			
		
		
		
		
				
<!-- 		Nombre  -->
<!-- 		<div> -->
<!-- 			<input name="campoNombre"  type="text" value=""/>  -->
<!-- 		</div>  -->
<!-- 		Apellidos -->
<!-- 		<div> -->
<!-- 			<input name="campoApellidos"  type="text" value=""/>  -->
<!-- 		</div>   -->
<!-- 		Direccion -->
<!-- 		<div> -->
<!-- 			<input  name="campoCalle"  type="text"  value=""/>  -->
<!-- 		</div> 				 -->
<!-- 		Nº  -->
<!-- 		<div> -->
<!-- 			<input name="campoN"  type="text"  value=""/>  -->
<!-- 		</div> 				 -->
<!-- 		Poblacion  -->
<!-- 		<div> -->
<!-- 			<input name="campoPoblacion"  type="text" value=""/>  -->
<!-- 		</div> 			 -->
<!-- 		Codigo Postal  -->
<!-- 		<div> -->
<!-- 			<input name="campoCp"  type="text" value=""/>  -->
<!-- 		</div> -->
<!-- 		Email  -->
<!-- 		<div> -->
<!-- 			<input name="campoEmail"  type="text" value=""/>  -->
<!-- 		</div>	 -->
<!-- 		Empresa o Particular  -->
<!-- 		<div> -->
<!-- 			<input name="campoEP"  type="text" value=""/>  -->
<!-- 		</div>	 -->
						
		
		
			    
<!-- 				<input type="submit" value="Registrar" /> -->
	
			
<!-- 		</form>	 -->
	
	
				
<!-- </body> -->
<!-- </html> -->