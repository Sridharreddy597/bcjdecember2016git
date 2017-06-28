/**
 * 
 */
package com.bcj.webinventory.model;

import java.io.Serializable;

/**
 * @author 
 */
public class Order implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String orderId;
	private String productName;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", productName=" + productName + "]";
	}

}
