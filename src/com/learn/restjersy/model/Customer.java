package com.learn.restjersy.model;

import java.io.Serializable;
import java.util.List;

public class Customer implements Serializable {

	private String customerNo;
	private String name;
	
	private List<Order> orders ;

	public String getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
}
