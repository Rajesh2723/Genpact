<%@page import="java.util.List"%>
<%@page import="java.util.Arrays"%>

<%@page import="genpact.mvc.jdbc.entities.User"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<!-- JSP tag known as ScriptLet Tag -->
	<p style = "color:green">
	<% 
	String fullName = (String)request.getAttribute("fullName");
	String password = (String)request.getAttribute("password");
	String mobileNo = (String)request.getAttribute("mobileNo");
	String emailId = (String)request.getAttribute("emailId");
	String gender = (String)request.getAttribute("gender");
	String[] hobbies = (String[])request.getAttribute("hobbies");
	String[] skills = (String[])request.getAttribute("skills");

	User user = (User) request.getAttribute("userData");
	List<String> cities = (List<String>)request.getAttribute("citiesList");

	out.print("<br/> " + fullName + ", " + password);
	out.print("<br/> " + mobileNo + ", " + emailId);
	out.print("<br/> " + gender) ;
	out.print("<br/> " + Arrays.toString(hobbies)) ;
	out.print("<br/> " + Arrays.toString(skills)) ;

	out.print("<br/>" + user);
	out.print("<br/>" + cities);

	%>
	
	</p>
</body>
</html>