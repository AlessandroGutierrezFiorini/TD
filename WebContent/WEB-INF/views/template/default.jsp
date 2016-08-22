<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<tiles:importAttribute name="javascripts"/>
<tiles:importAttribute name="stylesheets"/>
<html lang="es">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title><tiles:insertAttribute name="title" ignore="true"></tiles:insertAttribute></title>
<meta name="description" content="<tiles:insertAttribute name="description" ignore="true"></tiles:insertAttribute>" />
<c:forEach var="css" items="${stylesheets}">
        <link href="<c:url value="${css}"/>" rel="stylesheet" type="text/css">
</c:forEach>
</head>
<body>
	<tiles:insertAttribute name="menu"/>
	<tiles:insertAttribute name="body"/>
<%-- 	<tiles:insertAttribute name="footer"/> --%>
	<!-- javascripts -->
	<c:forEach var="script" items="${javascripts}">
	        <script src="<c:url value="${script}"/>"></script>
	</c:forEach>	
</body>
</html>