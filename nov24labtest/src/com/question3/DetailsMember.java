package com.question3;
import java.util.*;


class Member {
    // Data members
    private String name;
    private int age;
    private long phoneNum;
    private String address;
    private double salary;
 
    // Getters and setters
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public int getAge() {
        return age;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
 
    public long getPhoneNum() {
        return phoneNum;
    }
 
    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }
 
    public String getAddress() {
        return address;
    }
 
    public void setAddress(String address) {
        this.address = address;
    }
 
    public double getSalary() {
        return salary;
    }
 
    public void setSalary(double salary) {
        this.salary = salary;
    }
 
    // Prints salary
    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}
 
// Employee class
class Employee extends Member {
    private String specialization;
 
    public String getSpecialization() {
        return specialization;
    }
 
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
 
// Manager class
class Manager extends Member {
    private String department;
 
    public String getDepartment() {
        return department;
    }
 
    public void setDepartment(String department) {
        this.department = department;
    }
}
 
// Main class
public class DetailsMember {
    public static void main(String args[]) {
        // Creating objects
        Employee e = new Employee();
        Manager m = new Manager();
 
        // Setting values
        e.setName("levis");
        e.setAge(24);
        e.setPhoneNum(820769545);
        e.setAddress("sector 3 delhi");
        e.setSalary(50000);
        e.setSpecialization("Software Engineer");
 
        m.setName("tchalamet");
        m.setAge(28);
        m.setPhoneNum(985620010);
        m.setAddress("221B Baker Street jharkhand");
        m.setSalary(75000);
        m.setDepartment("Sales");
 
        // Printing values
        System.out.println("Employee:");
        System.out.println("Name: " + e.getName());
        System.out.println("Age: " + e.getAge());
        System.out.println("Phone: " + e.getPhoneNum());
        System.out.println("Address: " + e.getAddress());
        e.printSalary();
        System.out.println("Specialization: " + e.getSpecialization());
 
        System.out.println("\nManager:");
        System.out.println("Name: " + m.getName());
        System.out.println("Age: " + m.getAge());
        System.out.println("Phone: " + m.getPhoneNum());
        System.out.println("Address: " + m.getAddress());
        m.printSalary();
        System.out.println("Department: " + m.getDepartment());
    }
}