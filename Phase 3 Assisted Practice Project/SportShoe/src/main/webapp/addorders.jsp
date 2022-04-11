<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Order</title>

</head>
<body>


<center>
<a href="/admin/adminportal">Admin Portal</a>
<br>
<a href="/admin/logoutadmin">Logout</a>
<br>
<c:if test="${success eq 'success'}">
<h4 style="color:green">New order added successfully...!</h4>
</c:if>

<h3>Add New Order</h3>
        <form:form method="POST" 
          action="/orders/addorders" modelAttribute="orders">
             <table border="1" cellpadding="10">
                <tr>
                    <td><form:label path="amount">Order Amount</form:label></td>
                    <td><form:input path="amount" required="required"/></td>
                </tr>
                <tr>
                    <td><form:label path="orderPurchaseDate">Order Date</form:label></td>
                    <td><form:input path="orderPurchaseDate" required="required"/></td>
                </tr>
                <tr>
                    <td colspan="2"><center><input type="reset" value="Reset"/>&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="Add Order"/></center></td>
                </tr>
            </table>
        </form:form>
</center>
</body>
</html>