<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Trainer</title>
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
		String profession = 
		(String) request.getAttribute("profession");
		String subject = 
		(String) request.getAttribute("subject");
	%>
	<table>
		<tr>
			<th>Property</th>
			<th>Value</th>
		</tr>
		<tr>
			<td>Profession</td>
			<td><%= profession %></td>
		</tr>
		<tr>
			<td>Subject</td>
			<td><%= subject %></td>
		</tr>
	</table>
	
	
	
	
	
	
	
	

</body>
</html>