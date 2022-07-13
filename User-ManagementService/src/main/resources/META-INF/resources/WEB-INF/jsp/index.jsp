<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="ISO-8859-1">
<title>DPWorld - FlywayPOC</title>

<link rel="stylesheet"
 href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
 integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
 crossorigin="anonymous">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

</head>
<body>

 <div class="container my-2">

 <h1 style="color: green;"> Flyway POC </h1>
 <h3 style="color:red"> ${envName}</h3>
<br/><br/>	
 
   

<div class="list-group">
  <a href="all" class="list-group-item list-group-item-action active"> All Users</a>
  <a href="addUser" class="list-group-item list-group-item-action">Add User</a>
     
 

</div>

 </div>

   <p style="position: fixed; bottom: 0; width:100%; text-align: center">
  @ DPWorld - FlywayPOC.                                                          
  </p>
</body>

</html>