/******************************************************************************
 *  Purpose: Operatioons of LinkedStack node.
 *
 *  @author  Rohini
 *  @version 1.0
 *  @since   10-03-2018
 *
 ******************************************************************************/
package com.bridgeit.programs;

public class LinkedStackNode {
	
	    int data;
	    LinkedStackNode node;
		public LinkedStackNode next;
	 
	    
	    public LinkedStackNode()
	    {
	        node = null;
	        data = 0;
	    } 
	    /**
	     * @param d data to be inserted
	     * @param n newnode
	     */
	    public LinkedStackNode(int d,LinkedStackNode n)
	    {
	        data = d;
	        node = n;
	    }    
	    
	    /**
	     * @param n sets link with node
	     */
	    public void setLink(LinkedStackNode n)
	    {
	        node = n;
	    }    
	    
	    /**
	     * @param d sets data 
	     */
	    public void setData(int d)
	    {
	        data = d;
	    }    
	   
	    public LinkedStackNode getLink()
	    {
	        return node;
	    }    

	    /**
	     * @return data from stack
	     */
	    public int getData()
	    {
	        return data;
	    }
	}


