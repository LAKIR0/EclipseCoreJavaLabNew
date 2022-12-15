package question1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
 
public class ProductDetails {
    public static void main(String[] args) {
        String productId;
        String productName;
        double productPrice;
        
        Scanner scanner = new Scanner(System.in);
 
        // Ask for the product details
        System.out.println("Please enter the product ID:");
        productId = scanner.nextLine();
        System.out.println("Please enter the product name:");
        productName = scanner.nextLine();
        System.out.println("Please enter the product price:");
        productPrice = scanner.nextDouble();
        scanner.close();
 
        // Write the details to the file
        try {
            FileWriter writer = new FileWriter("D:\\ProductDetails.txt", true);
            writer.write(productId + ", " + productName + ", " + productPrice + "\n");
            writer.close();
            System.out.println("Product details added successfully!");
        } 
        catch (IOException e) {
            System.err.println("Error writing to the file!");
            e.printStackTrace();
        }
    }
}