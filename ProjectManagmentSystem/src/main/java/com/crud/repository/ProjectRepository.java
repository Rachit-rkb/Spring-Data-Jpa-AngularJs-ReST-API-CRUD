package com.crud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.crud.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

	/*@Query("Select p from projectdetails p where p.pname like %:searchstring%")*/
	/*List<Project> findByPnameOr*/
/*	@Query("SELECT r FROM projectdetails r WHERE "
	        + "r.pid LIKE '%' || :searchString || '%' "
	        + "OR r.pname '%' || :searchString || '%' ")*/
	
	/*public List<Project> selectProject(@Param("searchString")String searchString); */
	
	public List<Project> findByPname(String searchString);
}
