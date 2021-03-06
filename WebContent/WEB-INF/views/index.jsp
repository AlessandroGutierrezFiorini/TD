<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>



<tiles:insertDefinition name="presentationTemplate">
	<tiles:putAttribute name="body">
		<div class="row ">
	
	<div class="container-left col-md-6"> 
		<a href="${pageContext.request.contextPath}/lugares" class="btn btn-primary btn-lg sharp btn-izq">Lugares</a>		
	</div>
	

	<div class="container-right col-md-6"> 
		<a href="ListarLugares.html" class="btn btn-primary btn-lg sharp btn-der">Alojamientos</a>	
	</div>

</div>
	</tiles:putAttribute>
</tiles:insertDefinition>

	

	