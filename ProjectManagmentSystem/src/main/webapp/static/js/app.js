'use strict'
    var routingApp= angular.module('routingApp',['ngRoute','ngResource'])
        .config(['$routeProvider', function($routeProvider){
            	$routeProvider
                .when('/',{template:'Welcome to Home Page'})
                .when('/AddProject',{templateUrl:'http://localhost:8080/ProjectManagementSystem/project/create.html'})
                .when('/ProjectList',{templateUrl:'http://localhost:8080/ProjectManagementSystem/project/paging.html'})
                .when('/AddDeveloper',{templateUrl:"http://localhost:8080/ProjectManagementSystem/developer/createdev.html"})
                .when('/DeveloperList',{templateUrl:"http://localhost:8080/ProjectManagementSystem/developer/paging1.html"})
                .when('/ViewDeveloperList',
                		{templateUrl:"http://localhost:8080/ProjectManagementSystem/project/viewdev/"})
                .when('/ProjectListAsc',{templateUrl:'http://localhost:8080/ProjectManagementSystem/project/listsort.html'})
                /*.when('/ProjectEdit/:pid',{templateUrl:'http://localhost:8080/dpr-data/project/edit?pid'})
                .when('/DeveloperEdit/:did',{templateUrl:"http://localhost:8080/dpr-data/developer/editdev/:did.html"})*/
                .when('/ProjectListDesc',{templateUrl:'http://localhost:8080/ProjectManagementSystem/project/listsort1.html'})
                .when('/DeveloperListAsc',{templateUrl:'http://localhost:8080/ProjectManagementSystem/developer/listsort.html'})
                .when('/DeveloperListDesc',{templateUrl:'http://localhost:8080/ProjectManagementSystem/developer/listsort1.html'})
                .otherwise({redirectTo:'/'});
            }])
            


