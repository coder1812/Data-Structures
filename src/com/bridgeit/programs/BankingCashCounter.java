/******************************************************************************
 *  Purpose:  Banking Cash Counter where people come in to deposit Cash and withdraw Cash.

 *
 *  @author  Rohini
 *  @version 1.0
 *  @since   06-03-2018
 *
 ******************************************************************************/
package com.bridgeit.programs;
import java.util.Scanner;
public class BankingCashCounter {
	
	
		public static void main(String args[]){
			int amount,people, choice,amountdeposit,amountwithdraw;
			Queue q=new Queue();
			Scanner scanner=new Scanner(System.in);
			System.out.print("Enter the amount in the Bank\n");
			amount=scanner.nextInt();
			System.out.print("\nEnter the number of people in the queue\n");
			people=scanner.nextInt();
			for(int i=0;i<people;i++){
				q.enqueue(i);
			}
			while(!q.isEmpty()) {
			System.out.print("Enter the choice\n1-Deposit\n2-Withdraw\n");
			System.out.print("Person Enter your choice \n");
				choice=scanner.nextInt();
				if(choice==1)
				{
				System.out.print("Enter the amount to be deposited \n");
			     amountdeposit=scanner.nextInt();
				 amount+=amountdeposit;
				 System.out.println("Amount left with bank\n" +amount);
			     System.out.println("Thank You");
			     q.dequeue();
			     System.out.println("people left" );
			     q.show();
				}	
				else if(amount!=0)
				{
				System.out.print("Enter the amount to be witdraw ");
				amountwithdraw=scanner.nextInt();
				if(amountwithdraw>amount) {
					System.out.println("No cash");
					q.dequeue();
				}
				else {
				amount-=amountwithdraw;
				 System.out.println("Amount left with bank" +amount);
			    System.out.println("Take Your cash");
				q.dequeue();	   
				 System.out.println("people left" );
			     q.show();
				}
				
				}
				else{
					 System.out.println("No amount left");
					 q.dequeue();
					 System.out.println("people left" );
				     q.show();
				}
			}
			}
			
	}

