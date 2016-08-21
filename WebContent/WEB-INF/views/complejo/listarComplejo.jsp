<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Turismo Digital</title>
<link rel="stylesheet" type="text/css"
	href='<c:url value="/resources/css/bootstrap.min.css"></c:url>'>
<link rel="stylesheet" type="text/css"
	href='<c:url value="/resources/css/estilos.css"></c:url>'>

</head>
<body>
<div class="container table-responsive">
	
	<table class="table ">
		<thead>
			<tr>
				<td class="col-md-1">ID</td>
				<td class="col-md-1">Nombre</td>
				<td class="col-md-1">Direccion</td>
				<td class="col-md-1">Telefono</td>
				<td class="col-md-1">Movil</td>
				<td class="col-md-1">Email</td>
				<td class="col-md-1">Latitud</td>
				<td class="col-md-1">Longitud</td>
				<td class="col-md-1"></td>
				
				
			</tr>
		</thead>
		<tbody class="block-center">
			<c:forEach items="${complejos}" var="complejo">

					<tr class="success">
						<td class="col-md-1"><c:out value="${complejo.id}"></c:out></td>
						<td class="col-md-3"><c:out value="${complejo.nombre}"></c:out></td>
						<td class="col-md-3"><c:out value="${complejo.direccion}"></c:out></td>
						<td class="col-md-3"><c:out value="${complejo.telefono}"></c:out></td>
						<td class="col-md-3"><c:out value="${complejo.movil}"></c:out></td>
						<td class="col-md-3"><c:out value="${complejo.email}"></c:out></td>
						<td class="col-md-3"><c:out value="${complejo.latitud}"></c:out></td>
						<td class="col-md-3"><c:out value="${complejo.longitud}"></c:out></td>
						
						<td class="col-md-1">
						<a type="button" class="btn btn-info" href='<c:url value="/complejo/update/${complejo.id}" />'> <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span></a>			
						<a type="button" class="btn btn-danger" href='<c:url value="/complejo/delete/${complejo.id}" />'> <span class="glyphicon glyphicon-trash" aria-hidden="true"></span></a>
						</td>
						
			
					</tr>
				</c:forEach>

		</tbody>

	</table>
</div>

	<script type="js/jquery-1.12.1.min.js"></script>
	<script type="js/bootstrap.min.js"></script>
</body>
</html>