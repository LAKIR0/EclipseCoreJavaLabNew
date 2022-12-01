package com.question3;

public class TallBridgeSimulation {
	public static void main(String[] args) {
	    // Create five threads, one for each vehicle
	    Thread[] vehicles = new Thread[5];

	    // Create and start the threads
	    for (int i = 0; i < vehicles.length; i++) {
	        vehicles[i] = new Thread(new VehicleThread(i + 1));
	        vehicles[i].start();
	    }
	}


	public static class VehicleThread implements Runnable {
	    private int vehicleNumber;

	    public VehicleThread(int vehicleNumber) {
	        this.vehicleNumber = vehicleNumber;
	    }

	    @Override
	    public void run() {
	        // Start the journey
	        System.out.println("Vehicle " + vehicleNumber + " has started the journey.");

	        // Arrive at the toll
	        System.out.println("Vehicle " + vehicleNumber + " has arrived at the toll.");

	        // Enter the tollbooth
	        System.out.println("Vehicle " + vehicleNumber + " is entering the tollbooth.");

	        // Exit the tollbooth
	        System.out.println("Vehicle " + vehicleNumber + " is exiting the tollbooth.");

	        // Cross the bridge
	        System.out.println("Vehicle " + vehicleNumber + " is crossing the bridge.");
	    }
	}

}
