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
	<jsp:include page="template/header.jsp"></jsp:include>
<main class="app-content">
	<div class="app-title">
		<div>
			<h1>
				<i class="fa fa-dashboard"></i>DGP
			</h1>
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
					 	<div class="for-group">
					 		<label>Trabajador:</label>
					 		<select class="form-control">					      
								<option value="1">Emanuel Pinaud</option>
								<option value="2">Owen Mejia</option>
								<option value="2">Samuel Rojas</option>
						    </select>
					 	</div>
					 	<div class="for-group">
					 		<label>Area de trabajo:</label>
					 		<select class="form-control">					      
								<option value="1">Oficina</option>
								<option value="2">Almacen</option>
						    </select>
					 	</div>
					 	<div class="for-group">
					 		<label>Fecha de Inicio:</label>
					 		<input type="date" class="form-control" name="fe_incio">
					 	</div>
					 	<div class="for-group">
					 		<label>Fecha de Término:</label>
					 		<input type="date" class="form-control" name="fe_fin">
					 	</div>
					 	<div class="for-group">
					 		<label>Dias:</label>
					 		<input type="text" class="form-control" name="to_dias">
					 	</div>
					 	<div class="for-group">
					 		<label>Institución:</label>
					 		<input type="text" class="form-control" name="to_dias">
					 	</div>
					 	
					 	<div class="for-group">
					 		<label>Tipo de Institución:</label>
					 		<select class="form-control" id="exampleFormControlSelect1" name="idcategoria">					      
								<option value="1">Privada</option>
								<option value="2">Nacional</option>
						    </select>
					 	</div>
					 	<div class="for-group" style="margin-top: 10px;">
					 		<input type="submit" class="btn btn-dark" value="Guardar">
					 	</div>
					 </form>
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