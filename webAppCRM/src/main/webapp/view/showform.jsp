<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration form</title>
</head>
<body>
<h1>CRM App Registration form</h1>

<form:form  action="registration" modelAttribute="customer">

<table>

<tr><th>Customer First Name</th><td><form:input path="firstname" /></td></tr>
<tr><th>Customer Last Name</th><td><form:input path="lastname" /></td></tr>
<tr><th>Customer City</th><td><form:input path="city" /></td></tr>

<tr><td><input type="submit" Value="register"></td></tr>

</table>

  </form:form>


</body>
</html>