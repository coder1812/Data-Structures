/******************************************************************************
 *  Purpose: Functions for LinkedList operations.
 *
 *  @author  Rohini
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
package com.bridgeit.programs;

import java.io.BufferedReader;


public class LinkedList {

	
	Node head;
	
	/**
	 * Function to insert element in linkedlist
	 * @param data to be inserted
	 */
	public  <T>void  insert(T data) {
		Node node=new Node();
		node.next=null;
		node.data=data;
		if(head==null)
		{
			head=node;
		}
			else {
				Node n=head;
				while(n.next!=null)
				{
					n=n.next;
				}
				n.next=node;
			}
		}
	/**
	 * Function to print the linkedlist
	 */
	public <T> void show() {
		Node node=head;
		while(node.next!=null) {
			System.out.println(node.data);
			node=node.next;
		}
		System.out.println(node.data);
	}
	/**
	 * Function to search an element in linkdlist
	 * @param key to be searched
	 * @return
	 */
	public <T> int search(T key) 
		{
			int i=0;
			Node node=head;
			
			while(node.next!=null) 
			{
				if(node.data.equals(key)) 
				{
					
						return i; 
				}
			i++;
			node = node.next;
			}
			return 1;	
		}
	/**
	 * @param list
	 * @return size of list
	 */
	public <T> int size(LinkedList list) {
		Node node=head;
		int count=1;
		while(node.next!=null) {
			count++;
			node=node.next;
	}
		return count;
	}
	/**
	 * @param list  linkedlist
	 * @param size of list
	 */
	public void sort(LinkedList list, int size) {
		Node node=head;
		Node temp;
		Node next=head.next;
	/*	while(node.next!=null) {
			if(node.data<next.data) {
				
			}
		}
	
	*/
	}
	
	
	/**
	 * @param index at which element is to be deleted
	 */
	public<T> void delete(int index) {
		if(index==0)
		{
			head=head.next;
		}
		else
		{
			Node temp1=head;
			Node temp2=null;
			for(int i=0;i<index-1;i++) {
				temp1=temp1.next;
			}
			temp2=temp1.next;
			temp1.next=temp2.next;
			temp2=null;
		}
		}
	/**
	 * @param location
	 * @return string type element at entered location
	 */
	public <T>String getatposition(int location){
		int position=0;
		Node node=head;
		while(position!=location) {
			node=node.next;
			position++;
		}
		return  (String)node.data;
	}
	/**
	 * @param location
	 * @return int type element at entered location
	 */
	public int getatpostn(int location){
		int position=0;
		Node node=head;
		while(position!=location) {
			node=node.next;
			position++;
		}
		return (int) node.data;
	}
	 
	}
	




