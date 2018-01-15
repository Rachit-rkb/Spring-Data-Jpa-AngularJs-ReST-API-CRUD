package com.crud.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.crud.model.Project;

public interface ProjectService {
	
	public Project create(Project project);
	public Project delete(int pid);
	public List<Project> findAll();
/*	public List<Project> findAll(Sort sort); */
/*	Page<Project> listAllByPage(Pageable pageable);*/
	public Project update(Project project) ;
	public Project findById(int pid);
	public List<Project> getPage(int pageNumber);

	//sorting
		public List<Project> findByNameAsc(String name);
		public List<Project> findByNameDesc(String name);
		//Searching
		public List<Project> findByPname(String searchString);
}
