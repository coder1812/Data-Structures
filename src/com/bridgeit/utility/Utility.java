package com.bridgeit.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.bridgeit.programs.LinkedStackLogic;

public class Utility {
	Scanner scanner;
	public Utility() {
		scanner =new Scanner(System.in);
	}
	/**
	 * Function for scanning user entered string
	 * @return scanned string value
	 */
		
	public String inputString()
	{
		try {
			return scanner.next();
		}catch(Exception e) {
			System.out.println(e);
		}
		return "";
	}
	/**
	 * Function for scanning user entered integer value
	 * @return scanned integer value
	 */
	public int inputInteger()
	{
		try {
			return scanner.nextInt();
		}catch(Exception e) {
			System.out.println(e);
		}
	return 1;

	}

	public static void calendarLogic(int month,int year) {
	
		int days[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if(month==2 && isLeap(year)==true)
			days[1]=29;
		int result=getday(month, 1, year);
		int month1=days[month];
		int column=month1+1;
		int rows=8;
		String array[][]=new String[rows][column];
		
		
		for (int i = 0; i <7; i++)
		{
			for (int j = 0; j <7; j++)
			{
				array[i][j]="  ";
			}
			
		}
		array[0][0]="s";array[0][1]="m";array[0][2]="t";array[0][3]="w";array[0][4]="th";array[0][5]="f";array[0][6]="sa";
		for (int i = 0; i <7; i++)
		{
			for (int j = 0; j <7; j++)
			{
				System.out.print("\t "+ array[i][j]);
				
			}
			
		}
		System.out.println();
		try {
			for(int i=0;i<result;i++)
			{
		for (int k = 0; k <result; k++) 
		{
			System.out.print("\t ");
		}
			for (int j = 1; j <=column; j++)
			{
				array[i][j]=Integer.toString(j);
				System.out.print("\t "+array[i][j]);
				
				if(((j+result)%7==0)||(j==column))
				{
					System.out.println();
				}
			}
		}	
		}
		catch(Exception e) {
		System.out.println(" ");	
		}
		
		}

	
	
	public static int  getday(int month,int date,int year)
	{
		int yo, mo, x, dd;
		yo = (int) year - ((14 - month) / 12);
		x = (int) (yo +( yo / 4) -( yo / 100) +( yo / 400));
		mo = (int) month + (12 * ((14 - month) / 12)) - 2;
		dd = (int) (date + x + ((31 * mo) / 12)) % 7;
			return dd;
	}



		
	public static boolean isLeap(int year) {
		if((year%4==0 && year%100!=0)|| year%400==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void primeNumbers2D() {
		/*int  l=0,m=-1,i,mflag,j,k=1,z=0;
	    String[][] array1=new String[1][100];
		for(i=0;i<array1.length-1;i++)
		{
			for(j=0;j<array1.length-1;j++) {
				array1[i][j]=" ";
			}
		}
		
		array1[0][0]=Integer.toString(2);
		for( i=3;i<=1000;i++)
		{
			mflag=1;
			for(j=2;j<=i/2;j++)
			{
				if(i%j==0) 
				{
				mflag=0;
				break;
				}
			}
			if(mflag==1) {
				
				{   m++;
					array1[1][m]=Integer.toString(i);
					
				}
			}
		}
		for(i=0,j=0;j<100;j++) {
			System.out.println(array1[i][j]);
		}
		*/	}

	public  static void anagram1(int i1, int i2) {
		int mcount = 0;
		String string1 = Integer.toString(i1);
		String string2 = Integer.toString(i2);
		char[] characterarray1 = string1.toCharArray();
		char[] characterarray2 = string2.toCharArray();

		for (int i = 0; i < string1.length(); i++) {
			for (int j = 0; j < string2.length(); j++) {
				if (characterarray1[i] == characterarray2[j]) {
					mcount++;
				} else {

				}
			}
		}
		if (mcount == string1.length())
			System.out.println(string1+" "+string2);
	}


		

	public static void LinkedListStack() {
		int  i,mflag,j;
		LinkedStackLogic stack1=new LinkedStackLogic();
		LinkedStackLogic stack2=new LinkedStackLogic();
		
		for( i=3;i<=1000;i++)
		{
			mflag=1;
			for(j=2;j<=i/2;j++)
			{
				if(i%j==0) 
				{
				mflag=0;
				break;
				}
			}
			if(mflag==1)
			{
				
				stack1.push(i);
			}
	        j=stack1.getposition(0);
			System.out.println(j);
			/*for( i = 0; i < stack1.getSize()-1; i++) {   
			    for(j=0;j<stack1.getSize()-1;j++) {
			    	anagram1(stack1.getatposition(j),stack1.getatposition(j+1));
			    }*/
		
	}
		
	}
		
	
}






















