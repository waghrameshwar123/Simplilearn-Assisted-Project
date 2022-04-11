<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show All Orders</title>

</head>
<body>

<center>
<a href="/admin/adminportal">Admin Portal</a>
<br>
<a href="/admin/logoutadmin">Logout</a>
<br>
<h3>All Orders Detail</h3>
<table border="1" cellpadding="10">
<tr>
<th>Order Id</th>
<th>Order Amount</th>
<th>Order Date</th>
</tr>
<c:forEach var="orders" items="${orders}">
 <tr>
 <td>
 <c:out value="${orders.id }"></c:out>
 </td>
 <td>
 <c:out value="${orders.amount }"></c:out>
 </td>
 <td>
 <c:out value="${orders.orderPurchaseDate }"></c:out>
 </td>
 </tr>
 </c:forEach>
</table>
</center>
</body>
</html>