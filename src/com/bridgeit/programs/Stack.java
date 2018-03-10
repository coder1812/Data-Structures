/******************************************************************************
 *  Purpose: Stack Operations Functions.
 *
 *  @author  Rohini
 *  @version 1.0
 *  @since   06-03-2018
 *
 ******************************************************************************/
package com.bridgeit.programs;

public class Stack {
		int stack[]=new int[10];
		int top=0;
		/**
		 * Function to Push the data into stack
		 * @param data to be pushed
		 */
		public void push(int data){
			if(top==stack.length){
				System.out.print("error");
			}
				else{
					stack[top]=data;
					top++;
				}
			
		}
		 /**
		  * Function that pops the data from the stack
		 * @return data popped
		 */
		public int pop(){
			 int data=0;
			 if(isEmpty())
			 {
				 System.out.print("Error");
			}
			 else{
				 data=0;
				 top--;
				 data=stack[top];
				 stack[top]=0;
				 
				  }
			return data;
		 }
		 /**
		  * Function to point on the top element of stack
		 * @return element to which peek in pointing
		 */
		public int peek(){
			 int data;
			 data=stack[top-1];
			 return data;

			   
		 }
		 /**
		  * Function to calculate size of stack
		 * @return size of stack
		 */
		public int size(){
			 return top;
		 }
		 public void show(){
			 for(int n:stack){
				 System.out.print(n+" ");
			 }
		 }
		 /**
		  * Function to check stack is empty or not
		 * @return empty or not
		 */
		public boolean isEmpty(){
			 return top<=0;
		 }
          public void getdata() {
        	  
          }
		}

