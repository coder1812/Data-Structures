/******************************************************************************
 *  Purpose: Functions for LinkedList operations.
 *
 *  @author  Rohini
 *  @version 1.0
 *  @since   10-03-2018
 *
 ******************************************************************************/
package com.bridgeit.programs;

public class LinkedStackLogic {
		LinkedStackNode top;
	    int size ;

	    public LinkedStackLogic()
	    {
	        top = null;
	        size = 0;
	    }    
	  
	    /**
	     * @return empty size of Stack
	     */
	    public boolean isEmpty()
	    {
	        return top == null;
	    }    
	    
	    /**
	     * @return size of a Stack
	     */
	    public int getSize()
	    {
	        return size;
	    }    
	   
	    /**
	     * @param data to be pushed into array.
	     */
	    public void push(int data)
	    {
	        LinkedStackNode nptr = new LinkedStackNode (data, null);
	        if (top == null)
	            top = nptr;
	        else
	        {
	            nptr.setLink(top);
	            top = nptr;
	        }
	        size++ ;
	    }    
	   
	    /**
	     * @return element removed from stack
	     */
	    public int pop()
	    {
	        if (isEmpty() )
	            System.out.println("Stack is full"); ;
	        LinkedStackNode ptr = top;
	        top = ptr.getLink();
	        size-- ;
	        return ptr.getData();
	    }    

	    /**
	     * @return element on the top of Stack
	     */
	    public int peek()
	    {
	        if (isEmpty() )
	        System.out.println("Stack is empty");
	        return top.getData();
	    }    
	 
	    /**
	     * Displays the elements in stack
	     */
	    public void display()
	    {
	        System.out.print("\nStack = ");
	        if (size == 0) 
	        {
	            System.out.print("Empty\n");
	            return ;
	        }
	        LinkedStackNode ptr = top;
	        while (ptr != null)
	        {
	            System.out.print(ptr.getData()+" ");
	            ptr = ptr.getLink();
	        }
	        System.out.println();        
	    }
	/**
	 * @param index return element at the entered index
	 * @return
	 */
	public int getposition(int index) {
		LinkedStackNode ptr = top;
		if(index==0) {
			return top.getData();
		}
		else 
		return 1;
	}
	  
	}
		

