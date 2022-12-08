package com.question1;


import java.util.*;
import java.util.Scanner;
class Contact
{
    private String name;
    private int contactNumber;
    private String email;

    public Contact(String name,int contactNumber,String email)
    {
        this.name=name;
        this.contactNumber=contactNumber;
        this.email=email;
    }

    public String getName() {
        return name;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Name: "+name+"\nContact Number: "+contactNumber+"\nEmail: "+email;
    }
}

public class ContactBook
{
    public static void main(String[] args)
    {
        Set<Contact> contactSet=new HashSet<Contact>();
        boolean flag=true;

        while(flag)
        {
        	Scanner sc = new Scanner(System.in);
            System.out.println("Enter the contact Details");
            System.out.println("Name: ");
            String name= sc.next();
            System.out.println("Contact Number: ");
            int contactNumber=sc.nextInt();
            System.out.println("Email: ");
            String email=sc.next();
            Contact contact=new Contact(name,contactNumber,email);

            if(contactSet.add(contact))
            {
                System.out.println("Contact added successfully");
            }
            else
            {
                System.out.println("Contact already exists");
            }
            System.out.println("Do you want to enter more contacts? (Y/N)");
            String choice=sc.next();
            
            if(choice.equalsIgnoreCase("Y"))
            {
                flag=true;
            }
            else
            {
                flag=false;
            }
            sc.close();
        }

        System.out.println("Anna's Contact Book");
        for(Contact contact : contactSet)
        {
            System.out.println(contact);
            System.out.println("-------------------------------");
            
        }
    }
}