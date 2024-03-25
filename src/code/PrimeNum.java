package code;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {

		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;

		for (int j = 1; j <= num; j++) {
			if (num % j == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println(num + " number is prime ");
		} else {
			System.out.println(num + " number is NOT prime!");
		}

	}

}
