package com.crud.service;

import java.util.List;

import com.crud.model.Developer;

public interface DeveloperService {
	
	public Developer createdev(Developer developer);
	public Developer delete (int did);
	public List<Developer> findAll();
	public Developer update(Developer developer);
	public Developer findById(int did);
	public List<Developer> findByIdPro( int pid);
	public List<Developer> findByNameAsc(String dname);
	public List<Developer> findByNameDesc(String name);
	public List<Developer> getPage(int pageNumber);
}
