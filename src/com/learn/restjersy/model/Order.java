package com.learn.restjersy.model;

import java.io.Serializable;
import java.util.List;

public class Order implements Serializable {
	private int orderNo;
	private String orderDate;
	private List<LineItem> lineItem;
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public List<LineItem> getLineItem() {
		return lineItem;
	}
	public void setLineItem(List<LineItem> lineItem) {
		this.lineItem = lineItem;
	}

}
