<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Turismo Digital</title>
	<link rel="stylesheet" type="text/css" href='<c:url value="/resources/css/bootstrap.min.css"></c:url>'>
	<link rel="stylesheet" type="text/css" href='<c:url value="/resources/css/estilos.css"></c:url>'> 
	
</head>
<body class="index">

<div class="row ">
	
	<div class="container-left col-md-6"> 
		<a href="ListarCabanias.html" class="btn btn-primary btn-lg sharp btn-izq">Lugares</a>		
	</div>
	

	<div class="container-right col-md-6"> 
		<a href="ListarLugares.html" class="btn btn-primary btn-lg sharp btn-der">Alojamientos</a>	
	</div>

</div>
	

	<script type="js/jquery-1.12.1.min.js"></script>
	<script type="js/bootstrap.min.js"></script>
</body>
</html>