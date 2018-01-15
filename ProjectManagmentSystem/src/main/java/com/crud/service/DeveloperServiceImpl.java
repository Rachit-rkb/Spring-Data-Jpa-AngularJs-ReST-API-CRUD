package com.crud.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.crud.model.Developer;
import com.crud.repository.DeveloperRepository;

@Service
public class DeveloperServiceImpl implements DeveloperService {

	
	@Resource
	private DeveloperRepository developerRepository;
	
	@Override
	@Transactional
	public Developer createdev(Developer developer) {
		Developer createdDeveloper=developer;
		
		return developerRepository.save(createdDeveloper);
	}

	@Override
	@Transactional
	public Developer delete(int did) {
		Developer deleteDeveloper=developerRepository.findOne(did);
		developerRepository.delete(deleteDeveloper);
		return deleteDeveloper;
	}

	@Override
	@Transactional
	public List<Developer> findAll() {
		return developerRepository.findAll();
	}

	@Override
	@Transactional
	public Developer update(Developer devloper) {
		Developer updateDevloper=developerRepository.findOne(devloper.getDid());
		updateDevloper.setProid(devloper.getProid());
		updateDevloper.setDname(devloper.getDname());
		updateDevloper.setDpos(devloper.getDpos());
		
		return updateDevloper;
	}

	@Override
	@Transactional
	public Developer findById(int did) { 
		return developerRepository.findOne(did);
	}

	
	@Override
	@Transactional
	public List<Developer> findByIdPro(int pid) {
		
		 return  developerRepository.findByPid(pid);
	}
	
	

	@Transactional(readOnly = true)
	 
    public List<Developer> findByNameAsc(String dname) {
        Sort sortSpec = orderByAsc();          
        
        return  developerRepository.findAll(sortSpec);
    }

	
	private Sort orderByAsc() {
	    return new Sort(Sort.Direction.ASC, "dname");
	}
	

	@Transactional(readOnly = true)
 
    public List<Developer> findByNameDesc(String dname) {
        Sort sortSpec = orderByDesc();          
        
        return developerRepository.findAll(sortSpec);
    }

	
	private Sort orderByDesc() {
	    return new Sort(Sort.Direction.DESC, "dname");
	}

	@Override
	public List<Developer> getPage(int pageNumber) {
PageRequest request = new PageRequest(pageNumber - 1, 2, Sort.Direction.ASC, "did");
		
		return developerRepository.findAll(request).getContent();
	}

	

}
