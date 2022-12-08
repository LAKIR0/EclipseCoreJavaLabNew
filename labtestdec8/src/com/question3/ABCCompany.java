package com.question3;

public class ABCCompany {
	String name;
	int currentSalary, numberOfYears;
	
	public ABCCompany(String name, int currentSalary, int numberOfYears) {
		this.name = name;
		this.currentSalary = currentSalary;
		this.numberOfYears = numberOfYears;
	}
	
	public int getIncrementedSalary() {
		if (numberOfYears > 3)
			return (int)(currentSalary + 0.1 * currentSalary);
		else
			return currentSalary;
	}
	
	public static void main(String[] args) {
		ABCCompany emp1 = new ABCCompany("John", 5000, 4);
		System.out.println("Incremented salary of " + emp1.name + " is " + emp1.getIncrementedSalary());
		
		ABCCompany emp2 = new ABCCompany("Smith", 4000, 2);
		System.out.println("Incremented salary of " + emp2.name + " is " + emp2.getIncrementedSalary());
	}
}
