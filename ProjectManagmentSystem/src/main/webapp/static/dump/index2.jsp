<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  
  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Home page</title>
</head>

<body>
<h1 align="center" style=color:red>Home page</h1>
<h2><p  align="center" style=color:blue ></h>
Welcome to "Project Management System".<br/>

<a href="${pageContext.request.contextPath}/project/create.html">Add new Project Details </a><br/><br/>
<a href="${pageContext.request.contextPath}/project/paging.html">View all Projects details</a><br/>
<a href="${pageContext.request.contextPath}/developer/createdev.html">Add new developer Details </a><br/><br/>
<a href="${pageContext.request.contextPath}/developer/listdev.html">View all developer details</a><br/>

<br/>
<br/>
</p>
</body>
</html>