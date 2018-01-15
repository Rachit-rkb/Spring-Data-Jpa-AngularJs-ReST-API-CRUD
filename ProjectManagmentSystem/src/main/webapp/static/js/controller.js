		
     routingApp.controller('MainCrtl',function($scope,$http,UserService,UserService1,UserService3,UserService4){
     		      $scope.count=0;
     		      $scope.mysearch=false;
     		     $scope.mylist=true;
     		     
     		     
     		    $scope.adddev=UserService4.query();
    	           // for project
    	           if($scope.count==0){}
    	           {
    	        	   $scope.usersr=UserService.inc(1);
    	        	   $scope.count=1;
    	           }

    	           // for developer
    	           if($scope.count==0){}
    	           {
    	        	   $scope.usersr1=UserService1.inc(1);
    	        	   $scope.count=1;
    	           }
    	          $scope.doIncrement=function(c){
    	        	  $scope.count=c+1;
    	        	  var f=$scope.count;
    	        	  var tt=UserService.inc(f);
    	        	  /*$scope.usersr=UserService.inc(f);*/
    	        	  /* console.log(length);*/ 
    	        	   console.log(tt.length ); 
    	        	  /*console.log(tt.$promise);*/
    	        	  console.log(tt.$promise.$$state);
    	        	  console.log(tt.$promise.$$state.status);
    	        	   /*if(tt.length==0)
    	        		  {
    	        		  alert("No more data")
    	        		  $scope.count=$scope.count-1;
    	        		  }*/ 
    	        	  $scope.usersr=tt;
    	        	 /* console.log($scope.usersr)*/
    	        	 $scope.usersr1=UserService1.inc(f);    	        	 
    	          };     

    	          $scope.doDecrement=function(c){
    	        	  if($scope.count>1){
    	        	  $scope.count=c-1;
    	        	  var z=$scope.count;
    	        	  $scope.usersr=UserService.inc(z);
    	        	  $scope.usersr1=UserService1.inc(z);
    	        	  }
    	          }; 
    	          
    	           //Searching code
    	          $scope.searchString=function(searching){
    	        	/*  $scope.searching=searching;
    	        	  var f= $scope.searching;*/
    	        	  $scope.mylist=false;
    	        	  $scope.mysearch=true;
    	        	  var f=searching;
    	        	  $scope.usersr5=UserService3.search(f);
    	        	  
    	          };
    	          $scope.reset=function(){
    	        	  $scope.mylist=true;
    	        	  $scope.mysearch=false;
    	        	  $scope.searching="";
    	          };
    	          
    	         

    	});