



<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
   

<script src="<c:url value='/static/js/app.js' />"></script>
               <script src="<c:url value='/static/js/service.js' />"></script>
               <script src="<c:url value='/static/js/controller.js' />"></script>
<title>New Project page</title>
</head>
<body>
<h1 align="center" style=color:red>Add New Developer</h1>
<form:form method="POST" commandName="develop" action="${pageContext.request.contextPath}/developer/createdev.html" >
</br>
<br></br>
<div class="container">
<span data-ng-controller="MainCrtl">
<table class="table table-bordered">
<tbody><tbody>


<tr>
<td style="font-size:150%;">Developer name</td>
<td><form:input path="dname" /></td>
</tr>
<tr>
<td style="font-size:150%;">Project  Name</td>
<td><select ng-model="ProjectId">
<option ng-repeat="x in adddev" value="{{x.pid}}">{{x.pname}}</option>
</select>{{ProjectId}} 


<form:hidden value="{{ProjectId}}" path="proid" />   </td>

<%-- <td><form:hidden path= {{ProjectId}}/> </td> --%>

</tr>
<tr>
<td style="font-size:150%;">Developer Designation</td>
<td><form:input path="dpos" /></td>
</tr>

<tr>
<td></td>
<td style="font-size:150%;"><input type="submit" value="Create" align="center"/></td>
</tr>


 

</tbody>
</table>
</span>
</div>

</form:form>

</body>
</html>