<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
	
	
	<div class="container" style="padding-top:20px;">
		
		<div style="padding-bottom:10px;">
			<a href='<c:url value="/usuario/mostrar"/>' class="btn btn-success">Nuevo Usuario</a>
		</div>
		
		<c:if test="${not empty resultado}">
			<div class="alert alert-success alert-dismissible" role="alert">
				<button type="button" class="close" data-dismiss="alert"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<strong>OK!</strong>
				<c:out value="${resultado}" />
			</div>
		</c:if>
		<div class="table-responsive" style="padding-top:20px;">
	
			<table class="table table-condensed">
				<thead>
					<tr>
						<td class="col-md-1">ID</td>
						<td class="col-md-3">Email</td>
						<td class="col-md-1">Rol</td>
						<td class="col-md-1">Estado</td>
						<td class="col-md-1"></td>
					</tr>
				</thead>
				<tbody class="block-center">
					<c:forEach items="${usuarios}" var="usuario">
						<c:if test="${usuario.estado == 1}">
								<tr class="success">
									<td class="col-md-1"><c:out value="${usuario.id}"></c:out></td>
									<td class="col-md-2"><c:out value="${usuario.email}"></c:out></td>
									<td class="col-md-1"><c:out value="${usuario.rol}"></c:out></td>
									
									<td class="col-md-1"><c:out value="Alta"></c:out></td>
									<td class="col-md-1"><a type="button"
										class="btn btn-warning"
										href='<c:url value="/usuario/disable/${usuario.id}" />'> <span
											class="glyphicon glyphicon-minus" aria-hidden="true"></span></a>
										<a type="button" class="btn btn-info"
										href='<c:url value="/usuario/update/${usuario.id}" />'> <span
											class="glyphicon glyphicon-pencil" aria-hidden="true"></span></a>
										<a type="button" class="btn btn-danger"
										href='<c:url value="/usuario/delete/${usuario.id}" />'> <span
											class="glyphicon glyphicon-trash" aria-hidden="true"></span></a></td>


								</tr>
							</c:if>

						<c:if test="${usuario.estado == 0}">
							<tr class="danger">
								<td class="col-md-1"><c:out value="${usuario.id}"></c:out></td>
								<td class="col-md-2"><c:out value="${usuario.email}"></c:out></td>
								<td class="col-md-1"><c:out value="${usuario.rol}"></c:out></td>
								<td class="col-md-1"><c:out value="Baja"></c:out></td>
								<td class="col-md-1"><a type="button"
									class="btn btn-success"
									href='<c:url value="/usuario/enable/${usuario.id}" />'> <span
										class="glyphicon glyphicon-plus" aria-hidden="true"></span></a> <a
									type="button" class="btn btn-info"
									href='<c:url value="/usuario/update/${usuario.id}" />'> <span
										class="glyphicon glyphicon-pencil" aria-hidden="true"></span></a>
									<a type="button" class="btn btn-danger"
									href='<c:url value="/usuario/delete/${usuario.id}" />'> <span
										class="glyphicon glyphicon-trash" aria-hidden="true"></span></a></td>

							</tr>
						</c:if>
					</c:forEach>
				</tbody>

	</table>
</div>
</div>
	</tiles:putAttribute>
</tiles:insertDefinition>
	

