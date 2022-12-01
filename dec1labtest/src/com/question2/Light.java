package com.question2;

public class Light {
	 
		  
	    // States of a light 
	    private static final int RED = 1; 
	    private static final int YELLOW = 2; 
	    private static final int GREEN = 3; 
	  
	    // Initializing with Red light 
	    private int currentState = RED; 
	  
	    public void start() 
	    { 
	        while (true) { 
	            switch (currentState) { 
	            case RED: 
	                System.out.println("Red light is ON for 3 seconds"); 
	                try { 
	                    Thread.sleep(3000); 
	                } 
	                catch (InterruptedException ie) { 
	                    ie.printStackTrace(); 
	                } 
	                // Change to yellow light 
	                currentState = YELLOW; 
	                break; 
	            case YELLOW: 
	                System.out.println("Yellow light is ON for 2 seconds"); 
	                try { 
	                    Thread.sleep(2000); 
	                } 
	                catch (InterruptedException ie) { 
	                    ie.printStackTrace(); 
	                } 
	                // Change to green light 
	                currentState = GREEN; 
	                break; 
	            case GREEN: 
	                System.out.println("Green light is ON for 5 seconds"); 
	                try { 
	                    Thread.sleep(5000); 
	                } 
	                catch (InterruptedException ie) { 
	                    ie.printStackTrace(); 
	                } 
	                // Change to red light 
	                currentState = RED; 
	                break; 
	            default: 
	                break; 
	            } 
	        } 
	    } 

public static void main(String[] args) 
{ 
    Light l = new Light(); 
    l.start(); 
} 
} 
