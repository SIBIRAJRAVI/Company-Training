package com.ultramain.employeeFilter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
* Main class to process the list and get the status of the Employees.
* 
* @author siravi
* @version
* @since
*/
public class EmployeeFilterMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Providing the list of details for the employees
		List<EmployeeDto> employeeList=new ArrayList<>(); 
		employeeList.add(new EmployeeDto(109,"sibi",0));
		employeeList.add(new EmployeeDto(108,"Krishna",0));
		employeeList.add(new EmployeeDto(10,"Kavin",1));
		employeeList.add(new EmployeeDto(89,"sibi ravi",1));
		employeeList.add(new EmployeeDto(89,"sibi ravi",1));
//		Printing the Provided List
		for(EmployeeDto employeeDto : employeeList) {
			System.out.println(employeeDto);
		}
//		Filtering the list by using the set
		Set<EmployeeDto> employeeSet=new HashSet<>();
		for(EmployeeDto empSet :employeeList) {
			employeeSet.add(empSet);
		}
		System.out.println();
//		Printing the Result After Checking the Status
		for(EmployeeDto sendStatus: employeeSet) {
			boolean employeeResult=EmployeeStatusFilter.getStatus(sendStatus.employeeStatus);
			System.out.println(employeeResult? (sendStatus.getEmployeeId()+" "+sendStatus.employeeName+" active")
					:(sendStatus.getEmployeeId()+" "+sendStatus.employeeName+" Non Active"));
		}
	}
}
