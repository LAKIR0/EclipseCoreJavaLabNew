//import package
package com.ques2;

//importing packages
import java.util.Arrays;
import java.util.Scanner;

//declaring a class
public class Common {
	
	//main started
	public static void main(String[] args) 
	    {
	      //declaring array
		  int[] array1 = new int[5];
	      int[] array2 = new int[5];
	      
	     //scanner object
	      Scanner sc = new Scanner(System.in);
	      
	      //taking input of array 1
	      System.out.println("Enter Array 1 Elements");
	      for(int i=0; i<5; i++)
	      {
	    	  array1[i] = sc.nextInt();
	    	  
	      }
	      
	      //taking input of array 2
	      System.out.println("Enter Array 2 Elements");
	      for(int i=0; i<5; i++)
	      {
	    	  array2[i] = sc.nextInt();
	    	  
	      }
	 
	       //printing array values
	       System.out.println("Array1 : "+Arrays.toString(array1));
	       System.out.println("Array2 : "+Arrays.toString(array2));
	 
	      
	       //Checking common array Elements 
	       for (int i = 0; i < 5; i++)
	        {
	            for (int j = 0; j < 5; j++)
	            {
	                if(array1[i] == (array2[j]))
	                {
	                 
	                 System.out.println("Common element is : "+(array1[i]));
	                 }
	            }
	        }
	       sc.close();
	 
	    }//end of main
	}//end of class
