//Program: Matrix Multiplication

//import package
package com.ques4;

//declaring a class
public class Matrix
{  
	//main started
	public static void main(String args[]){  
		//creating two matrices    
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};    
		int b[][]={{1,2,3},{4,5,6},{7,8,9}};    
    
		//creating another matrix to store the multiplication of two matrices    
		int c[][]=new int[3][3];  //3 rows and 3 columns  
    
		//multiplying and printing multiplication of 2 matrices    
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
				c[i][j]=0;      
				for(int k=0;k<3;k++)      
				{      
					c[i][j]+=a[i][k]*b[k][j];      
				}//end of k loop  
			System.out.print(c[i][j]+" ");  //printing matrix element  
			}//end of j loop  
		System.out.println();//new line    
		}//enf of for loop    
	}//end of main
}//end of class
