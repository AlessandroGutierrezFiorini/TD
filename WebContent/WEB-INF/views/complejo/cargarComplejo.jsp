<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>


<tiles:insertDefinition name="formComplejo">
	<tiles:putAttribute name="body">

		<form:form
			action="${pageContext.request.contextPath}/complejo/guardar"
			method="POST" class="container" commandName="formComplejo">

			<fieldset>
				<legend>Cargar Complejo</legend>

				<form:input path="id" type="hidden" value="" class="form-control" />
				<label class="control-label" for="usuario">Usuario:</label>

				<form:select cssClass="form-control" path="usuario.id"
					items="${usuarios}" var="usuario" itemLabel="email" itemValue="id"
					id="usuario" />

				<label class="control-label" for="mail">Nombre</label>
				<form:input path="nombre" type="text" value="" class="form-control" />
				<label class="control-label" for="mail">Direccion</label>
				<form:input path="direccion" type="text" value=""
					class="form-control" />
				<label class="control-label" for="mail">Telefono:</label>
				<form:input path="telefono" type="text" value=""
					class="form-control" />
				<label class="control-label" for="mail">Movil:</label>
				<form:input path="movil" type="text" value="" class="form-control" />
				<label class="control-label" for="mail">Email:</label>
				<form:input path="email" type="text" value="" class="form-control" />
				<label class="control-label" for="mail">Lugar:</label>

				<form:select cssClass="form-control" path="lugar.id"
					items="${lugares}" var="lugar" itemLabel="nombre" itemValue="id"
					id="lugar" />

				<label class="control-label" for="mail">Latitud:</label>
				<form:input path="latitud" type="text" value="" class="form-control" />
				<label class="control-label" for="mail">Longitud:</label>
				<form:input path="longitud" type="text" value=""
					class="form-control" />

				<div class="row text-center">
					<input class="btn btn-primary form-group" type="submit"
						value="Guardar" />
				</div>
			</fieldset>
		</form:form>

	</tiles:putAttribute>
</tiles:insertDefinition>