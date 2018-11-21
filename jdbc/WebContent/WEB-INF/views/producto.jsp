<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<spring:url value="/" var="urlRoot" />
<!DOCTYPE html>
<html lang="es">
<head>
<title>SysCoco</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<spring:url value="/recursos" var="urlrecursos"></spring:url>
<link href="${urlrecursos}/css/template.css" rel="stylesheet">
</head>
<body class="app sidebar-mini rtl">
	<!-- Navbar-->
	<jsp:include page="template/header.jsp"></jsp:include>
	<main class="app-content">
	<div class="app-title">
		<div>
			<h1>
				<i class="fa fa-dashboard"></i> Productos
			</h1>
			<p>Lenguaje de Programaci�n II</p>
		</div>
		<ul class="app-breadcrumb breadcrumb">
			<li class="breadcrumb-item"><i class="fa fa-home fa-lg"></i></li>
			<li class="breadcrumb-item"><a href="#">User</a></li>
		</ul>
	</div>
	<%int i=0; %>
	<div class="row">
		<div class="col-md-12">
			<div class="tile">
				<div class="tile-body">
					<div style="max-width: 400px">
					 <form action="saveProd" method="post">
					 	<select class="form-control" id="exampleFormControlSelect1" name="idcategoria">					      
					      <c:forEach items="${lista}" var="pro">
							<option value="${pro.idcategoria}">${pro.nom_cat}</option>
						  </c:forEach>
					    </select>
					 	<div class="for-group">
					 		<label>Producto:</label>
					 		<input type="text" class="form-control" name="nom_prod">
					 	</div>
					 	<div class="for-group">
					 		<label>Precio:</label>
					 		<input type="text" class="form-control" name="precio">
					 	</div>
					 	<div class="for-group">
					 		<label>Cantidad:</label>
					 		<input type="text" class="form-control" name="cantidad">
					 	</div>
					 	<div class="for-group" style="margin-top: 10px;">
					 		<input type="submit" class="btn btn-primary" value="Guardar">
					 	</div>
					 </form>
					</div>
				<br>
					<table class="table table-bordered" style="max-width: 400px;">
						<thead>
							<tr>
								<th scope="col">#</th>
								<th scope="col">ID</th>
								<th scope="col">Categor�a</th>
								<th scope="col">Producto</th>
								<th scope="col">Precio</th>
								<th scope="col">Cantidad</th>
								<th scope="col" colspan="2">Acci�n</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${list}" var="prod">
								<%i++; %>
								<tr>
									<th scope="row"><%=i %></th>
									<td>${prod.idproducto}</td>
									<td>${prod.nom_cat}</td>
									<td>${prod.nom_prod}</td>
									<td>${prod.precio}</td>
									<td>${prod.cantidad}</td>
									<td><a href="up/${prod.idproducto}" style="color: blue;"><i class="fa fa-pencil-square-o" aria-hidden="true"></i></a></td>
									<td><a href="delp/${prod.idproducto}" style="color: red;"><i class="fa fa-trash" aria-hidden="true"></i></a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	</main>
	<!-- Essential javascripts for application to work-->
	<script src="${urlrecursos}/js/jquery-3.2.1.min.js"></script>
	<script src="${urlrecursos}/js/popper.min.js"></script>
	<script src="${urlrecursos}/js/bootstrap.min.js"></script>
	<script src="${urlrecursos}/js/main.js"></script>
	<!-- The javascript plugin to display page loading on top-->
	<script src="${urlrecursos}/js/plugins/pace.min.js"></script>
	<!-- Page specific javascripts-->
	<!-- Google analytics script-->
	<script type="text/javascript">
		if (document.location.hostname == 'pratikborsadiya.in') {
			(function(i, s, o, g, r, a, m) {
				i['GoogleAnalyticsObject'] = r;
				i[r] = i[r] || function() {
					(i[r].q = i[r].q || []).push(arguments)
				}, i[r].l = 1 * new Date();
				a = s.createElement(o), m = s.getElementsByTagName(o)[0];
				a.async = 1;
				a.src = g;
				m.parentNode.insertBefore(a, m)
			})(window, document, 'script',
					'//www.google-analytics.com/analytics.js', 'ga');
			ga('create', 'UA-72504830-1', 'auto');
			ga('send', 'pageview');
		}
	</script>
</body>
</html>