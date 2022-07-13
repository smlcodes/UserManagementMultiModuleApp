<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="ISO-8859-1">

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

		<br />
		<h3 style="color:red"> ${envName}</h3>
		<br />

		<div class="card-header">
			<h1>
				<a href="/" style="font-size: 20px; text-align: left;"> Home|</a> <a
					href="/addUser" style="font-size: 20px; text-align: left;">
					Add User |</a> All Users
			</h1>
		</div>


		<div class="card">
			<div class="card-body">
				<table border="1" class="table table-striped table-responsive-md">
					<thead>
						<tr>
							<th># User. ID</th>
							<th>Name</th>
							<th>Email</th>
							<th>City</th>
							<th>Mobile No</th>
							<th>Actions</th>
						</tr>
					</thead>
					<tbody>


						<c:forEach var="user" items="${listUsers}">
							<tr>
								<td>${user.id}</td>
								<td>${user.name}</td>
								<td>${user.email}</td>
								<td>${user.city}</td>
								<td>${user.mobile}</td>

								<td><a href="viewUser/${user.id}"
									class="btn btn-primary"> <i class="fas fa-eye"></i>
								</a> <span>&nbsp;</span> <a href="editUserForm/${user.id}"
									class="btn btn-warning"><i class="fas fa-edit"></i> </a> <span>&nbsp;</span>
									<a href="deleteUser/${user.id}" class="btn btn-danger"><i
										class="fas fa-trash-alt"></i> </a></td>
							</tr>
						</c:forEach>

					</tbody>
				</table>

			</div>
		</div>


	</div>
</body>
</html>