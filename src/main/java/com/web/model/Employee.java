package com.web.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
@Id
private int id;
private String name;
private String desg;
private String password;
private double salary;
private double ta;
private double da;
private double hra;
private double pf;
private double gross;
private double net;
public Employee() {
	super();
}
public Employee(int id, String name, String desg, String password, double salary, double ta, double da, double hra,
		double pf, double gross, double net) {
	super();
	this.id = id;
	this.name = name;
	this.desg = desg;
	this.password = password;
	this.salary = salary;
	this.ta = ta;
	this.da = da;
	this.hra = hra;
	this.pf = pf;
	this.gross = gross;
	this.net = net;
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
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public double getTa() {
	return ta;
}
public void setTa(double ta) {
	this.ta = ta;
}
public double getDa() {
	return da;
}
public void setDa(double da) {
	this.da = da;
}
public double getHra() {
	return hra;
}
public void setHra(double hra) {
	this.hra = hra;
}
public double getPf() {
	return pf;
}
public void setPf(double pf) {
	this.pf = pf;
}
public double getGross() {
	return gross;
}
public void setGross(double gross) {
	this.gross = gross;
}
public double getNet() {
	return net;
}
public void setNet(double net) {
	this.net = net;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", desg=" + desg + ", password=" + password + ", salary=" + salary
			+ ", ta=" + ta + ", da=" + da + ", hra=" + hra + ", pf=" + pf + ", gross=" + gross + ", net=" + net + "]";
}
}
