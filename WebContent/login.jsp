<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/style1.css" media="all">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<jsp:include page="menu.jsp"></jsp:include><br/>
	<div "style=color:red" >&nbsp;${mensaje}</div>
	<div style="text-align:center;">
<form class="form-container" method="post" action="ServletIdentificacionAdmin">
	<div class="form-title"><h2>Identificate</h2></div>
	<div class="form-title">Usuario</div>
		<input class="form-field" type="text" name="campoUsuario" /><br />
	<div class="form-title">Contrase�a</div>
		<input class="form-field" type="password" name="campoContrase�a" /><br />
	<div class="submit-container">
		<input class="submit-button" type="submit" value="Submit" />
	</div>
</form>
	</div>	
	
</html>
	
	
	
	
	
	
