            
            
     routingApp.factory('UserService',function($resource)
		{
    	 var fact={ inc:inc};
    	  return fact; 	 
     function inc(k){
    		 var app=k;	 
    		return $resource('http://localhost:8080/ProjectManagementSystem/project/restdata/:user',{user:'@user',p:app}).query();
    	}
		})
	
		
		 .factory('UserService1',function($resource)
		{ var fact={inc:inc};
	    	  return fact;    
	     function inc(k){
	    		 var app=k;
	    		return $resource('http://localhost:8080/ProjectManagementSystem/developer/restdata/:user',{user:'@user',p:app}).query();
	    	}
		})
		
		  .factory('UserService3',function($resource)
				{ var fact={search:search};
		    	  return fact;    
		     function search(k){
		    		 var app=k;
		    		return $resource('http://localhost:8080/ProjectManagementSystem/project/restsearch/:k',{k:app}).query();
		    	}
			})
			
			
			
			.factory('UserService4',function($resource)
		{
    	 
    		return $resource('http://localhost:8080/ProjectManagementSystem/project/restaddnew/:user',{user:'@user'});
    	 
		})
	
			 