<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Barra de navegación</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href='<c:url value="/administrador"/>'>Turismo Digital</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a href='<c:url value="/usuario/listar"/>'>Usuarios<span class="sr-only">(current)</span></a></li>
        <li><a href='<c:url value="/complejo/listar"/>'>Complejos</a></li>
        <li><a href='<c:url value="/cabana/listar"/>'>Cabañas</a></li>
        <li><a href='<c:url value="/lugar/listar"/>'>Lugares</a></li>
      </ul>

      <ul class="nav navbar-nav navbar-right">
        <li><a href='<c:url value="/login"/>'>Login</a></li>
         <li><a href='<c:url value="/logout"/>'>Logout</a></li>
       
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
