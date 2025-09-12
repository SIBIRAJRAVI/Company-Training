package com.ultramain.employeeFilter;

/**
 * Class to check the status of the employee.
 * 
 * @author siravi
 * @version 1.0
 * @since Sep 11, 2025
 */
public class EmployeeStatusFilter {
	/**
	 * @param num
	 * @return shows the status of the employee
	 */
	public static boolean getStatus(int num) {
		if(num==0) {
			return true;
		}
		return false;
	}
}
