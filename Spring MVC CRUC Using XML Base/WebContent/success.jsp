<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="com.tech.model.Student" %>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
 function addData()
 {
	 alert("add Data  ?")
	 document.myform.action="register.jsp";
	 document.myfrom.submit();
 }
 
 function deleteData() {
	 alert("Delete Data?")
	 document.myform.action="delete";
	 document.myfrom.submit();
}
 function updateData() {
	 alert("Update Data ?")
	 document.myform.action="edit";
	 document.myform.submit();
	
}
 

</script>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body>
<form name="myform">
<table border="3" style="background: silver">
<tr bgcolor="pink">
<td>Select</td>
<td>s_Id</td>
<td>S_Name</td>
<td>address</td>
<td>userName</td>
<td>password</td>
</tr>
<tr>
<c:forEach items="${data}"  var="s">
<td><input type="radio" name="radio" value="${s.sid}"></td>
<td><c:out value="${s.sid}"></c:out></td>
<td><c:out value="${s.sName}"></c:out></td>
<td><c:out value="${s.addrs}"></c:out></td>
<td><c:out value="${s.user}"></c:out></td>
<td><c:out value="${s.pass}"></c:out></td>

</tr>
</c:forEach>

<tr>
<td><input type="submit" value="ADD" style="background: lightgreen" onclick="addData()"></td>
<td><input type="submit" value="DELETE" style="background: red" onclick="deleteData()"></td>
<td><input type="submit" value="Update" style="background: lightble" onclick="updateData()"></td>
</tr>
</table>
</form>
</body>
</html>