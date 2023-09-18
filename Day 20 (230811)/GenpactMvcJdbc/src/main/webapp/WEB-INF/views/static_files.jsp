<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Static Files</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<link href="<c:url value='/resources/css/style.css'/>" rel="stylesheet" type="text/css"/>

</head>
<body>
	<p id="para">This is some text</p>
	
	<button onclick="change()">Click me!!</button>
	
	<img src='<c:url value="/resources/images/let_us_cpp.jpg"/>' alt="my image"/>
	
	<script type="text/javascript" src="<c:url value='/resources/js/script.js'/>"></script>

</body>
</html>