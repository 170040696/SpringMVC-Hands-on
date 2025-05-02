package com.example.model;

public class Employee {
	
	private Integer id;
	private String eName;
	private String eCity;
	private double eSalary;
	public Employee(Integer id, String eName, String eCity, double eSalary) {
		super();
		this.id = id;
		this.eName = eName;
		this.eCity = eCity;
		this.eSalary = eSalary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteCity() {
		return eCity;
	}
	public void seteCity(String eCity) {
		this.eCity = eCity;
	}
	public double geteSalary() {
		return eSalary;
	}
	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}
	
	

}
