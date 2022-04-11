<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<head></head>
<style>
table {
	float: center;
}

th {
	border-bottom: 1px solid black;
	text-align: left;
}
</style>
<body>
<center>
	<h2>Users Page</h2>
	<table>
	<tr><th>ID</th><th>Name</th><th>Email</th><th>Password</th></tr>
		<c:forEach items="${users}" var="user" varStatus="count">
			<tr id="${count.index}">
			<td>${user.id}</td>
			<td>${user.name}</td>
			<td>${user.email}</td>
			<td>${user.password}</td>
			</tr>
		</c:forEach>
	</table>
</center>
</body>
</html> 