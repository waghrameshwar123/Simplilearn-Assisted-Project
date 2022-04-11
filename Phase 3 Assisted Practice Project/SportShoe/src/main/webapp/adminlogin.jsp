<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>

</head>
<body>

<center>
<a href="/">Home</a>
<c:if test="${failure eq 'failure'}">
<h4 style="color:red">Incorrect username or password...Please try again...!</h4>
</c:if>

<h3>Admin Login</h3>
        <form:form method="POST" 
          action="/admin/adminlogin" modelAttribute="admin">
             <table border="1" cellpadding="10">
                <tr>
                    <td><form:label path="username">Username</form:label></td>
                    <td><form:input path="username" required="required"/></td>
                </tr>
                <tr>
                    <td><form:label path="password">Password</form:label></td>
                    <td><form:password path="password" required="required"/></td>
                </tr>
                <tr>
                    <td colspan="2"><center><input type="reset" value="Reset"/>&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="Login"/></center></td>
                </tr>
            </table>
        </form:form>
</center>
</body>
</html>