<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
	<p>
		<% 
			String name = "Kaustubh";
			out.print(name.toUpperCase() + "<br/>");
			out.print(name.toLowerCase());
		%>
	</p>
	
	<p>
		<a href="openForm">Open Form</a>
	</p>
	
	<p>
		<a href="handleDataOnClick?profession=CorporateTrainer&subject=Java">Send Data on click</a>
	</p>
	
	<p>
		<a href="staticContent">CSS, JS and Image</a>
	</p>

</body>
</html>