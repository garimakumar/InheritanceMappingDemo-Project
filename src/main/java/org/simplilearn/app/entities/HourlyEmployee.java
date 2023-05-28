package org.simplilearn.app.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("hourly")
public class HourlyEmployee extends Employee{

	private int HourlySalary;
	
	public HourlyEmployee() {
		//TODO Auto-generated constructor stub
	}

	public HourlyEmployee(int hourlySalary) {
		super();
		HourlySalary = hourlySalary;
	}

	public int getHourlySalary() {
		return HourlySalary;
	}

	public void setHourlySalary(int hourlySalary) {
		HourlySalary = hourlySalary;
	}
	
}
