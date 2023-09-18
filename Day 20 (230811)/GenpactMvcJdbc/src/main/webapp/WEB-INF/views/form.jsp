<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Form</title>

</head>
<body>
	<form action="register" method="get">

		<table>
			<tr>
				<td>First Name</td>
				<td><input type="text" name="fullName" placeholder="First Name" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="text" name="password" placeholder="Password" /></td>
			</tr>
			<tr>
				<td>Mobile No</td>
				<td><input type="number" name="mobileNo"
					placeholder="Mobile No" /></td>
			</tr>
			<tr>
				<td>Email Id</td>
				<td><input type="email" name="emailId" /></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><input type="radio" name="gender" value="male" />Male <input
					type="radio" name="gender" value="female" />Female <input
					type="radio" name="gender" value="other" />Other</td>
			</tr>
			<tr>
				<td>Hobbies</td>
				<td><input type="checkbox" name="hobbies" value="cricket" />Cricket
					<input type="checkbox" name="hobbies" value="drive" />Long Drive <input
					type="checkbox" name="hobbies" value="training" />Training</td>
			</tr>
			<tr>
				<td>Skills</td>
				<td><select name="skills" multiple="multiple">
						<option value="-1" selected>Select</option>
						<option value="c">C</option>
						<option value="cpp">C++</option>
						<option value="java">Java</option>
						<option value="st">Software Testing</option>
						<option value="js">JavaScript</option>
						<option value="rn">React Native</option>
				</select></td>
			</tr>

			<tr>
				<td></td>
				<td><input type="reset" value="Reset" /> <input id="submit"
					type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form>

	<p id="test">Test</p>
</body>
</html>