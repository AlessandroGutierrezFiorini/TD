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
				<td class="col-md-3">Email</td>
				<td class="col-md-1">Estado</td>
				<td class="col-md-1"></td>
				
			</tr>
		</thead>
		<tbody class="block-center">
			<c:forEach items="${usuarios}" var="usuario">
				<c:if test="${usuario.estado == 1}">
					<tr class="success">
						<td class="col-md-1"><c:out value="${usuario.id}"></c:out></td>
						<td class="col-md-3"><c:out value="${usuario.email}"></c:out></td>
						<td class="col-md-1"><c:out value="Alta"></c:out></td>
						<td class="col-md-1">
						
						<a type="button" class="btn btn-warning" href='<c:url value="/usuario/disable/${usuario.id}" />'> <span class="glyphicon glyphicon-minus" aria-hidden="true"></span></a>
						<a type="button" class="btn btn-info" href='<c:url value="/usuario/update/${usuario.id}" />'> <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span></a>			
						<a type="button" class="btn btn-danger" href='<c:url value="/usuario/delete/${usuario.id}" />'> <span class="glyphicon glyphicon-trash" aria-hidden="true"></span></a></td>
						
			
					</tr>
				</c:if>
				
				<c:if test="${usuario.estado == 0}">
					<tr class="danger">
						<td class="col-md-1"><c:out value="${usuario.id}"></c:out></td>
						<td class="col-md-3"><c:out value="${usuario.email}"></c:out></td>
						<td class="col-md-1"><c:out value="Baja"></c:out></td>
						<td class="col-md-1">
						<a type="button" class="btn btn-success" href='<c:url value="/usuario/enable/${usuario.id}" />'> <span class="glyphicon glyphicon-plus" aria-hidden="true"></span></a>
						<a type="button" class="btn btn-info" href='<c:url value="/usuario/update/${usuario.id}" />'> <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span></a>			
						<a type="button" class="btn btn-danger" href='<c:url value="/usuario/delete/${usuario.id}" />'> <span class="glyphicon glyphicon-trash" aria-hidden="true"></span></a>
						</td>
					
						</tr>
				</c:if>
				</c:forEach>

		</tbody>

	</table>
</div>

	<script type="js/jquery-1.12.1.min.js"></script>
	<script type="js/bootstrap.min.js"></script>
</body>
</html>