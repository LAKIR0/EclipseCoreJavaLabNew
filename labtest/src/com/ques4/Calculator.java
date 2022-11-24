/*
 program : TO use 5 String
 @author : levis aljero kiro
 Date    : 17 nov 2022
 */
package com.ques4;
import java.util.*;//declaring packages
public class Calculator {
private double a,b,sum,subs,multi,div;//declaring variables
  
  void get()//get method
  {  
	  try //
	  {
		  Scanner sc = new Scanner(System.in);//creating scanner object
		  System.out.println("Enter two numbers");
		  a = sc.nextInt();//creating variables
		  b = sc.nextInt();//creating variables
		  sum = a + b;//operation to perform sum
		  subs = a - b;//operation to perform substraction
		  multi = a * b;//operation to perform multiplcation
		  div = a / b;//operation to perform division
		  System.out.println("sum of two no. : "+sum);//to print sum
		  System.out.println("substraction of two no. : "+subs);//to print substraction
		  System.out.println("multiplication of two no. : "+multi);//to print multiplication
		  System.out.println("division of two no. : "+div);//to print division
		  sc.close();
	  }
	  
	  catch( ArithmeticException | InputMismatchException e)
	  {
		  System.out.println(e.getMessage());
	  }
	 
  }//end of method
  
  /////////////////////////////////////////////////////////////////////////////
  
  public static void main (String args[])
  {
	  Calculator i = new Calculator();//creating calculator object
	  i.get();
  }
  
	  
}