package com.rest.model;

public class Employee {
	private String name;
	private Integer id;
	private String team;

	public Employee(Integer id, String name,  String team) {
		super();
		this.name = name;
		this.id = id;
		this.team = team;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
}
