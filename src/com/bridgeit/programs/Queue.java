/******************************************************************************
 *  Purpose: Functions of Queue Operations.
 *
 *  @author  Rohini
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
package com.bridgeit.programs;

public class Queue {
	int queue[]=new int[5];
	int size,front,rear;
	
	public void enqueue(int data){
		if(!isFull()){
			queue[rear]=data;
			rear=(rear+1)%5;
			size++;
			}
		else{
			System.out.print("Full");
		}
	}
	public void show(){
		
		for(int i=0;i<size;i++){
			System.out.print(queue[front+i%5] +"  ");
			
		}
		System.out.print(" \n ");
//	for(int n:queue){
//		System.out.print(queue[n]+ "  ");
//	}	
	}
	public int dequeue(){
		int data=queue[front];
		if(!isEmpty()){
			front=(front+1)%5;
			size--;
		}
		else{
			System.out.print("Empty");
		}
		return data;
		}
	public int getsize(){
		return size;
	}
	public boolean isEmpty(){
		return getsize()==0;
	}
	public boolean isFull(){
		return getsize()==5;
	}
}

