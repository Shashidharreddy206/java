package com.program.oops;

import com.sun.istack.internal.NotNull;

public class Employee {
	
	private int id;
	
	@NotNull
	@Max(size=30)
	@Min(size=20)
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
