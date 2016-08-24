<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>


<tiles:insertDefinition name="formUsuario">
	<tiles:putAttribute name="body">
		<div class="container">

			<form:form
				action="${pageContext.request.contextPath}/usuario/guardar"
				method="POST" class="container" commandName="formUsuario">

				<fieldset>

					<!-- Form Name -->
					<legend>Cargar Usuario</legend>

					<form:input path="id" type="hidden" value="" class="form-control" />
					<label class="control-label" for="mail">Email</label>
					<form:input path="email" type="text" value="" class="form-control" />
					<label class="control-label" for="mail">Password</label>
					<form:input path="password" type="text" value=""
						class="form-control" />
					<label class="control-label" for="mail">Estado:</label>
					<form:input path="estado" type="text" value="" class="form-control" />

					<div class="row text-center">
						<input class="btn btn-primary form-group" type="submit"
							value="Guardar" />
					</div>
				</fieldset>

			</form:form>
		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>



