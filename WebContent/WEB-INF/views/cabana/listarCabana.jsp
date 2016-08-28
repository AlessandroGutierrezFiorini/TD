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
			<a href='<c:url value="/cabana/cargar"/>' class="btn btn-success">Nueva Cabaña</a>

			<div class="table-responsive" style="padding-top: 20px;">


				<table class="table table-condensed">
					<thead>
						<tr class="active">
							<td class="col-md-1">ID</td>
							<td class="col-md-1">Numero</td>
							<td class="col-md-1">Capacidad</td>
							<td class="col-md-1">Habitaciones</td>
							<td class="col-md-1">Camas</td>
							<td class="col-md-1">Piscina</td>
							<td class="col-md-1">Calefaccion</td>
							<td class="col-md-1">AireAcondicionado</td>
							<td class="col-md-1 ">Internet</td>
							<td class="col-md-1">Television</td>
							<td class="col-md-1">Cocina</td>
							<td class="col-md-1">Mascotas</td>
							<td class="col-md-1">Estacionamiento</td>
							<td class="col-md-1">Churrasquera</td>
							<td class="col-md-1">Imagen</td>
							<td class="col-md-1">Complejo</td>
							<td class="col-md-1"></td>


						</tr>
					</thead>
					<tbody class="block-center">
						<c:forEach items="${cabanas}" var="cabana">

							<tr class="success">
								<td class="col-md-1"><c:out value="${cabana.id}"></c:out></td>
								<td class="col-md-1"><c:out value="${cabana.numero}"></c:out></td>
								<td class="col-md-1"><c:out value="${cabana.capacidad}"></c:out></td>
								<td class="col-md-1"><c:out value="${cabana.habitaciones}"></c:out></td>
								<td class="col-md-1"><c:out value="${cabana.camas}"></c:out></td>
								<td class="col-md-1"><c:out value="${cabana.piscina}"></c:out></td>
								<td class="col-md-1"><c:out value="${cabana.calefaccion}"></c:out></td>
								<td class="col-md-1"><c:out
										value="${cabana.aireAcondicionado}"></c:out></td>
								<td class="col-md-1"><c:out value="${cabana.internet}"></c:out></td>
								<td class="col-md-1"><c:out value="${cabana.television}"></c:out></td>
								<td class="col-md-1"><c:out value="${cabana.cocina}"></c:out></td>
								<td class="col-md-1"><c:out value="${cabana.mascotas}"></c:out></td>
								<td class="col-md-1"><c:out value="${cabana.estacionamiento}"></c:out></td>
								<td class="col-md-1"><c:out value="${cabana.churrasquera}"></c:out></td>
								<td class="col-md-1"><c:out value="${cabana.complejo.nombre}"></c:out></td>
								<td class="col-md-1">
								<a type="button" class="btn btn-primary" href='<c:url value="/image/cabana/${cabana.id}" />'> 
									<span class="glyphicon glyphicon-picture" aria-hidden="true"></span></a> 
								<a type="button" class="btn btn-info" href='<c:url value="/cabana/update/${cabana.id}" />'> <span
										class="glyphicon glyphicon-pencil" aria-hidden="true"></span></a>
									<a type="button" class="btn btn-danger" href='<c:url value="/cabana/delete/${cabana.id}" />'> <span
										class="glyphicon glyphicon-trash" aria-hidden="true"></span></a></td>


							</tr>
						</c:forEach>

					</tbody>

				</table>
			</div>
		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>