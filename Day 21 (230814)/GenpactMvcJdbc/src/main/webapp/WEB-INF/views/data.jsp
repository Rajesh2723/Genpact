<%@page import="java.util.Arrays"%>
<%@page import="genpact.mvc.jdbc.entities.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Data</title>
<style type="text/css">
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

th, td {
	padding: 5px;
}
</style>
</head>
<body>
	<% 
User user = 
(User)request.getAttribute("user"); 
	%>
	
	<table>
		<tr>
			<th>Property</th>
			<th>Value</th>
		</tr>
		<tr>
			<td>Name</td>
			<td><%= user.getFullName()%></td>
		</tr>
		
		<tr>
			<td>Email</td>
			<td><%= user.getEmailId() %></td>
		</tr>
		
		<tr>
			<td>Hobbies</td>
			<td><%= Arrays.toString(user.getHobbies())%></td>
		</tr>
	</table>

</body>
</html>