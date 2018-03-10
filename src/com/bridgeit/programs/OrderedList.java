/******************************************************************************
 *  Purpose:  Read from file the list of Words and take user input to search a Text.
 *
 *  @author  Rohini
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
package com.bridgeit.programs;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class OrderedList {
	public static void main(String args[]) throws IOException {
		File file = new File("orderedList.txt");
		Scanner scanner=new Scanner(file);
		
	    
	 
		
	    LinkedList list=new LinkedList();
	    while(scanner.hasNextLine()) 
	    {
	    	String array=scanner.next();
	    	list.insert(array);
	    	
	    }
	     list.show();
	     scanner.close();
	     
	     scanner=new Scanner(System.in);
	     System.out.println("Enter the element to be searched");
	     int key=scanner.nextInt();
	     System.out.println(key);
	     int answer=list.search(String.valueOf(key));
	     if(answer==1)
	     {
	    	 list.insert(key);
	    	 System.out.println("Not Found-So after adding your likedlist is ");
	    	 list.show();
	   	/* for(Integer i=0;i<list.size(list);i++){
	    		    writer.write(list.getatpostn(i));
	    		    
	    		}
	    	 writer.flush();
	    	 writer.close();
	     }*/
	     }
	     else
	     {
	    	 list.delete(answer);
	    	 System.out.println("Found-So after deleting your linkedlist is ");
	    	 list.show();
	    	 /*for(Integer i=0;i<list.size(list);i++){
	    		    writer.write(list.getatpostn(i));
	    		} 
	     writer.flush();	 
	     writer.close();
	     }*/
	   
	     
	        
	       }

	     scanner.close(); 
	}
}