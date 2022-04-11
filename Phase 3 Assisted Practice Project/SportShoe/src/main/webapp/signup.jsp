<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Sign Up</title>
</head>
<body>
<center>
<a href="/">Home</a>
<br>
<c:if test="${success eq 'success'}">
<h4 style="color:green">Thank you...You have successfully registered</h4>
</c:if>

<h3>Customer Sign Up Details</h3>
        <form:form method="POST" 
          action="/customer/addcustomer" modelAttribute="customer">
             <table border="1" cellpadding="10">
                <tr>
                    <td><form:label path="cusname">Customer Name</form:label></td>
                    <td><form:input path="cusname" required="required"/></td>
                </tr>
                <tr>
                    <td><form:label path="email">Customer Email</form:label></td>
                    <td><form:input path="email" required="required"/></td>
                </tr>
                 <tr>
                    <td><form:label path="city">City</form:label></td>
                    <td><form:input path="city" required="required"/></td>
                </tr>
                <tr>
                    <td colspan="2"><center><input type="reset" value="Reset"/>&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="Sign up"/></center></td>
                </tr>
            </table>
        </form:form>
</center>
</body>
</html>