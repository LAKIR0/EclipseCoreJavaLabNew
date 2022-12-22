package question4;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to check palindrome");
		int num = sc.nextInt();
		int temp;
		int reversed = 0;
		temp = num;
		while (num > 0) {
			reversed = reversed * 10 + (num % 10);
			num = num / 10;
		}
		if (reversed == temp) {
			System.out.println(temp + " is palindrome");
		} else {
			System.out.println(temp + " is not palindrome");
		}
		sc.close();
	}
}
