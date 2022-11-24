package com.question1;
import java.util.*;


interface Student{
	void studentDetails();
	
}
interface Employee{
	void employeeDetails();
	
	
}
 class University implements Student,Employee {
		
		public void employeeDetails() {
			Scanner sc=new Scanner(System.in);
		   System.out.println("enter the employee name");
		   String name=sc.next();
		   System.out.println("enter the employee department");
		   String department=sc.next();
		   System.out.println("enter the employee id");
		   int eId=sc.nextInt();
		   System.out.println("enter the employee salary");
		   double Salary=sc.nextDouble();
		   System.out.println("employee name: "+name);
		   System.out.println("employee department: "+department);
		   System.out.println("employee id: "+eId);
		   System.out.println("employee salary: "+Salary);
		   sc.close();
		}

		
		public void studentDetails() {
			Scanner sc=new Scanner(System.in);
			   System.out.println("enter the student name");
			   String name=sc.next();
			   System.out.println("enter the Student course");
			   String course=sc.next();
			   System.out.println("enter the Student id");
			   int sId=sc.nextInt();
			   System.out.println("enter the student age");
			   int age=sc.nextInt();
			   System.out.println("Student name: "+name);
			   System.out.println("Student course:"+course);
			   System.out.println("Student id: "+sId);
			   System.out.println("Student age: "+age);
			   sc.close();
			
		}
	public static void main(String[] args) {
		University un=new University();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter s for student and e for Employee");
        char ch=sc.next().charAt(0);
        if(ch=='s') {
        	un.studentDetails();
        }
        else
        	un.employeeDetails();
        sc.close();
	}
}