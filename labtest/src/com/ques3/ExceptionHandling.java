package com.ques3;
import java.util.Scanner;
public class ExceptionHandling {

		//method to create menu
				static void menu()
				{
					System.out.println("1. Play");
					System.out.println("2. Exit");
					System.out.println("3. Score");
					System.out.println("Enter your choice: ");
				}
				
				public static void main(String args[])
				{
				menu();
				try 
					{
					Scanner sc = new Scanner(System.in);
					int ch = sc.nextInt();
					System.out.println(ch);
					sc.close();
					}
				catch(ArithmeticException e)
				{
					System.out.println(e.getMessage());
				}
				}
}