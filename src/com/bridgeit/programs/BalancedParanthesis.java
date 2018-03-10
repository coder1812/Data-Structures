/******************************************************************************
 *  Purpose:  Ensure parentheses must appear in a balanced fashion.
.

 *
 *  @author  Rohini
 *  @version 1.0
 *  @since   06-03-2018
 *
 ******************************************************************************/
package com.bridgeit.programs;
import java.util.Scanner;
public class BalancedParanthesis {
		public static void main(String args[])throws Exception{
		String Expression;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the expression");
		Expression=scanner.next();
	     Stack stck=new Stack();
		 for(int i=0;i<Expression.length();i++) {
			if(Expression.charAt(i)=='(' || Expression.charAt(i)=='{' || Expression.charAt(i)=='[')
				stck.push(Expression.charAt(i));
			 if( (Expression.charAt(i)==')') && (stck.peek()=='('))
				try {
					stck.pop();
				} catch (Exception e) {
					
					System.out.println("Exception");
				}
			 if((Expression.charAt(i)=='}') && (stck.peek()=='{'))
				try {
					stck.pop();
				} catch (Exception e) {
					System.out.println("Exception");
				}
			 if((Expression.charAt(i)==']') && (stck.peek()=='['))
				try {
					stck.pop();
				} catch (Exception e) {
					System.out.println("Exception");
				}	
		}
		if(stck.isEmpty()==true){
		System.out.print("Balanced String");
		}
		else{
			System.out.print("Not a balanced string");
		}
		
	}	
	}

