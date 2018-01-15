package com.crud.controller;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.crud.service.DeveloperService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;



@RestController
@RequestMapping(value="/developer")

public class DeveloperController {
	@Autowired
    private DeveloperService devService;
    
   ObjectMapper objectMapper = new ObjectMapper();


	
	@RequestMapping(value="/createdev", method=RequestMethod.GET)
	public ModelAndView newDevloperPage() {
		ModelAndView mav = new ModelAndView("developer-new", "develop", new Developer());
		return mav;
	}
	
	

@RequestMapping(value="/createdev", method=RequestMethod.POST)
	public ModelAndView createNewDev(@ModelAttribute @Valid Developer developer,
			BindingResult result,
			final RedirectAttributes redirectAttributes) {
		
		if (result.hasErrors())
			return new ModelAndView("developer-new");
		ModelAndView mav = new ModelAndView();
		String message = "New Devloper was successfully created.";
		devService.createdev(developer);
		mav.setViewName("redirect:/index.html");		
		redirectAttributes.addFlashAttribute("message", message);	
		return mav;		
	}
	
	@RequestMapping(value="/listdev", method=RequestMethod.GET)
	public ModelAndView devListPage() throws JsonProcessingException {
	 System.out.println("helo");
		ModelAndView mav = new ModelAndView("developer-list");
		
		List<Developer> devList = devService.findAll();
		
		
		/*
		 String dList = objectMapper.writeValueAsString(devList);
    	System.out.println("1. Convert List of person objects to JSON :");
    	System.out.println(dList); 
		 
		try (FileWriter file = new FileWriter("/Users/rachitb/Documents/file1.json")) {
			file.write(dList);
			System.out.println("Successfully Copied JSON Object to File...");
			System.out.println("\nJSON Object: " +dList);
		} catch (IOException e) {
		
			e.printStackTrace();	
		}*/ 
		mav.addObject("devList", devList);
		return mav;
		}
	
	
	/*Json data*/
	@RequestMapping(value="/restdata", method = RequestMethod.GET)
	public ResponseEntity<List<Developer>> work(@RequestParam(name = "p", defaultValue = "1") int pageNumber){
		 List<Developer> pl=devService.getPage(pageNumber); 
		/*List<Developer> pl=devService.findAll();*/
        System.out.println("restdata");

		return new ResponseEntity<List <Developer>>(pl,HttpStatus.ACCEPTED);
		
	}
	
	@RequestMapping(value = "/paging1", method = RequestMethod.GET)
	public ModelAndView viewCustomers(@RequestParam(name = "p", defaultValue = "1") int pageNumber) {
		ModelAndView mav=new ModelAndView("restfull2");
          System.out.println("paging");
	/*	List<Project> projectList = projectService.getPage(pageNumber);*/
 
		/*mav.addObject("projectList",projectList);*/
 
		return mav;   
	}
	
	
	
	
	
	
	@RequestMapping(value="/editdev/{did}", method=RequestMethod.GET)
	public ModelAndView editDevPage(@PathVariable Integer did) {
		ModelAndView mav = new ModelAndView("developer-edit");
		Developer developer = devService.findById(did);
		mav.addObject("developer", developer);
		return mav;
	}
    	
	

	
	
	
	
	@RequestMapping(value="/editdev/{did}", method=RequestMethod.POST)
	public ModelAndView editDev(@ModelAttribute @Valid Developer developer,
			BindingResult result,
			@PathVariable Integer did,
			final RedirectAttributes redirectAttributes)  {
		
		if (result.hasErrors())
			return new ModelAndView("developer-edit");
		
		ModelAndView mav = new ModelAndView("redirect:/index.html");
		String message = "Developer was successfully updated.";

		devService.update(developer);
		
		redirectAttributes.addFlashAttribute("message", message);	
		return mav;
	}
	
 
	@RequestMapping(value="/deletedev/{did}", method=RequestMethod.GET)
	public ModelAndView deletedev(@PathVariable Integer did,
			final RedirectAttributes redirectAttributes) {
		
		ModelAndView mav = new ModelAndView("redirect:/index.html");		
		
		devService.delete(did);
		String message = "The Developer was successfully deleted.";
		
		redirectAttributes.addFlashAttribute("message", message);
		return mav;
	}
	@RequestMapping(value="/listsort", method=RequestMethod.GET)
	public ModelAndView ProjectListPageSort( String dname) {
		ModelAndView mav = new ModelAndView("developer-list");
		
		List<Developer> devList = devService.findByNameAsc(dname);
		mav.addObject("devList", devList);
		return mav;
		
	}
	
	@RequestMapping(value="/listsort1", method=RequestMethod.GET)
	public ModelAndView ProjectListPageSortdesc( String dname) {
		ModelAndView mav = new ModelAndView("developer-list");
		
		List<Developer> devList = devService.findByNameDesc(dname);
		mav.addObject("devList", devList);
		return mav;
		
	}
}
