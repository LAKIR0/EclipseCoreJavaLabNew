//import package
package com.ques3;

//declaring a class
public class Marks {
	
		//main started
	    public static void main(String arg[])
	    {
	        //name array
	    	String names[] = { "Pranjal", "Saina", "Sandeep", "Shemab", "Suman" };
	        //marks array
	    	int marks[] = { 100, 90, 80, 70, 60 };
	        //rank array
	    	int rank[] = { 1, 2, 3, 4, 5 };
	        
	        //printing output
	    	for(int i = 0; i < names.length; i++)
	        {
	            System.out.println( names[i] + " has secured rank " + rank[i] + " got " + marks[i] + " marks." );
	        }//end of for loop    
	    }//end of main
	
}//end of class
