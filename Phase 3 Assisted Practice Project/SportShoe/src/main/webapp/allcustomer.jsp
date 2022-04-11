<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Customer</title>

</head>
<body>

<center>
<a href="/admin/adminportal">Admin Portal</a>
<br>
<a href="/admin/logoutadmin">Logout</a>
<br>
<h3>All Customer Detail</h3>
<table border="1" cellpadding="10">
<tr>
<th>Customer Id</th>
<th>Customer Name</th>
<th>Customer Email</th>
<th>Customer City</th>
</tr>
<c:forEach var="customer" items="${customer}">
 <tr>
 <td>
 <c:out value="${customer.id }"></c:out>
 </td>
 <td>
 <c:out value="${customer.cusname }"></c:out>
 </td>
 <td>
 <c:out value="${customer.email }"></c:out>
 </td>
 <td>
 <c:out value="${customer.city }"></c:out>
 </td>
 </tr>
 </c:forEach>
</table>
</center>
</body>
</html>