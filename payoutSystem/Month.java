
package com.ultramain.payoutSystem;

/**
 * Store the months enum
 * 
 * @author siravi
 * @version 1.0
 * @since Sep 15, 2025
 */
public enum Month {
	JANUARY(1),
	FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12);
	
	public int number;
	
	/**
	 * @param number
	 */
	Month(int number){
		this.number=number;
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	
	/**
	 * @param number
	 * 
	 * @return Month of the number
	 */
	public static Month changeMonth(int number) {
		for(Month month : Month.values()) {
			if(month.getNumber() == number) {
				return month;
			}
		}
		throw new IllegalArgumentException("hai");
	}
	
}
