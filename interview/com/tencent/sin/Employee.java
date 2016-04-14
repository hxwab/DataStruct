package com.tencent.sin;

import java.util.Date;

public class Employee {
	
	private String  name;
	private String id;
	private int premission;
	private Date date;
	
	
	
	public Employee(String name, String id, int premission, Date date) {
		super();
		this.name = name;
		this.id = id;
		this.premission = premission;
		this.date = date;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPremission() {
		return premission;
	}
	public void setPremission(int premission) {
		this.premission = premission;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
