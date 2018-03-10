/******************************************************************************
 *  Purpose: Functions for DeQueue operations.
 *
 *  @author  Rohini
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
package com.bridgeit.programs;

import java.util.Scanner;

public class DeQueue {
				Scanner scanner;
				public DeQueue() {
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
		
		
		
		Node front;
		Node rear;
		
		
		/**
		 * @param data that is inserted in list at front
		 */
		public  <T>void  insertatfront(T data) {
			Node node=new Node();
			node.prev=null;
			node.data=data;
			if(front==null)
			{
				front=rear=node;
			}
				else {
					node.next=front;
					front.prev=node;
					front=node;
				}
			}
		/**
		 * @param data that is inserted in list at end
		 */
		public <T>void insertatend(T data){
			Node node=new Node();
			node.next=null;
			node.data=data;
			if(front==null) {
				front=rear=node;
			}
			else {
				node.prev=rear;
				rear.next=node;
				rear=node;
			}
		}
		/**
		 * @param data to be deleted from front 
		 */
		public <T> void  deleteatfront(T data){
			Node temp;

				temp=front;
				front=front.next;
				front.prev=null;
				
				
				}
	
	/**
	 * @param data to be deleted at rear
	 */
	public <T>void deleteatrear(T data){
			Node temp;
				temp=rear;
				rear=rear.prev;
				if(rear==null)
					front=null;
				else
					rear.next=null;
			
		}
		/**
		 * @param dequeue
		 * @return size of Dequeue
		 */
		public <T>int size(DeQueue dequeue)
		{
			Node node=front;
			int count=1;
			while(node.next!=null) {
				count++;
				node=node.next;
		}
			return count;
		}
		
		/**
		 * Function to print the elements in DeQueue
		 */
		public <T> void show() {
			Node node=front;
			while(node.next!=null) {
				System.out.println(node.data);
				node=node.next;
			}
			System.out.println(node.data);
		}
		/**
		 * @return Character at position in DeQueue
		 */
		public <T> String charAtposition() {
			Node node=rear;
			String string="";
			while(node.prev!=null) {
				string=node.data+string;
				node=node.prev;
			}
			string=node.data+string;
			
			return string;
			
			}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		



