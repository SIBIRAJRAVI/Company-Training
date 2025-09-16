package com.ultramain.payoutSystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * To calculate the payout based on the filter.
 * 
 * @author siravi
 * @version 1.0
 * @since Sep 15, 2025
 */
public class PayoutMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Payout> payoutList = new ArrayList<>();
		Map<Department , Double> departmentTotalMap = new HashMap();

		try(BufferedReader bufferReader = new BufferedReader(new FileReader ("C:\\Users\\sibir\\Desktop\\Payout.txt"))){
			String line;
			bufferReader.readLine();
			while((line = bufferReader.readLine()) !=null) {
				String [] splitArray=line.split(",");
				payoutList.add(new Payout((Integer.parseInt(splitArray[0])),splitArray[1],
						Department.valueOf(splitArray[2]),
						Month.changeMonth(Integer.parseInt(splitArray[3])),Double.parseDouble(splitArray[4])));
				if(Month.changeMonth(Integer.parseInt(splitArray[3])) .equals("AUGUST")){
					departmentTotalMap.put(Department.valueOf(splitArray[2]), departmentTotalMap.getOrDefault(Department.valueOf(splitArray[2]) , 0.0) + Double.parseDouble(splitArray[4]));
				}
			}
			for(Entry<Department, Double> entry : departmentTotalMap.entrySet()) {
				System.out.println(entry);
				
			}
			
			
			
			
		} catch(Exception e) {
			
		}
	}

}
