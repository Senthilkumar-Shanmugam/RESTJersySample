package com.learn.restjersy.model;

import java.io.Serializable;

public class LineItem implements Serializable {
	private int lineItemId;
	private float price;
	public int getLineItemId() {
		return lineItemId;
	}
	public void setLineItemId(int lineItemId) {
		this.lineItemId = lineItemId;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

}
