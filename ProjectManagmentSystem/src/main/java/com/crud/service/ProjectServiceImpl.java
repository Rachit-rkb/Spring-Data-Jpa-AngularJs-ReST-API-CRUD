package com.crud.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crud.model.Project;
import com.crud.repository.ProjectRepository;

@Service
public  class ProjectServiceImpl implements ProjectService {
	
	@Resource
	private ProjectRepository projectRepository;

	@Override
	@Transactional
	public Project create(Project project) {
		Project createdShop = project;
		return projectRepository.save(createdShop);
	}
	
	@Override
	@Transactional
	public Project findById(int id) {
		return projectRepository.findOne(id);
	}

	@Override
	@Transactional
	public Project delete(int id)  {
		Project deletedShop = projectRepository.findOne(id);
		projectRepository.delete(deletedShop);
		return deletedShop;
	}

	@Override
	@Transactional
	public List<Project> findAll() {
		return projectRepository.findAll();
	}
	


	@Override
	@Transactional
	public Project update(Project project)  {
		Project updatedShop = projectRepository.findOne(project.getPid());		
		updatedShop.setPname(project.getPname());
		updatedShop.setSdate(project.getSdate());
		updatedShop.setEdate(project.getEdate());
		return updatedShop;
	}

	public List<Project> getPage(int pageNumber) {
		PageRequest request = new PageRequest(pageNumber - 1, 2, Sort.Direction.ASC, "pid");
		
		return projectRepository.findAll(request).getContent();
	}

	/*@Override
	public List<Project> selectPRoj(String searchString) {
	 
		return projectRepository.findAll(searchString);
	}*/

/*
	   	@Override
		public Page<Project> listAllByPage(Pageable pageable,Sort sort) {
			 return projectRepository.findAll(pageable);
			
		}
	 */
	
	/*	public List<Project> forSorting(){
	return projectRepository.findAll(sortByPid());
}

public Sort sortByPid(){
	return new Sort(Sort.Direction.ASC,"pid");
	
}*/
	
	

	@Transactional(readOnly = true)
	 
    public List<Project> findByNameAsc(String pname) {
        Sort sortSpec = orderByAsc();          
        
        return  projectRepository.findAll(sortSpec);
    }

	
	private Sort orderByAsc() {
	    return new Sort(Sort.Direction.ASC, "pname");
	}
	

	@Transactional(readOnly = true)
 
    public List<Project> findByNameDesc(String pname) {
        Sort sortSpec = orderByDesc();          
        
        return  projectRepository.findAll(sortSpec);
    }

	
	private Sort orderByDesc() {
	    return new Sort(Sort.Direction.DESC, "pname");
	}

	@Override
	public List<Project> findByPname(String searchString) {
		// TODO Auto-generated method stub
		return  projectRepository.findByPname(searchString);
	}
	

}
