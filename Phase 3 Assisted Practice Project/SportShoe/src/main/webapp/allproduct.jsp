<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show All Product</title>

</head>
<body>

<center>
<a href="/admin/adminportal">Admin Portal</a>
<br>
<a href="/admin/logoutadmin">Logout</a>
<br>
<h3>All Product Details</h3>
<table border="1" cellpadding="10">
<tr>
<th>Product Id</th>
<th>Product Name</th>
<th>Product Price</th>
<th>Product Category</th>
</tr>
<c:forEach var="product" items="${products}">
 <tr>
 <td>
 <c:out value="${product.id }"></c:out>
 </td>
 <td>
 <c:out value="${product.prodname }"></c:out>
 </td>
 <td>
 <c:out value="${product.price }"></c:out>
 </td>
 <td>
 <c:out value="${product.category }"></c:out>
 </td>
 </tr>
 </c:forEach>
</table>
</center>
</body>
</html>