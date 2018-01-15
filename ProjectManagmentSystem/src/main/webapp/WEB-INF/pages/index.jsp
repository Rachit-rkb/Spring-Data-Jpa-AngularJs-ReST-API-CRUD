 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html ng-app='routingApp'>
    <head>
        <title>Project Management System</title>             
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/angular-resource/1.4.4/angular-resource.js"></script> 
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular-route.js"></script>
          <script src="<c:url value='/static/js/app.js' />"></script>
               <script src="<c:url value='/static/js/service.js' />"></script>
               <script src="<c:url value='/static/js/controller.js' />"></script>
    </head>
    <body > 
     <h2><p  align="center" style=color:blue >"Project Management System"</p></h>  
   </br>
   <h4>
         <p style="font-size:130%;" align="center">
           <a href="/"></a>
           <a href="#/AddProject" style=color:green> Add new Project Details</a>
           &nbsp  &nbsp <a href="#/ProjectList" style=color:green>  View all Projects details</a>          
           &nbsp  &nbsp <a href="#/AddDeveloper" style=color:green>  Add new developer</a>
           &nbsp  &nbsp<a href="#/DeveloperList" style=color:green>  View all developer details</a>                  
           </p>
        </h4>
        </h2>
        </br>
       
        <div ng-view="">
       <h1 style=color:blue>  <i>${message="hello"}</i></h1>
         </div>
    </body>
</html> 









