/******************************************************************************
 *  Purpose:  Checks whether entered string is Palindrome or not.
 *  @author  Rohini
 *  @version 1.0
 *  @since   06-03-2018
 *
 ******************************************************************************/
package com.bridgeit.programs;

public class Palindrome {
	public static void main(String args[]) {
		String string1,string2;

		DeQueue dequeue1=new DeQueue();
		DeQueue dequeue2=new DeQueue();
		System.out.println("Enter the string ");
		string1=dequeue1.inputString();
		char[] characterarray1=string1.toCharArray();
		for(int i=characterarray1.length-1;i>=0;i--) {
			dequeue1.insertatend(string1.charAt(i));
		}
		string2=dequeue1.charAtposition();
		
		if(string1.equals(string2)) 
			System.out.println("Palindrome");
		else 
			System.out.println("Not a palindrome");
		
		}
		}
	
	
	

