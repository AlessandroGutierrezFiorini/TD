<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>


<tiles:insertDefinition name="formCabana">
	<tiles:putAttribute name="body">


		<form:form action="${pageContext.request.contextPath}/cabana/guardar"
			method="POST" class="container" commandName="formCabana">

			<fieldset>
				<legend>Update Cabana</legend>

				<form:input path="id" type="hidden" value="" class="form-control" />
				<label class="control-label" for="numero">Numero:</label>
				<form:input path="numero" type="text" value="" class="form-control" />
				<label class="control-label" for="capacidad">Capacidad:</label>
				<form:input path="capacidad" type="text" value=""
					class="form-control" />
				<label class="control-label" for="habitaciones">Habitaciones:</label>
				<form:input path="habitaciones" type="text" value=""
					class="form-control" />
				<label class="control-label" for="mail">Camas:</label>
				<form:input path="camas" type="text" value="" class="form-control" />
				<label class="control-label" for="mail">piscina</label>
				<form:input path="piscina" type="text" value="" class="form-control" />
				<label class="control-label" for="mail">calefaccion</label>
				<form:input path="calefaccion" type="text" value=""
					class="form-control" />
				<label class="control-label" for="mail">aireAcondicionado</label>
				<form:input path="aireAcondicionado" type="text" value=""
					class="form-control" />
				<label class="control-label" for="mail">internet</label>
				<form:input path="internet" type="text" value=""
					class="form-control" />
				<label class="control-label" for="mail">television</label>
				<form:input path="television" type="text" value=""
					class="form-control" />
				<label class="control-label" for="mail">cocina</label>
				<form:input path="cocina" type="text" value="" class="form-control" />
				<label class="control-label" for="mail">mascotas</label>
				<form:input path="mascotas" type="text" value=""
					class="form-control" />
				<label class="control-label" for="mail">estacionamiento</label>
				<form:input path="estacionamiento" type="text" value=""
					class="form-control" />
				<label class="control-label" for="mail">churrasquera</label>
				<form:input path="churrasquera" type="text" value=""
					class="form-control" />
				<label class="control-label" for="usuario">Imagen:</label>

				<form:select cssClass="form-control" path="imagen.id"
					items="${imagenes}" var="imagen" itemLabel="src" itemValue="id"
					id="imagen" />
				<label class="control-label" for="usuario">Complejo:</label>

				<form:select cssClass="form-control" path="complejo.id"
					items="${complejos}" var="complejo" itemLabel="nombre"
					itemValue="id" id="complejo" />

				<div class="row text-center">
					<input class="btn btn-primary form-group" type="submit"
						value="Guardar" />
				</div>
			</fieldset>
		</form:form>

	</tiles:putAttribute>
</tiles:insertDefinition>