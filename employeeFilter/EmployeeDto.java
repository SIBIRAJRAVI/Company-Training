package com.ultramain.employeeFilter;

import java.util.Objects;

/**
 * Program is used for getting the employee details
 * 
 * @author sibir
 * @version 1.0
 * @since Sep 11, 2025
 */
public class EmployeeDto {
	public EmployeeDto(int employeeId, String employeeName, int employeeStatus) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeStatus = employeeStatus;
	}
	private int employeeId;
	String employeeName;
	int employeeStatus; // Get 0 and 1 for Status
	/**
	 * @return the employeeId
	 */
	public int getEmployeeId() {
		return employeeId;
	}
	/**
	 * @param employeeId 
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	@Override
	public String toString() {
		return "EmployeeDto [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeStatus="
				+ employeeStatus + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(employeeId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeDto other = (EmployeeDto) obj;
		return employeeId == other.employeeId;
	}
	

}
