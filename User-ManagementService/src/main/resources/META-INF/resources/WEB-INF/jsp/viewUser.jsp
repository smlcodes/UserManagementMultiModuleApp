<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="ISO-8859-1">
<title>SpringBoot - JSP - userApp&trade;</title>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css"
	integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p"
	crossorigin="anonymous" />


</head>
<body>



	<div class="container">

		<br /> <br />

		<div class="card-header">
			<h1 style="text-align: center;">View user</h1>
		</div>


			<div class="card-body">
				<h4>
					ID : <code>${user.id}</code>
				</h4>
				<h4>
					NAME : <code>${user.name}</code>
				</h4>
				<h4>
					EMAIL : <code>${user.email}</code>
				</h4>
				<h4>
					CITY : <code>${user.city}</code>
				</h4>
				<h4>
					Mobile : <code>${user.mobile}</code>
				</h4>
				<hr>
				<br /> <a href="/all"> Back to user List</a>
			</div>
		</div>
	</div>
</body>
</html>