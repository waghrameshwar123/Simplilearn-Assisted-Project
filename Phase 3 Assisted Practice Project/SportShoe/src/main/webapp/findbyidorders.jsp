<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Orders By Id</title>

</head>
<body>


<center>
<a href="/admin/adminportal">Admin Portal</a>
<br>
<a href="/admin/logoutadmin">Logout</a>
<br>
	<h3>Search Orders By Id</h3>
        <form:form method="POST" 
          action="/orders/findbyidorders" modelAttribute="orders">
             <table border="1" cellpadding="10">
                <tr>
                    <td><form:label path="id">Order Id</form:label></td>
                    <td><form:input path="id" required="required"/></td>
                </tr>
                <tr>
                    <td colspan="2"><center><input type="reset" value="Reset"/>&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="Search"/></center></td>
                </tr>
            </table>
        </form:form>
        <br>
        <c:if test="${not empty ordersdb}">
        <h3>Search Result</h3>
		<table border="1" cellpadding="10">
		<tr>
		<th>Order Id</th>
		<th>Order Amount</th>
		<th>Order Date</th>
		</tr>
		<tr>
		<td><c:out value="${ordersdb.id }"></c:out></td>
		<td><c:out value="${ordersdb.amount }"></c:out></td>
		<td><c:out value="${ordersdb.orderPurchaseDate }"></c:out></td>
		</tr>
		</c:if>
		<c:if test="${failure eq 'failure'}">
			<h4 style="color:red">Order not found...</h4>
		</c:if>
</center>
</body>
</html>