<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
hello
</body>
</html>
 --%>


       <!-- Project-  Developer- list -->
       
       
       <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Project List page</title>
</head>
<body>
<h1 align="center" style=color:red>Project List page</h1>
<table style="text-align: center;" border="1px" cellpadding="0" cellspacing="0"  align="center">
<thead>
<tr>
<th style=color:blue>Project id</th><th style=color:blue>Developer Id</th><th style=color:blue>Developer Name</th><th  style=color:blue >Developer position</th><!-- <th>Actions</th> -->
</tr>
</thead>
<tbody>
<c:forEach var="project" items="${developer}">
<tr>
<td>${project.proid}</td>
<td>${project.did}</td>
<td>${project.dname}</td>
<td>${project.dpos}</td>


<td>
</td>
</tr>
</c:forEach>
</tbody>
</table>
<a href="${pageContext.request.contextPath}/">Home page</a>
<a href="${pageContext.request.contextPath}/project/generate.html"><input type="button" value="Generate Report" /></a>
</body>
</html>

       
       
       
       <!--End-  Project- Developer- list -->








