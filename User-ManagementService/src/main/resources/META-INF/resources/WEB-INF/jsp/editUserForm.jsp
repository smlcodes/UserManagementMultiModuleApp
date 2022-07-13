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
			<h1 style="text-align: center;">Edit userForm</h1>
		</div>


		<div class="card">
			<div class="card-body">
				<form:form method="post" action="/saveUser" modelAttribute="user">
				
				<form:input type="text" name="name" path="id"
						placeholder="user ID" class="form-control mb-4 col-4"/>	
									
				<form:input type="text" name="name" path="name"
						placeholder="user Name" class="form-control mb-4 col-4"/>

					<form:input type="text" name="email" path="email"
						placeholder="user Email" class="form-control mb-4 col-4"/>

					<form:input type="text" name="city" path="city"
						placeholder="user City" class="form-control mb-4 col-4"/>
						
					<form:input type="text" name="mobile" path="mobile"
						placeholder="user Mobile" class="form-control mb-4 col-4"/>
					
						<button type="submit" class="btn btn-info">Save</button><br/>
				</form:form>

				<hr><br/>
				<a href="/all"> Back to user List</a>
			</div>
		</div>
	</div>
</body>
</html>