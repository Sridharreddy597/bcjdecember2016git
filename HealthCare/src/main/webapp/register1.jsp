<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%--  <%@ taglib prefix="s" uri="/struts-tags"%>  --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%-- <link href="<c:url value="Stylesheets.css" /> rel="stylesheet"> --%>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {
	background-image: url("paper.gif");
	background-color: #cccccc;
}
</style>
</head>
<body>
	<header>
		<h1 id="top" style="text-align: top; font-size: 40px;">
			<cite style="margin-left: 500px;">Employee enrollment form</cite>
		</h1>
	</header>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<ul class="nav navbar-nav" style="margin-left: 500px;">
				<li class="active"><a href="#"></a></li>
				<li><a href="#">Home</a></li>
				<li><a href="#">About</a></li>
				<li><a href="#">HR benefits</a></li>
				<li><a href="#">services</a></li>
				<li><a href="#">contact us</a></li>
			</ul>
			<form class="navbar-form navbar-right">
				<div class="input-group">
					<input type="text" class="form-control" placeholder="Search">
					<div class="input-group-btn">
						<button class="btn btn-default" type="submit">
							<i class="glyphicon glyphicon-search"></i>
						</button>
					</div>
				</div>
			</form>
		</div>
	</nav>
	<form action="register" method="POST">
		<div class="container" style="margin-top: 150px;">

			<div class="panel-group" id="accordion">

				<div class="panel panel-default">
					<div class="panel-heading">
						<h4 class="panel-title">
							<a data-toggle="collapse" data-parent="#accordion"
								href="#collapse1">Personal Information</a>
						</h4>
					</div>
					<div id="collapse1" class="panel-collapse collapse in">
						<div class="panel-body">
							<div class="form-inline">



								<input type="text" class="form-control" name="firstName"
									placeholder="firstName" required>
									<br> <br> <input
									type="text" class="form-control" name="middleName"
									placeholder="middleName">
									<br> <br> <input
									type="text" class="form-control" name="lastName"
									placeholder="lastName" required>
									 <br> <br> <input
									type="text" class="form-control" name="dateOfBirth"
									placeholder="DateOfBirth" required>
									<br> <br>

								<input type="text" class="form-control" name="SSN"
									placeholder="SSN" required>
									<br> <br> <input
									type="text" class="form-control" name="email"
									placeholder="email" required>
									<br> <br> <input
									type="text" class="form-control" name="phoneNumber"
									placeholder="phonenumber" required>



							</div>
						</div>
					</div>
				</div>

				<div class="panel panel-default">
					<div class="panel-heading">
						<h4 class="panel-title">
							<a data-toggle="collapse" data-parent="#accordion"
								href="#collapse2">Address Information</a>
						</h4>
					</div>
					<div id="collapse2" class="panel-collapse collapse">
						<div class="panel-body">
							<div class="form-inline">

								<span class="form-group"> <input type="text"
									class="form-control" name="address.addressLine1"
									placeholder="addressLine1" required>
								</span><br> <br> <span class="form-group"> <input
									type="text" class="form-control" name="address.addressLine2"
									placeholder="addressLine2" required>
								</span><br> <br> <span class="form-group"> <input
									type="text" class="form-control" name="address.city"
									placeholder="City" required>
								</span><br> <br> <span class="form-group"> <input
									type="text" class="form-control" name="address.state"
									placeholder="State" required>
								</span><br> <br> <span class="form-group"> <input
									type="text" class="form-control" name="address.zip"
									placeholder="Zip" required>
								</span>


							</div>
						</div>

					</div>
				</div>

				<div class="panel panel-default">
					<div class="panel-heading">
						<h4 class="panel-title">
							<a data-toggle="collapse" data-parent="#accordion"
								href="#collapse8">Dependent Information</a>
						</h4>
					</div>

					<div id="collapse8" class="panel-collapse collapse">
						<div class="panel-body">

							<div class="form-inline">
						 <input type="text" class="form-control" name="dependents[0].firstName"
									placeholder="firstName" required>
									<br> <br> <input
									type="text" class="form-control" name="dependents[0].middleName"
									placeholder="middleName">
									<br> <br> <input
									type="text" class="form-control" name="dependents[0].lastName"
									placeholder="lastName" required>
									 <br> <br> <input
									type="text" class="form-control" name="dependents[0].dateOfBirth"
									placeholder="DateOfBirth" required>
									<br> <br>

								<input type="text" class="form-control" name="dependents[0].SSN"
									placeholder="SSN" required>
									<br> <br> <input
									type="text" class="form-control" name="dependents[0].relationship"
									placeholder="relationship with employee" required>
									<br> <br>

						
							</div>
						</div>
					</div>
				</div>
				
				
				<div class="panel panel-default">
					<div class="panel-heading">
						<h4 class="panel-title">
							<a data-toggle="collapse" data-parent="#accordion"
								href="#collapse9">Dependent Information</a>
						</h4>
					</div>

					<div id="collapse9" class="panel-collapse collapse">
						<div class="panel-body">

							<div class="form-inline">
						 <input type="text" class="form-control" name="dependents[1].firstName"
									placeholder="firstName" required>
									<br> <br> <input
									type="text" class="form-control" name="dependents[1].middleName"
									placeholder="middleName">
									<br> <br> <input
									type="text" class="form-control" name="dependents[1].lastName"
									placeholder="lastName" required>
									 <br> <br> <input
									type="text" class="form-control" name="dependents[1].dateOfBirth"
									placeholder="DateOfBirth" required>
									<br> <br>

								<input type="text" class="form-control" name="dependents[1].SSN"
									placeholder="SSN" required>
									<br> <br> <input
									type="text" class="form-control" name="dependents[1].relationship"
									placeholder="relationship with employee" required>
									<br> <br>

						
							</div>
						</div>
					</div>
				</div>
				<div class="panel panel-default">
					<div class="panel-heading">
						<h4 class="panel-title">
							<a data-toggle="collapse" data-parent="#accordion"
								href="#collapse10">Dependent Information</a>
						</h4>
					</div>

					<div id="collapse10" class="panel-collapse collapse">
						<div class="panel-body">

							<div class="form-inline">
						 <input type="text" class="form-control" name="dependents[2].firstName"
									placeholder="firstName" required>
									<br> <br> <input
									type="text" class="form-control" name="dependents[2].middleName"
									placeholder="middleName">
									<br> <br> <input
									type="text" class="form-control" name="dependents[2].lastName"
									placeholder="lastName" required>
									 <br> <br> <input
									type="text" class="form-control" name="dependents[2].dateOfBirth"
									placeholder="DateOfBirth" required>
									<br> <br>

								<input type="text" class="form-control" name="dependents[2].SSN"
									placeholder="SSN" required>
									<br> <br> <input
									type="text" class="form-control" name="dependents[2].relationship"
									placeholder="relationship with employee" required>
									<br> <br>

						
							</div>
						</div>
					</div>
				</div>
				
				<br> <input type="submit" class="btn btn-primary btn-block">
				</button>
	</form>

</body>