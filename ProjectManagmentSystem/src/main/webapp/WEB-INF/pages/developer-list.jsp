 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

<title>Developer List page</title>
</head>
<body>
<h1 align="center" style=color:red>Developer List page</h1>

<div class="container">
<table  class="table table-bordered"><thead>
<thead>
<tr>
<th style="color:blue ; font-size:130%;">Developer id</th>
<th style="color:blue ; font-size:130%;">Project id</th>
<th style="color:blue ; font-size:130%;">Developer name</th>
<th style="color:blue ; font-size:130%;">Position</th>
<th style="color:blue ; font-size:130%;">Actions</th>
</tr>
</thead>
<tbody>
<c:forEach var="develop" items="${devList}">
<tr>
<td style="font-size:130%;">${develop.did}</td>
<td style="font-size:130%;">${develop.proid}</td>
<td style="font-size:130%;">${develop.dname}</td>
<td style="font-size:130%;">${develop.dpos}</td>

<td>
<a href="${pageContext.request.contextPath}/developer/editdev/${develop.did}.html">Edit</a><br/>
<a href="${pageContext.request.contextPath}/developer/deletedev/${develop.did}.html">Delete</a><br/>
</td>
</tr>
</c:forEach>
</tbody>
</table>
</div>
<p align="center"><a href="#/DeveloperListAsc">Sort in Ascending order</a></p>
<p align="center"><a href="#/DeveloperListDesc">Sort in Descending order</a></p>

 </body>
</html>