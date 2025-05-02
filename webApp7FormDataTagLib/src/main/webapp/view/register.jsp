<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Telusko Learning registration</title>
</head>
<body>
<center>
<h1 style='color:red; text-align:center'> Registration Application</h1>
<form:form method="post" action="registration" modelAttribute="emp">

<table>

<tr><th>Employee ID</th><td><form:input path="id" /></td></tr>
<tr><th>Employee Name</th><td><form:input path="eName" /></td></tr>
<tr><th>Employee City</th><td><form:input path="eCity" /></td></tr>
<tr><th>Employee Salary</th><td><form:input path="eSalary" /></td></tr>

<tr><td><input type="submit" Value="register"></td></tr>

</table>

  </form:form>
</center>
</body>
</html>