package com.crud.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "projectdetails")
public class Project {

	
	/*public String searchString;*/
	/*
	public String getSearchString() {
		return searchString;
	}
	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}*/
	@Id
	@GeneratedValue
	private Integer pid;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public LocalDate getSdate() {
		return sdate;
	}
	public void setSdate(LocalDate sdate) {
		this.sdate = sdate;
	}
	public LocalDate getEdate() {
		return edate;
	}
	public void setEdate(LocalDate edate) {
		this.edate = edate;
	}
	
	@OneToMany(cascade=CascadeType.ALL ,fetch=FetchType.EAGER)
	@JoinColumn(name="pid",referencedColumnName="pid")
//	@JsonIgnore
	private List<Developer> developerss;	

	public List<Developer> getDeveloperss() {
		return developerss;
	}
	public void setDeveloperss(List<Developer> developerss) {
		this.developerss = developerss;
	}

	@Column(name="pname")
    private String pname;
	
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
	@Column(name="start_date")
    private LocalDate sdate;
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
	@Column(name="end_date")
    private LocalDate edate;


/*@Override
public String toString(){
	return "Project[pid="+pid+",pname="+pname+",sdate="+sdate+",edate="+edate+"]";
}*/
}
