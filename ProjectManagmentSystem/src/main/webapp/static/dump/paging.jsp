 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<title>Project List page</title>
</head>
<body>
<h1 align="center" style=color:red>Project List page</h1>

<!-- <script>var value = document.getElementById("searchString").value;
document.getElementById("linkEdit").href = 'roject/search/'</script>
 -->


<%--   <form:form action="${pageContext.request.contextPath}/project/search" commandName="searchdata">
<input name="searchString" type="text">

<form:button value="search"></form:button>
</form:form>
 --%>
<%--  <form> 
<input type="text" name="searchString1" value="cn"></input>
    <a href="${pageContext.request.contextPath}/project/viewdev/searchString.html?searchString1='cn' " >
    <input type="button" value="search"></input>
    </a>
<form> --%>

<table style="text-align: center;" border="1px" cellpadding="0" cellspacing="0"  align="center">
<thead>
<tr>
<th style=color:blue>Project id</th><th style=color:blue>Project Name</th><th style=color:blue>Project Start Date</th><th  style=color:blue >Project End Date</th><th>Actions</th>
</tr>
</thead>
<tbody>
${ProjectList}
<c:forEach var="project" items="${projectList}">
<tr>
<td>${project.pid}</td>
<td>${project.pname}</td>
<td>${project.sdate}</td>
<td>${project.edate}</td>
<td>
<a href="${pageContext.request.contextPath}/project/edit/${project.pid}.html">Edit</a><br/>
<a href="${pageContext.request.contextPath}/project/delete/${project.pid}.html">Delete</a><br/>
<a href="${pageContext.request.contextPath}/project/viewdev/${project.pid}.html">View Developers</a><br/>
</td>
</tr>
</c:forEach>
</tbody>
</table>


 <a href="paging?p=1">1</a>   
   <a href="paging?p=2">2</a>   
   <a href="paging?p=3">3</a> 
   <a href="paging?p=4">4</a>  
<a href="${pageContext.request.contextPath}/">Home page</a>
</body>
</html>