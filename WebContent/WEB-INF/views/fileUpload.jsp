<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>


<tiles:insertDefinition name="formUsuario">
	<tiles:putAttribute name="body">
		<c:out value="${message}"/>
<form:form method="POST" action="/imagen/cargar" enctype="multipart/form-data" commandName="fileFormBean">
    <table>
        <tr>
           <td>Selecciona fichero: </td>
           <td><input type="file" name="file" /></td>
        </tr>
        <tr>
    
        </tr>
        <tr><td colspan="2" align="center">
    	<input type="submit" value="Subir fichero"></td>
        </tr>
     </table>
</form:form>
	</tiles:putAttribute>
</tiles:insertDefinition>
