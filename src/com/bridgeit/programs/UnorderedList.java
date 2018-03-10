/******************************************************************************
 *  Purpose:  Read from file the list of Words and take user input to search a Text.
 *  @author  Rohini
 *  @version 1.0
 *  @since   06-03-2018
 *
 ******************************************************************************/
package com.bridgeit.programs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.util.Arrays;
//import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;



public class UnorderedList {
	public static  void main(String args[]) throws IOException {
		File file = new File("unorderlist.txt");
		FileWriter writer = new FileWriter("unoderlist.txt");
		String line,key;
		int answer;
		Scanner scanner=new Scanner(file);
		BufferedReader bufferedreader = new BufferedReader(new FileReader(file));
	    LinkedList list=new LinkedList();
	    line=bufferedreader.readLine();
	    while(line!=null) {
	    	String[] array=line.split(" ");
	    	for(String x:array) {
	    		list.insert(x);
	    	}
	    	line=bufferedreader.readLine();
	    	}
	    bufferedreader.close();
	     list.show();
	

	    scanner.close();
	     scanner=new Scanner(System.in);
	     System.out.println("Enter the element to be searched");
	     key=scanner.nextLine();
	     answer=list.search(key);
	     if(answer==1)
	     {
	    	 list.insert(key);
	    	 System.out.println("Not Found-So after adding your likedlist is ");
	    	 list.show();
	    	 for(int i=0;i<list.size(list);i++){
	    		    writer.write(list.getatposition(i));
	    		    
	    		}
	    	 writer.flush();
	    	 writer.close();
	     }

		  
	     
	     else {
	    	 list.delete(answer);
	    	 System.out.println("Found-So after deleting your linkedlist is ");
	    	 list.show();
	    	 for(int i=0;i<list.size(list);i++){
	    		    writer.write(list.getatposition(i));
	    		} 
	     writer.flush();	 
	     writer.close();
	     }
	     
	     
	       scanner.close();
	       
       }
}
	 
	