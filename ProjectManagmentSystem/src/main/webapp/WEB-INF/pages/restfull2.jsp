



 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/angular-resource/1.4.4/angular-resource.js"></script>
 <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular-route.js"></script> 
 <script src="<c:url value='/static/js/controller.js' />"></script>
<script src="<c:url value='/static/js/service.js' />"></script>
<script src="<c:url value='/static/js/app.js' />"></script> 

</head>


<body>
<h1 align="center" style=color:red>Developer List</h1>
</br>
</br>
<span data-ng-controller="MainCrtl">
<div class="container">
<table  class="table table-bordered"><thead><thead>
<thead>
<tr>
<th style="color:blue ; font-size:150%;">Project id</th>
<th style="color:blue ; font-size:150%;">Developer id</th>
<th style="color:blue ; font-size:150%;">Developer name</th>
<th style="color:blue ; font-size:150%;">Position</th>
<th style="color:blue ; font-size:150%;">Actions</th>
</tr>
</thead>
<tr data-ng-repeat="userp in usersr1">
<td style="font-size:130%;">{{userp.proid}}</td>
 <td style="font-size:130%;">{{userp.did}}</td>
  <td style="font-size:130%;">{{userp.dname}}</td>
   <td style="font-size:130%;">{{userp.dpos}}</td>

  <td style="font-size:130%;">  <a href="http://localhost:8080/ProjectManagementSystem/developer/editdev/{{userp.did}}.html">Edit</a> 
   <!-- <a href="#/DeveloperEdit/{{userp.did}}" style=color:green>edit</a>  --> <br/>
<a href="http://localhost:8080/ProjectManagementSystem/developer/deletedev/{{userp.did}}.html">Delete</a><br/>

</td>  
</tr>

</table>
<input type="button" ng-click="doDecrement(count)" value="<<Previous">
{{count}}
<input type="button" ng-click="doIncrement(count)" value="Next>>">
{{sol}}
 
 
</div>
<!-- <a href="http://localhost:8080/dpr-data/developer/deletedev/listsort.html">Delete</a><br/> -->
 <p align="center"><a href="#/DeveloperListAsc">Sort</a></p> 
</span>
</body></html>