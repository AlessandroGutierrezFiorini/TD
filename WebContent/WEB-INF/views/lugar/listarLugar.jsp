<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div class="container-fluid" style="padding-top: 20px;">
			<div style="padding-bottom: 10px;">
				<a href='<c:url value="/lugar/cargar"/>' class="btn btn-success">Lugares</a>
			</div>

			<c:if test="${not empty resultado}">
				<div class="alert alert-danger alert-dismissible" role="alert">
					<button type="button" class="close" data-dismiss="alert"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<strong>OK!</strong>
					<c:out value="${resultado}" />
				</div>
			</c:if>

			<div class="table-responsive" style="padding-top: 20px;">
				<table class="table table-condensed">
					<thead>
						<tr class="active">
							<td class="col-md-2">Nombre</td>
							<td class="col-md-1">Descripcion</td>
							<td class="col-md-1">Latitud</td>
							<td class="col-md-1">Longitud</td>
							<td class="col-md-2">distancia</td>
							<td class="col-md-1"></td>
						</tr>
					</thead>
					<tbody class="block-center">
						<c:forEach items="${lugares}" var="lugar">

							<tr class="success">
								<td class="col-md-2"><c:out value="${lugar.nombre}"></c:out></td>
								<td class="col-md-1"><c:out value="${lugar.descripcion}"></c:out></td>
								<td class="col-md-1"><c:out value="${lugar.latitud}"></c:out></td>
								<td class="col-md-1"><c:out value="${lugar.longitud}"></c:out></td>
								<td class="col-md-1"><c:out value="${lugar.distancia}"></c:out></td>


								<td class="col-md-2">
								<a type="button" class="btn btn-primary" href='<c:url value="/image/lugar/${lugar.id}" />'> 
							<span class="glyphicon glyphicon-picture" aria-hidden="true"></span></a> 
								<a type="button" class="btn btn-warning" href='<c:url value="/lugar/listar" />'>
										<span class="glyphicon glyphicon-home" aria-hidden="true"></span>
								</a> <a type="button" class="btn btn-info"
									href='<c:url value="/lugar/update/${lugar.id}" />'> <span
										class="glyphicon glyphicon-pencil" aria-hidden="true"></span></a>
									<a type="button" class="btn btn-danger"
									href='<c:url value="/lugar/delete/${lugar.id}" />'> <span
										class="glyphicon glyphicon-trash" aria-hidden="true"></span></a></td>

							</tr>
						</c:forEach>

					</tbody>

				</table>
			</div>
		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>