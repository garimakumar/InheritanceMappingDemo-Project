package org.simplilearn.app.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Salaried")
public class SalariedEmployee extends Employee {

	private int salary;
	
	public SalariedEmployee() {
		//TODO Auto-generated constructor stub
	}
	public SalariedEmployee(int salary) {
		super();
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
