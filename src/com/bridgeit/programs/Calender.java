/******************************************************************************
 *  Purpose: Prints the calender when user enters month and year..
 *
 *  @author  Rohini
 *  @version 1.0
 *  @since   06-03-2018
 *
 ******************************************************************************/
package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class Calender {
	public static void main(String[] args) {
		Utility utility=new Utility();
		int month=Integer.parseInt(args[0]);
		int year=Integer.parseInt(args[1]);
		utility.calendarLogic(month, year);
		}
}



