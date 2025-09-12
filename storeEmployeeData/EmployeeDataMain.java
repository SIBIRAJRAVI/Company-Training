package com.ultramain.storeEmployeeData;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Program to store the employee data on the linkedHashMap
 * 
 * @author siravi
 * @version 1.0
 * @since Sep 11, 2025
 */
public class EmployeeDataMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<EmployeeDto> employeeList=new ArrayList<>();
		int keyCount=0;
		employeeList.add(new EmployeeDto(1,"sibi","Developer"));
		employeeList.add(new EmployeeDto(2,"Siva","Developer"));
		employeeList.add(new EmployeeDto(2,"Siva","Developer"));
//		Printing the Input List
		for(EmployeeDto showEmployeeList : employeeList) {
			System.out.println(showEmployeeList);
		}
		System.out.println("-----------------------------------------------------");
//		filtering the input list by using the set
		Set<EmployeeDto> employeeSet=new HashSet<>();
		for(EmployeeDto employeeNonDuplicate : employeeList ) {
			employeeSet.add(employeeNonDuplicate);
		}
		for(EmployeeDto showEmployeeSet : employeeSet) {
			System.out.println(showEmployeeSet);
		}
		System.out.println("------------------------------------------------------");
		Map<Integer,EmployeeDto> employeeLinkedList=new LinkedHashMap<>();
//		getting the input from the list and putting in the linkedHashMap
		for(EmployeeDto  employeeJoint: employeeSet) {
			employeeLinkedList.put(keyCount, employeeJoint);
			keyCount++;
		}
//		output
		for (Map.Entry<Integer, EmployeeDto> entry : employeeLinkedList.entrySet()) {
            System.out.println(entry);
        }
	}
}
