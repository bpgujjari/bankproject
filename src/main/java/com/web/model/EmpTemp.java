package com.web.model;

public class EmpTemp {
	private int id;
	private String name;
	private String desg;
	private String password;
	private String cpassword;
	
	private double salary;
	public EmpTemp(int id, String name, String desg, String password,String cpassword, double salary) {
		this.id = id;
		this.name = name;
		this.desg = desg;
		this.password = password;
		this.salary = salary;
		this.cpassword=cpassword;
	}
	public EmpTemp() {
	}
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
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String getCpassword() {
		return password;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

	
	
}
