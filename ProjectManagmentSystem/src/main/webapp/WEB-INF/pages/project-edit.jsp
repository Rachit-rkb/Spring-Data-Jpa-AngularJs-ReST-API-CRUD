<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

<title>Project Management System</title>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/angular-resource/1.4.4/angular-resource.js"></script>
 <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular-route.js"></script> 
 <script src="<c:url value='/static/js/controller.js' />"></script>
<script src="<c:url value='/static/js/service.js' />"></script>
<script src="<c:url value='/static/js/app.js' />"></script> 

</head>
<body>
<h1 align="center" style=color:red>Edit Project Page</h1>
</br>
<form:form method="POST" commandName="Project" action="${pageContext.request.contextPath}/project/edit/${Project.pid}.html" >
<div class="container">
<table  class="table table-bordered"><thead><thead>
<tbody>
<tr>
<td  style="font-size:150%;">Project name:</td>
<td  style="font-size:150%;"><form:input path="pname" /></td>
<%-- <td><form:errors path="name" cssStyle="color: red;"/></td> --%>
</tr>
<td  style="font-size:150%;">Project start date:</td>
<td  style="font-size:150%;"><form:input path="sdate" /></td>
<%-- <td><form:errors path="name" cssStyle="color: red;"/></td> --%>
</tr>
<tr>
<td  style="font-size:150%;">Project end date:</td>
<td  style="font-size:150%;"><form:input path="edate" /></td>
<%-- <td><form:errors path="emplNumber" cssStyle="color: red;"/></td> --%>
</tr>
<tr>
<td></td>
<td style="font-size:150%;"> <input type="submit" value="Edit" /></td>


</tr>
</tbody>
</table>
</div>
</form:form>
<a href="${pageContext.request.contextPath}/">Home page</a>
</body>
</html>
