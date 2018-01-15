 
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 
  <head>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
 
 </head>
<body>
<h1 align="center" style=color:red>Add New Project</h1>
<form:form method="POST" commandName="Project" action="${pageContext.request.contextPath}/project/create.html" >
</br>
</br>
<div class="container">
<table  class="table table-bordered">

<tbody>

<tr>
<td  style="font-size:150%;">Project name</td>
<td><form:input path="pname" /></td>
</tr>

<tr>
<td style="font-size:150%;">Project start date</td>
<td><form:input  path="sdate" /> Please Enter date in format of <B>dd/mm/yyyy</B></td>
<!-- <label>Please Enter date in format of dd/mm/yyyy</label> -->
</tr>
<tr>
<td style="font-size:150%;">Project end date:</td>
<td><form:input path="edate" /> Please Enter date in format of <B>dd/mm/yyyy</B></td>

</tr>
<tr>
<td></td>
<td style="font-size:150%;"><input type="submit" value="Create" /></td>

</tr>
</tbody>
</table>
</div>
</form:form>
</body>
