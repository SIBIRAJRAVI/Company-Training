
package com.ultramain.payoutSystem;

/**
* Template to store the payout details
* @author siravi
* @version
* @since
*/
 class Payout {
	private int employeeId;
	private String employeeName;
	Department departmentEnum;
	Month monthEnum;
	private double netPay;
	
	/**
	 * @param employeeId
	 * @param employeeName
	 * @param departmentEnum
	 * @param monthEnum
	 * @param netPay
	 */
	public Payout(int employeeId, String employeeName, Department departmentEnum, Month monthEnum, double netPay) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.departmentEnum = departmentEnum;
		this.monthEnum = monthEnum;
		this.netPay = netPay;
	}

	/**
	 * @return the employeeId
	 */
	public int getEmployeeId() {
		return employeeId;
	}

	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	/**
	 * @return the departmentEnum
	 */
	public Department getDepartmentEnum() {
		return departmentEnum;
	}

	/**
	 * @param departmentEnum the departmentEnum to set
	 */
	public void setDepartmentEnum(Department departmentEnum) {
		this.departmentEnum = departmentEnum;
	}

	/**
	 * @return the monthEnum
	 */
	public Month getMonthEnum() {
		return monthEnum;
	}

	/**
	 * @param monthEnum the monthEnum to set
	 */
	public void setMonthEnum(Month monthEnum) {
		this.monthEnum = monthEnum;
	}

	/**
	 * @return the netPay
	 */
	public double getNetPay() {
		return netPay;
	}

	/**
	 * @param netPay the netPay to set
	 */
	public void setNetPay(double netPay) {
		this.netPay = netPay;
	}

	@Override
	public String toString() {
		return "Payout [employeeId=" + employeeId + ", employeeName=" + employeeName + ", departmentEnum="
				+ departmentEnum + ", monthEnum=" + monthEnum + ", netPay=" + netPay + "]";
	}
	
	


}
