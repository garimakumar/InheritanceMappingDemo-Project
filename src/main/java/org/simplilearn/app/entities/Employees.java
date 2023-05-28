package org.simplilearn.app.entities;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "EmpId")
public class Employees extends Person{

	private int salary;
	private String dname;
	
	public Employees() {
		//TODO Auto-generated constructor stub
	}

	public Employees(int salary, String dname) {
		super();
		this.salary = salary;
		this.dname = dname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}
	
}
