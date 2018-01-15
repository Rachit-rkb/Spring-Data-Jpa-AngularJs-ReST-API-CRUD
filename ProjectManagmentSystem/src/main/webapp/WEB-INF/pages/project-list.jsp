 
 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

<title>Project List page</title>
</head>
<body>
<h1 align="center" style=color:red>Project List page</h1>



<div class="container">
<table  class="table table-bordered"><thead>
<thead>
<tr>
<th style="color:blue ; font-size:130%;">Project id</th>
<th style="color:blue ; font-size:130%;">Project Name</th>
<th style="color:blue ; font-size:130%;">Project Start Date</th>
<th  style="color:blue ; font-size:130%;" >Project End Date</th>
<th style="color: blue; font-size:130%;">Actions</th>
</tr>
</thead>
<tbody>

<c:forEach var="project" items="${ProjectList}">
<tr>
<td style="font-size:130%;">${project.pid}</td>
<td style="font-size:130%;">${project.pname}</td>
<td style="font-size:130%;">${project.sdate}</td>
<td style="font-size:130%;">${project.edate}</td>
<td>
<a href="${pageContext.request.contextPath}/project/edit/${project.pid}.html">Edit</a><br/>
<a href="${pageContext.request.contextPath}/project/delete/${project.pid}.html">Delete</a><br/>
<a href="${pageContext.request.contextPath}/project/viewdev/${project.pid}.html">View Developers</a><br/>
</td>
</tr>
</c:forEach>
</tbody>
</table>
</div>
<p align="center"><a href="#/ProjectListAsc">Sort in Ascending order</a></p>
<p align="center"><a href="#/ProjectListDesc">Sort in Descending order</a></p>
<%--  <a href="${pageContext.request.contextPath}/project/listsort1.html">sort</a>  --%>

  <br/>
  
<%-- <a href="${pageContext.request.contextPath}/">Home page</a> --%>
</body>
</html>