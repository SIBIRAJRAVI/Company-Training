package com.ultramain.customerTableFilter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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
		customerOrderList.add(new CustomerOrder("O103", "C1", "22-01-2025", 3000.90));
		customerOrderList.add(new CustomerOrder("O104", "C4", "12-01-2025", 9000.00));
		customerOrderList.add(new CustomerOrder("O105", "C4", "31-12-2024", 6000.00));
		customerOrderList.add(new CustomerOrder("O106", "C4", "31-12-2024", 9000.00));

		double targetAmount = 8000;
		DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate targetDate = LocalDate.parse("01-04-2024" , formater);
		
		Map <Customer , Double> statsMap = new HashMap<>();
		for(Customer customerLoop : customerList) {
			double individualTotal = 0;
			for(CustomerOrder customerOrderLoop : customerOrderList ) {
				if(customerLoop.getCustomerId() == customerOrderLoop.getCustomerID() 
						&& (customerOrderLoop.getOrderDate()).isAfter(targetDate)
						&& customerOrderLoop.getOrderAmount() > targetAmount ) {	
					individualTotal += customerOrderLoop.getOrderAmount();				
				}
			}
			statsMap.put(customerLoop, individualTotal);
		}
		for(Entry<Customer, Double> entry : statsMap.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println("The Total Amount After Filter : " + entry.getValue());
			System.out.println("--------------------------");
		}
			
	}

}
