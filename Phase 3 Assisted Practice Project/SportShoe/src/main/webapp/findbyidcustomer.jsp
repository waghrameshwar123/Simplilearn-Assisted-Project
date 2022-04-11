<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Customer By Id</title>

</head>
<body>


<center>
<a href="/admin/adminportal">Admin Portal</a>
<br>
<a href="/admin/logoutadmin">Logout</a>
<br>
	<h3>Search Customer By Id</h3>
        <form:form method="POST" 
          action="/customer/findbyidcustomer" modelAttribute="customer">
             <table border="1" cellpadding="10">
                <tr>
                    <td><form:label path="id">Customer Id</form:label></td>
                    <td><form:input path="id" required="required"/></td>
                </tr>
                <tr>
                    <td colspan="2"><center><input type="reset" value="Reset"/>&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="Search"/></center></td>
                </tr>
            </table>
        </form:form>
        <br>
        <c:if test="${not empty customerdb}">
        <h3>Search Result</h3>
		<table border="1" cellpadding="10">
		<tr>
		<th>Customer Id</th>
		<th>Customer Name</th>
		<th>Customer Email</th>
		<th>Customer City</th>
		</tr>
		<tr>
		<td><c:out value="${customerdb.id }"></c:out></td>
		<td><c:out value="${customerdb.cusname }"></c:out></td>
		<td><c:out value="${customerdb.email }"></c:out></td>
		<td><c:out value="${customerdb.city }"></c:out></td>
		</tr>
		</c:if>
		<c:if test="${failure eq 'failure'}">
		<h4 style="color:red">No customer found...!</h4>
		</c:if>
</center>
</body>
</html>