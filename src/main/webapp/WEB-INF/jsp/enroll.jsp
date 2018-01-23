<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student EnrollMent</title>
</head>
<body>
	<center>
		<font color="red"><h1>Student Enrollment</h1></font>
		<hr>
		
		<form:form action="${pageContext.request.contextPath}/students/enroll" method="POST" modelAttribute="studentcommand">
		<table height="300px">

			<tr>
				<td>Enter Name:</td>
				<td><form:input type="text" path="name" /></td>
			</tr>
			<tr>
				<td>Enter Qualification:</td>
				<td><form:select path="qualification" items="${qualifications}">
					</form:select></td>
			</tr>
			<tr>
				<td>Enter Gender:</td>
				<td><form:radiobutton path="gender" value="Male" />Male<form:radiobutton
						path="gender" value="Female" />Female</td>
			</tr>
			<tr>
				<td>Enter Address:</td>
				<td><form:input type="text" path="address" /></td>
			</tr>
			
			<tr>
				<td>Enter Course Name:</td>
				<td><form:input type="text" path="course" /></td>
			</tr>
			
			<tr>
				<td>Enter Duration:</td>
				<td><form:input type="text" path="duration" /></td>
			</tr>
			
			<tr>
				<td colspan="2"><input type="submit" value="Enroll"/></td>
			</tr>

		</table>
</form:form>






	</center>
</body>
</html>