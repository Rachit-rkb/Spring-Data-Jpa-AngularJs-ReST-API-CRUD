 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

<title>Project Management System</title>
</head>
<body>
<h1 align="center" style=color:red>Edit Developer Page</h1>
<form:form method="POST" commandName="developer" action="${pageContext.request.contextPath}/developer/editdev/${developer.did}.html" >
<div class="container">
<table  class="table table-bordered"><thead><thead>

<tbody>
<tr>

<form:hidden path="proid" />
<td style="font-size:150%;">Developer name:</td>
<td style="font-size:150%;"><form:input path="dname" /></td>

</tr>
<td style="font-size:150%;">Developer position:</td>
<td style="font-size:150%;"><form:input path="dpos" /></td>

</tr>

<tr>
<td></td>
<td style="font-size:150%;"><input type="submit" value="Edit" /></td>


</tr>
</tbody>
</table>
</div>
</form:form>
<a href="${pageContext.request.contextPath}/">Home page</a>
</body>
</html>
