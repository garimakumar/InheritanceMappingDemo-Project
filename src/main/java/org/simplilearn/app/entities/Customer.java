package org.simplilearn.app.entities;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "cid")
public class Customer extends Person{
	
private String OrderName;
private String OrderDate;

public Customer() {
	//TODO Auto-generated constructor stub
}

public Customer(String orderName, String orderDate) {
	super();
	OrderName = orderName;
	OrderDate = orderDate;
}

public String getOrderName() {
	return OrderName;
}

public void setOrderName(String orderName) {
	OrderName = orderName;
}

public String getOrderDate() {
	return OrderDate;
}

public void setOrderDate(String orderDate) {
	OrderDate = orderDate;
}

}
