package com.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="developersdetails")
public class Developer {
	
	@Id
	@GeneratedValue
	/*@Column(name="did")*/
	private Integer did;
	
	public Integer getDid() {
		return did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public Integer getProid() {
		return proid;
	}

	public void setProid(Integer proid) {
		this.proid = proid;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDpos() {
		return dpos;
	}

	public void setDpos(String dpos) {
		this.dpos = dpos;
	}

	@Column(name="pid")
	private Integer proid;
	
	@Column(name="dname")
	private String dname;
	
	@Column(name="dpos")
	private String dpos;

}
