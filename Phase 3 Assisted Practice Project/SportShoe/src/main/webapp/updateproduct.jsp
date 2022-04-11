<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update product</title>


<center>
<a href="/admin/adminportal">Admin Portal</a>
<br>
<a href="/admin/logoutadmin">Logout</a>
<br>
<c:if test="${success eq 'success'}">
<h4>Product updated successfully...!</h4>
</c:if>

<h3>Update Product</h3>
        <form:form method="POST" 
          action="/product/updateproduct" modelAttribute="product">
             <table border="1" cellpadding="10">
             	<tr>
                    <td><form:label path="id">Product Id</form:label></td>
                    <td><form:input path="id" required="required"/></td>
                </tr>
                <tr>
                    <td><form:label path="prodname">Product Name</form:label></td>
                    <td><form:input path="prodname" required="required"/></td>
                </tr>
                <tr>
                    <td><form:label path="price">Product Price</form:label></td>
                    <td><form:input path="price" required="required"/></td>
                </tr>
                 <tr>
                    <td><form:label path="category">Product Category</form:label></td>
                    <td><form:input path="category" required="required"/></td>
                </tr>
                <tr>
                    <td colspan="2"><center><input type="reset" value="Reset"/>&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="Update Product"/></center></td>
                </tr>
            </table>
        </form:form>
</center>
</body>
</html>