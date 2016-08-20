<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
<body>

	
<table class="table table-responsive">
	<thead>
		<tr>
			<td>ID</td>
			<td>Email</td>
			<td>Estado</td>
		</tr>
	</thead>
		<tbody>
		<c:forEach items="${usuarios}" var="usuario">
		<c:if test="${usuario.estado == 1}">
		<tr class="success">
			<td><c:out value="${usuario.id}"></c:out></td>
			<td><c:out value="${usuario.email}"></c:out></td>
			<td><c:out value="Alta"></c:out></td>			
			</tr>
		</c:if>
		
		
			<c:if test="${usuario.estado == 0}">
		<tr class="danger">
			<td><c:out value="${usuario.id}"></c:out></td>
			<td><c:out value="${usuario.email}"></c:out></td>
			<td><c:out value="Baja"></c:out></td>			
			</tr>
		</c:if>
		</c:forEach>
			
		</tbody>

	</table>	

	<script type="js/jquery-1.12.1.min.js"></script>
	<script type="js/bootstrap.min.js"></script>
</body>
</html>