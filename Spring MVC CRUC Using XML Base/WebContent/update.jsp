<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Student</title>
</head>
<body>
<pre>
<form action="update">

Student Id=<input type=     "hidden" name="sid" value="${data.sid}">

Student Name=<input type=   "text" name="sName" value="${data.sName}">

Student Address=<input type="text" name="addrs" value="${data.addrs}">

UserName=<input type=       "text" name="user" value="${data.user}">

Password=<input type=       "text" name="pass" value="${data.pass}">

<input type="submit" value="EDIT" style="background: lightblue">
</form>
</pre>
</body>
</html>