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
<script>
 
/* var demoo=angular.module('routingApp');
 demoo.factory('UserService',function($resource)
		{
	return $resource('http://localhost:8080/dpr-data/project/restdata/:user',{user:'@user'});
		});  */
/* demoo.controller('MainCrtl',function($scope,$http,UserService){
	
	$scope.usersr=UserService.query(); 
	
}); */
</script>
</head>


<body>
<h1 align="center" style=color:red>Project List</h1>
<span data-ng-controller="MainCrtl">

<!--   <script>var value = document.getElementById("searchString").value;
document.getElementById("linkEdit").href = 'roject/search/'</script>
  -->


    
 


</br>
<div class="container" ng-show="mylist">
<form:form>
<input name="searchString" type="text" placeholder="Search by name" ng-model="searching"/> 
<br> 
<input type="button" value="search" ng-click="searchString(searching)"></input>
<input type="button" value="reset" ng-click="reset()"></input>
</form:form>
<br></br>
<table  class="table table-bordered">
<thead>
<tr>
<th style="color:blue ; font-size:130%;">Project id</th>
<th style="color:blue ; font-size:130%;">Project Name</th>
<th style="color:blue ; font-size:130%;">Project Start Date</th>
<th  style="color:blue ; font-size:130%;" >Project End Date</th>
<th style="color: blue; font-size:130%;">Actions</th>
</tr>
</thead>
<tr data-ng-repeat="userp in usersr">
<td style="font-size:130%;">{{userp.pid}}</td>
 <td style="font-size:130%;">{{userp.pname}}</td>
 <td style="font-size:130%;">{{userp.sdate.dayOfMonth+"/"+userp.sdate.monthOfYear+"/"+userp.sdate.year}}</td> 
  <td style="font-size:130%;">{{userp.edate.dayOfMonth+"/"+userp.edate.monthOfYear+"/"+userp.edate.year}}</td> 
 <td> <a href=" /ProjectManagementSystem/project/edit/{{userp.pid}}.html">Edit</a><br/>
<a href=" /ProjectManagementSystem/project/delete/{{userp.pid}}.html">Delete</a><br/>
<!-- <a href=" #/ViewDeveloperList" >View Developers</a><br/>
 -->
  <a href=" /ProjectManagementSystem/project/viewdev/{{userp.pid}}" >View Developers</a><br/>
 
 </td> 
</tr>

</table>

<input type="button" ng-click="doDecrement(count)" value="<<Previous">
{{count}}
<input type="button" ng-click="doIncrement(count)" value="Next>>">
{{sol}}
 </div>

   
   
   
     
   <div class="container" ng-show="mysearch">
<table  class="table table-bordered">
<thead>
<tr>
<th style="color:blue ; font-size:130%;">Project id</th>
<th style="color:blue ; font-size:130%;">Project Name</th>
<th style="color:blue ; font-size:130%;">Project Start Date</th>
<th  style="color:blue ; font-size:130%;" >Project End Date</th>
<th style="color: blue; font-size:130%;">Actions</th>
</tr>
</thead>
<tr data-ng-repeat="userp in usersr5">
<td style="font-size:130%;">{{userp.pid}}</td>
 <td style="font-size:130%;">{{userp.pname}}</td>
 <td style="font-size:130%;">{{userp.sdate.dayOfMonth+"/"+userp.sdate.monthOfYear+"/"+userp.sdate.year}}</td> 
  <td style="font-size:130%;">{{userp.edate.dayOfMonth+"/"+userp.edate.monthOfYear+"/"+userp.edate.year}}</td> 
 <td> <a href=" /ProjectManagementSystem/project/edit/{{userp.pid}}.html">Edit</a><br/>
<a href=" /ProjectManagementSystem/project/delete/{{userp.pid}}.html">Delete</a><br/>
<!-- <a href=" #/ViewDeveloperList" >View Developers</a><br/>
 -->
  <a href=" /ProjectManagementSystem/project/viewdev/{{userp.pid}}" >View Developers</a><br/>
 
 </td> 
</tr>

</table>




   </span>
 
 </div>
   
   
<p align="center"><a href="#/ProjectListAsc">Sort</a></p>
</body></html>