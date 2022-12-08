package com.question2;
import java.util.*;
public class Student {
    int id;
    String name;
    
    //constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
 
    public static void main(String[] args) {
        //student list
        Student[] studentList = { new Student(1, "John"), 
                                  new Student(2, "Sara"), 
                                  new Student(3, "Adam"), 
                                  new Student(4, "Paul"), 
                                  new Student(5, "Alex") };
        Scanner sc = new Scanner(System.in);
        System.out.println("input student id");
        int idToFind=sc.nextInt();
        if(idToFind>5)
        {
        	System.out.println("no details in this number");
        }
        sc.close();
        for (Student student : studentList) {
            if (student.id == idToFind) {
                System.out.println("Student Name: " + student.name);
            }
        }
    }
}
