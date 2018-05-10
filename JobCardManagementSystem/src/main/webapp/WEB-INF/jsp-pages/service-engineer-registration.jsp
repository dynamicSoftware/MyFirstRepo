<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Service Engineer Registration Page</title>
</head>
<body>
	<form:form action="engineer-registered" commandName="serviceEngineer" method="post">
			<table align="center">
					<tr>
						<td> <form:label path="userName">User Name : </form:label> </td>
						<td> <form:input path="userName"/> </td>
					</tr>
					<tr>
						<td> <form:label path="userEmail">Email : </form:label> </td>
						<td> <form:input path="userEmail"/> </td>
					</tr>
					<tr>
						<td> <form:label path="userPassword">Password : </form:label> </td>
						<td> <form:password path="userPassword"/> </td>
					</tr>
					<tr>
						<td> <form:label path="userRole">User Role : </form:label> </td>
						<td> <form:select path="userRole">
								<form:option value="none">-- Select Role --</form:option>
								<form:option value="Operator">Operator</form:option>
								<form:option value="ServiceEngineer">Service Engineer</form:option>
						</form:select> </td>
					</tr>
					<tr>
						<td> <form:label path="userContact"> Contact No : </form:label> </td>
						<td> <form:input path="userContact"/> </td>
					</tr>
					<tr>
						<td> <form:label path="street"> Street : </form:label> </td>
						<td> <form:textarea path="street" cols="20" rows="3"/> </td>
					</tr>
					<tr>
						<td> <form:label path="city"> City : </form:label> </td>
						<td> <form:select path="city">
						<form:options items="${listOfCities}"/>
								<%-- <form:option  value="none">- Select City -</form:option> --%>
						 </form:select></td>
					</tr>
					<tr>
						<td> <form:label path="state"> State : </form:label> </td>
						<td> <form:input path="state"/> </td>
					</tr>
					<tr>
						<td> <form:label path="">User Name : </form:label> </td>
						<td> <form:radiobutton path="userGender" value="male" label="Male"/>
						<form:radiobutton path="userGender" value="female" label="Female"/></td>
					</tr>
					<tr>
						<td><input type="submit" value="Register"> </td>
						<td><input type="reset" value="Reset"></td>
					</tr>
			</table>
	</form:form>
</body>
</html>