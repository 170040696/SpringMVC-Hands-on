<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CRM Application</title>
</head>
<body>
<h1>Customer relationship management system</h1>

<input type="button"  value="register customer"  onClick="window.location.href='/CRMApp/showform';" />
<table>

<tr>
<th>First Name</th>
<th>Last Name</th>
<th>City</th>
<th>Update</th>
<th>Delete</th>
</tr>

<c:forEach var="cust" items="${customers}"  >

<c:url var="UpdateLink" value="/updateform">
<c:param name="id" value="${cust.id}"></c:param>
</c:url>

<c:url var="DeleteLink"  value="/deleteform">
<c:param name="id" value="${cust.id}"></c:param>
</c:url>

<tr>
<td>${cust.firstname}</td>
<td>${cust.lastname}</td>
<td>${cust.city}</td>
<td><a href="${UpdateLink}">Update Information</a></td>
<td><a href="${DeleteLink}">Delete Information</a></td>
</tr>

</c:forEach>

${msg}
</table>
</body>
</html>