<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
	<div class="container-fluid" style="padding-top:20px;">
		<a href='<c:url value="/complejo/mostrar"/>' class="btn btn-success">Nuevo Complejo</a>
	
	
	<div class="table-responsive" style="padding-top:20px;">
	
	
	<table class="table table-condensed">
				<thead>
					<tr class="active">
						<td class="col-md-2">Nombre</td>
						<td class="col-md-1">Direccion</td>
						<td class="col-md-1">Telefono</td>
						<td class="col-md-1">Movil</td>
						<td class="col-md-2">Email</td>
						<td class="col-md-1">Latitud</td>
						<td class="col-md-1">Longitud</td>
						<td class="col-md-3">Acciones</td>
					</tr>
				</thead>
				<tbody class="block-center">
					<c:forEach items="${complejos}" var="complejo">

						<tr class="success">
							<td class="col-md-2"><c:out value="${complejo.nombre}"></c:out></td>
							<td class="col-md-1"><c:out value="${complejo.direccion}"></c:out></td>
							<td class="col-md-1"><c:out value="${complejo.telefono}"></c:out></td>
							<td class="col-md-1"><c:out value="${complejo.movil}"></c:out></td>
							<td class="col-md-2"><c:out value="${complejo.email}"></c:out></td>
							<td class="col-md-1"><c:out value="${complejo.latitud}"></c:out></td>
							<td class="col-md-1"><c:out value="${complejo.longitud}"></c:out></td>

							<td class="col-md-3">
							<a type="button" class="btn btn-primary" href='<c:url value="/image/complejo/${complejo.id}" />'> 
							<span class="glyphicon glyphicon-picture" aria-hidden="true"></span></a> 
							<a type="button" class="btn btn-warning" href='<c:url value="/cabana/listar" />'> 
							<span class="glyphicon glyphicon-home" aria-hidden="true"></span></a> 
							<a type="button" class="btn btn-info" href='<c:url value="/complejo/update/${complejo.id}" />'> 
							<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span></a> 
							<a type="button" class="btn btn-danger" href='<c:url value="/complejo/delete/${complejo.id}" />'> 
							<span class="glyphicon glyphicon-trash" aria-hidden="true"></span></a></td>



						</tr>
					</c:forEach>

				</tbody>

			</table>
		</div>
	</div>
	</tiles:putAttribute>
</tiles:insertDefinition>