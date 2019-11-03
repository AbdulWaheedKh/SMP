package com.javabrains.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class ceo {

	
	
	//Entity is the table nme in the DB 
	//id is the primary key in the db 
	// attributes have the same name as fields in DB
	//these are the private fields so that we can provide encpsolation
	
	
	@Id
	/* @GeneratedValue(strategy = GenerationType.AUTO) */
	private long id;
	/* @NotBlank(message = "Name is mandatory") */
	private String assigntarget;
	/* @NotBlank(message = "Name is mandatory") */
	private String addfeedback;
	/* @NotBlank(message = "Name is mandatory") */
	private String issuewarning;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAssigntarget() {
		return assigntarget;
	}
	public void setAssigntarget(String assigntarget) {
		this.assigntarget = assigntarget;
	}
	public String getAddfeedback() {
		return addfeedback;
	}
	public void setAddfeedback(String addfeedback) {
		this.addfeedback = addfeedback;
	}
	public String getIssuewarning() {
		return issuewarning;
	}
	public void setIssuewarning(String issuewarning) {
		this.issuewarning = issuewarning;
	}
	@Override
	public String toString() {
		return "ceo [id=" + id + ", assigntarget=" + assigntarget + ", addfeedback=" + addfeedback + ", issuewarning="
				+ issuewarning + "]";
	}
	
	
}
