<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change Password</title>

</head>
<body>

<center>
<a href="/admin/adminportal">Admin Portal</a>
<br>
<a href="/admin/logoutadmin">Logout</a>
<br>
<c:if test="${failure eq 'failure'}">
<h4 style="color:red">Opps...You have entered wrong username or password...!</h4>
</c:if>

<h3>Change Password</h3>
        <form:form method="POST" 
          action="/admin/updatepassword" modelAttribute="adminForm">
             <table border="1" cellpadding="10">
                <tr>
                    <td><form:label path="userName">Username</form:label></td>
                    <td><form:input path="userName" required="required"/></td>
                </tr>
                <tr>
                    <td><form:label path="oldPassword">Old Password</form:label></td>
                    <td><form:password path="oldPassword" required="required"/></td>
                </tr>
                 <tr>
                    <td><form:label path="newPassword">New Password</form:label></td>
                    <td><form:password path="newPassword" required="required"/></td>
                </tr>
                <tr>
                    <td colspan="2"><center><input type="reset" value="Reset"/>&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="Change Password"/></center></td>
                </tr>
            </table>
        </form:form>
</center>
</body>
</html>