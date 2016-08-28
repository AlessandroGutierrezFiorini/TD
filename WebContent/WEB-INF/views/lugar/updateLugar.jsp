<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>


<tiles:insertDefinition name="formComplejo">
	<tiles:putAttribute name="body">

		<form:form
			action="${pageContext.request.contextPath}/lugar/cargar"
			method="POST" class="container" commandName="formLugar">

			<fieldset>
				<legend>Actualizar Lugar</legend>

				<form:input path="id" type="hidden" value="" class="form-control" />
				<label class="control-label" for="lugar">Nombre:</label>
				<form:input path="nombre" type="text" value="" class="form-control" />

				<label class="control-label" for="descripcion">Descripcion</label>
				<form:input path="descripcion" type="text" value="" class="form-control" />
				<label class="control-label" for="mail">Latitud</label>
				<form:input path="latitud" type="text" value=""
					class="form-control" />
				<label class="control-label" for="mail">Longitud:</label>
				<form:input path="longitud" type="text" value=""
					class="form-control" />
				<label class="control-label" for="mail">Distancia:</label>
				<form:input path="distancia" type="text" value="" class="form-control" />
				
				<div class="row text-center">
					<input class="btn btn-primary form-group" type="submit"
						value="Guardar" />
				</div>
			</fieldset>
		</form:form>

	</tiles:putAttribute>
</tiles:insertDefinition>