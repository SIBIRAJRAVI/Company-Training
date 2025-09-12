/**
 * 
 */
package com.ultramain.customerTableFilter;

/**
 * @author siravi
 * @version 1.0
 * @since Sep 12, 2025
 */
public class CustomerOrder {
	private String customerName;
	private String customerID;
	private String orderDate;
	private double orderAmount; //try to use the big decimal after finding the solution
	
	/**
	 * @param orderId
	 * @param customerID
	 * @param orderDate
	 * @param orderAmount
	 */
	public CustomerOrder(String orderId, String customerID, String orderDate, double orderAmount) {
		this.orderId = orderId;
		this.customerID = customerID;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
	}

	/**
	 * @return the orderId
	 */
	public String getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return the customerID
	 */
	public String getCustomerID() {
		return customerID;
	}

	/**
	 * @param customerID the customerID to set
	 */
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	/**
	 * @return the orderDate
	 */
	public String getOrderDate() {
		return orderDate;
	}

	/**
	 * @param orderDate the orderDate to set
	 */
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	/**
	 * @return the orderAmount
	 */
	public double getOrderAmount() {
		return orderAmount;
	}

	/**
	 * @param orderAmount the orderAmount to set
	 */
	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}
	
	
	
	
	

}
