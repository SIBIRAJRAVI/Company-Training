/**
 * 
 */
package com.ultramain.customerTableFilter;

import java.util.ArrayList;
import java.util.List;

/**
 * To display the customer details after the date 01-04-2024 and amount above 8000.
 * 
 * @author siravi
 * @version 1.0
 * @since Sep 12, 2025
 */
public class CustomerMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Customer> customerList = new ArrayList<>();
		customerList.add(new Customer("C1", "Anandakumar Mills", "amills@x.com"));
		customerList.add(new Customer("C2", "Janani Printers", "jprinters@x.com"));
		customerList.add(new Customer("C3", "Vikram Motors", "vmotors@x.com"));
		customerList.add(new Customer("C4", "Symphony Musics", "smusics@x.com"));
		customerList.add(new Customer("C5", "Jyothi Labs", "jlabs@x.com"));
		
		List<CustomerOrder> customerOrderList = new ArrayList<>();
		customerOrderList.add(new CustomerOrder("O101", "C2", "31-01-2024", 23000.50));
		customerOrderList.add(new CustomerOrder("O102", "C2", "31-12-2024" , 10000.75));
		
		List<CustomerFilteredCustom> customerCusFiltList = new ArrayList<>();
		
		for(CustomerOrder customerA )
		
		

		
		

		


		
	}

}
