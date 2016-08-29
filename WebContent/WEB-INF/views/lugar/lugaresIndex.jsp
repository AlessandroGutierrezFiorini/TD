<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<tiles:insertDefinition name="turismoTemplate">
	<tiles:putAttribute name="body">
		
		
		<div class="container col-md-8 col-md-offset-2"> 			
					<c:forEach items="${lugares}" var="lugar">
				
				<div class="post clearfix">
					<!--clearfix para no tener problemas con css, post desarmado-->
					
					
						<div class="row">

						<div class="panel panel-default">
							<div class="panel-body">
								<a href="#" class="thumb pull-left"> <img class="img"
									src="${lugar.imagen}"
									alt="">

									<h2 class="post-title">
										<a href="#" class="media-heading">${lugar.nombre}</a>
									</h2>
									<p class="post-contenido text-justify">
									${lugar.descripcion}
									</p>

								</a>
								<div class="contendedor-botones">
									<a href="#" class="btn btn-lg btn-primary sharp">Alojamientos
										<span class="badge">34</span>
									</a> 
								</div>
							</div>

						</div>
					</div>
				</div>
				</c:forEach>


			<div class="center-block">
				<nav class="page pagination center-block" aria-label="...">
					<div class="center-block">

						<ul class="pagination pagination-lg ">
							<c:if test="${page <= 1}">
								<li class="previous disabled"><a href="#"><span
										aria-hidden="true">&larr;</span> Anterior</a></li>
							</c:if>

							<c:if test="${page > 1}">
								<li class="previous"><a
									href="<c:url value="/lugares"><c:param name="page" value="${page-1}"/></c:url>"><span
										aria-hidden="true">&larr;</span> Anterior</a></li>
							</c:if>
							
								<c:forEach begin="${startpage}" end="${endpage}" var="p">
							
								<li>
									<a href="<c:url value="/lugares"><c:param name="page" value="${p}"/>${p}</c:url>">${p}</a>
							</li>
							
								</c:forEach>
							
							<c:if test="${fn:length(lugares) < 5}">
								<li class="next disabled"><a href="#">Siguiente <span
										aria-hidden="true">&rarr;</span>
								</a></li>

							</c:if>

							<c:if test="${fn:length(lugares) gt 4}">
								<li class="next"><a
									href="<c:url value="/lugares"><c:param name="page" value="${page+1}"/></c:url>">Siguiente
										<span aria-hidden="true">&rarr;</span>
								</a></li>
							</c:if>

						</ul>
					</div>
				</nav>
			</div>
		</div>	
				
				</tiles:putAttribute>
</tiles:insertDefinition>