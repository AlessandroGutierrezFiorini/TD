<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>


<tiles:insertDefinition name="formUsuario">
	<tiles:putAttribute name="body">
		<c:out value="${message}"/>
<form method="POST" action="${pageContext.request.contextPath}/image/cabanaUpload" enctype="multipart/form-data">
    <table>
        <tr>
        
           <td><input id="id_cabana" type="text" name="id_cabana" value='<c:out value="${cabana.id}"/>'/></td>
           <td>Selecciona fichero: </td>
           <td><input id="file" type="file" name="file" value=""/></td>
        </tr>
        <tr>
        </tr>
        <tr><td colspan="2" align="center">
    	<input type="submit" value="Subir fichero"></td>
        </tr>
     </table>
</form>
	</tiles:putAttribute>
</tiles:insertDefinition>
