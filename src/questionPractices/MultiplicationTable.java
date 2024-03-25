package questionPractices;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		int n, c;
		
		System.out.println("Enter the number to find the multiplication table: ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		for(c=1;c<=10;c++) {
			System.out.println(n+"*"+c+"="+(n*c));
		}
		


	}

}
