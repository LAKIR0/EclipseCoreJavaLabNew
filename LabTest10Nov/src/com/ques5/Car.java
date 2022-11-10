//import package
package com.ques5;

//declaring a class
public class Car {
	
	//enum
	enum car{i20(2010), polo(2016), salavia(2022), thar(2020);
		int i;
		car(int i)
		{
			this.i= i;
		}};
	
		//main started
		public static void main(String[] args)
	{
		//for loop started
		for(car c:car.values())
		{
			System.out.println(c+"-"+c.i);
		}//end of for loop
	}//end of main
}//end of class
