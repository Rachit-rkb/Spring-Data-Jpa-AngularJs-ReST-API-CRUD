package com.crud.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.crud.model.Developer;
import com.crud.model.Project;
import com.crud.service.DeveloperService;
import com.crud.service.ProjectService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;




@RestController
@RequestMapping(value="/project")
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	@Autowired
	private DeveloperService delopService;
	
	/*this is for project*/
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public ModelAndView newProjectPage() {
		ModelAndView mav = new ModelAndView("project-new", "Project", new Project());
		return mav;
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public ModelAndView createNewProject(@ModelAttribute @Valid Project project,
			BindingResult result,
			final RedirectAttributes redirectAttributes) {
		
		if (result.hasErrors())
			return new ModelAndView("project-new");
		
		ModelAndView mav = new ModelAndView();
		String message = "New project was successfully created.";
		
		projectService.create(project);
		mav.setViewName("redirect:/index.html");
				
		redirectAttributes.addFlashAttribute("message", message);	
		return mav;		
	}

	

	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public ModelAndView ProjectListPage() {
		ModelAndView mav = new ModelAndView("project-list");
		
		List<Project> ProjectList = projectService.findAll();
		mav.addObject("ProjectList", ProjectList);
		return mav;
		
	}
	

	
	
	@RequestMapping(value="/edit/{pid}", method=RequestMethod.GET)
	public ModelAndView editProjectPage(@PathVariable Integer pid) {
		ModelAndView mav = new ModelAndView("project-edit");
		Project project = projectService.findById(pid);
		project.toString();
		mav.addObject("Project", project);
		return mav;
	}
	
	
	
	
	/*	For Mapping*/
	@RequestMapping(value="/viewdev/{pid}",method=RequestMethod.GET )
	public ModelAndView seeDev(@PathVariable Integer pid){
		
		ModelAndView mav=new ModelAndView("projdev-details");
		/*Developer developer=delopService.findById(pid);*/
		List<Developer> developer= delopService.findByIdPro(pid);
		mav.addObject("developer", developer);
		
		return mav;
	}
	
	
	
	
	
	/*end of mapping*/
	
	
	@RequestMapping(value="/edit/{pid}", method=RequestMethod.POST)
	public ModelAndView editProject(@ModelAttribute @Valid Project project,
			BindingResult result,
			@PathVariable Integer pid,
			final RedirectAttributes redirectAttributes)  {
		
		if (result.hasErrors())
			return new ModelAndView("project-edit");
		
		ModelAndView mav = new ModelAndView("redirect:/index.html");
		String message = "Project was successfully updated.";

	   projectService.update(project);
		
		redirectAttributes.addFlashAttribute("message", message);	
		return mav;
	}
	
	@RequestMapping(value="/delete/{pid}", method=RequestMethod.GET)
	public ModelAndView deleteProject(@PathVariable Integer pid,
			final RedirectAttributes redirectAttributes) {
		
		ModelAndView mav = new ModelAndView("redirect:/index.html");		
		
         projectService.delete(pid);
		String message = "The Project was successfully deleted.";
		
		redirectAttributes.addFlashAttribute("message", message);
		return mav;
	}
	
	
	
	/*Json data*/
	@RequestMapping(value="/restdata", method = RequestMethod.GET)
	public ResponseEntity<List <Project>> work(@RequestParam(name = "p", defaultValue = "1") int pageNumber){
		 List<Project> pl=projectService.getPage(pageNumber); 
		/*List<Project> pl=projectService.findAll();*/
       

		return new ResponseEntity<List <Project>>(pl,HttpStatus.ACCEPTED);
		
	}
	@RequestMapping(value="/restaddnew", method = RequestMethod.GET)
	public ResponseEntity<List <Project>> work22(){
		/* List<Project> pl=projectService.getPage(pageNumber); */
		 List<Project> pl=projectService.findAll(); 
       

		return new ResponseEntity<List <Project>>(pl,HttpStatus.ACCEPTED);
		
	}

	@RequestMapping(value = "/paging", method = RequestMethod.GET)
	public ModelAndView viewCustomers(@RequestParam(name = "p", defaultValue = "1") int pageNumber) {
		ModelAndView mav=new ModelAndView("restfull");
         /* System.out.println("paging");*/
	/*	List<Project> projectList = projectService.getPage(pageNumber);*/
 
		/*mav.addObject("projectList",projectList);*/
 
		return mav;   
	}
	
	//sorting
    
			@RequestMapping(value="/listsort", method=RequestMethod.GET)
			public ModelAndView ProjectListPageSort( String pname) {
				ModelAndView mav = new ModelAndView("project-list");
				
				List<Project> ProjectList = projectService.findByNameAsc(pname);
				mav.addObject("ProjectList", ProjectList);
				return mav;
				
			}
			
			@RequestMapping(value="/listsort1", method=RequestMethod.GET)
			public ModelAndView ProjectListPageSortdesc( String pname) {
				ModelAndView mav = new ModelAndView("project-list");		
				List<Project> ProjectList = projectService.findByNameDesc(pname);
				mav.addObject("ProjectList", ProjectList);
				return mav;
				
			}
	
			@RequestMapping(value="/restsearch/{searchString}", method = RequestMethod.GET)
			public ResponseEntity<List <Project>> search(@PathVariable String searchString){
				 List<Project> pl=projectService.findByPname(searchString); 
				/*List<Project> pl=projectService.findAll();*/   
            	return new ResponseEntity<List <Project>>(pl,HttpStatus.ACCEPTED);
				
			}
	
	
			
			
			
			
			
	
	 /*	@RequestMapping(value="/paging1",method=RequestMethod.GET)
		Page<Project> list( Pageable pageable){
			Page<Project> project = projectService.listAllByPage(0,2,Direction.DESC,"pid");
			 return project;
		} */
	
	
	/*
	@RequestMapping(value="/search", method=RequestMethod.GET)
	public ModelAndView SearchProjectListPage(@RequestParam String search) {
		ModelAndView mav = new ModelAndView("project-list-search");
		
		List<Project> ProjectList = projectService.selectPRoj(search);
		mav.addObject("ProjectList", ProjectList);
		return mav;
		
	}*/
	/*	@RequestMapping(value="/listsort", method=RequestMethod.GET)
	public ModelAndView ProjectListPageSort() {
		ModelAndView mav = new ModelAndView("project-list");
		
		List<Project> ProjectList = projectService.findAll();
		mav.addObject("ProjectList", ProjectList);
		return mav;
		
	}*/
	
	 
/*	@RequestMapping(value="/list", method=RequestMethod.GET)
	public List<Project> ProjectListPagel() {
		ModelAndView mav = new ModelAndView("project-list");
		List<Project> ProjectList = projectService.findAll();
		mav.addObject("ProjectList", ProjectList);
		return ProjectList;
	}
	 */
	
}
