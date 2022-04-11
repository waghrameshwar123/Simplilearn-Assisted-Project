<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sporty Shoes - Home</title>
</head>
<body>

<center>
<c:if test="${success eq 'success'}">
<h4>You have successfully logged out...!</h4>
</c:if>
<h1>Welcome to Sporty Shoes</h1>
		<br>
		<h3><a href="/admin/showlogin">Admin Portal</a></h3>
		<br>
		<h3><a href="/customer/showsignup">Sign up</a></h3>
	</ul>
</center>
</body>
</html>