package com.rest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_tab1")
public class Employee {
	@Id
	private int id;
	private String name;
	private double salary;
	private String email;
	private int mobile;
	private String qual;
	private String manager;
	public Employee() {
		super();
	}
	public Employee(int id, String name, double salary, String email, int mobile, String qual, String manager) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.email = email;
		this.mobile = mobile;
		this.qual = qual;
		this.manager = manager;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getQual() {
		return qual;
	}
	public void setQual(String qual) {
		this.qual = qual;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", email=" + email + ", mobile="
				+ mobile + ", qual=" + qual + ", manager=" + manager + "]";
	}

	

}
