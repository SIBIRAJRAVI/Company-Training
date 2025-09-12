/**
 * 
 */
package com.ultramain.customerTableFilter;

/**
 * 
 * Holds the Data of the customers.
 * 
 * @author siravi
 * @version 1.0
 * @since Sep 12, 2025
 */
public class Customer {
	
	private String customerId;
	private String customerName;
	private String customerEmail;
	
	/**
	 * @param customerId
	 * @param customerName
	 * @param customerEmail
	 */
	public Customer(String customerId, String customerName, String customerEmail) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
	}
	
	/**
	 * @return the customerId
	 */
	public String getCustomerId() {
		return customerId;
	}
	
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	
	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	/**
	 * @return the customerEmail
	 */
	public String getCustomerEmail() {
		return customerEmail;
	}
	
	/**
	 * @param customerEmail the customerEmail to set
	 */
	
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	

}
