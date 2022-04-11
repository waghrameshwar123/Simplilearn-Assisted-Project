<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Product By Id</title>

</head>
<body>


<center>
<a href="/admin/adminportal">Admin Portal</a>
<br>
<a href="/admin/logoutadmin">Logout</a>
<br>
	<h3>Search Product By Id</h3>
        <form:form method="POST" 
          action="/product/findbyidproduct" modelAttribute="product">
             <table border="1" cellpadding="10">
                <tr>
                    <td><form:label path="id">Product Id</form:label></td>
                    <td><form:input path="id" required="required"/></td>
                </tr>
                <tr>
                    <td colspan="2"><center><input type="reset" value="Reset"/>&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="Search"/></center></td>
                </tr>
            </table>
        </form:form>
        <br>
        <c:if test="${not empty productdb}">
        <h3>Search Result</h3>
		<table border="1" cellpadding="10">
		<tr>
		<th>Product Id</th>
		<th>Product Name</th>
		<th>Product Price</th>
		<th>Product Category</th>
		</tr>
		<tr>
		<td><c:out value="${productdb.id }"></c:out></td>
		<td><c:out value="${productdb.prodname }"></c:out></td>
		<td><c:out value="${productdb.price }"></c:out></td>
		<td><c:out value="${productdb.category }"></c:out></td>
		</tr>
		</c:if>
		<c:if test="${failure eq 'failure'}">
		<h4 style="color:red">No product found...!</h4>
		</c:if>
</center>
</body>
</html>