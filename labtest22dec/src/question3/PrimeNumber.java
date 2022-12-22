package question3;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input number to check prime or not.");
		int num = sc.nextInt();
		boolean flag = false;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not prime number.");
		sc.close();
	}
}
