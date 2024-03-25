package questionPractices;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		int x;
		System.out.println("Enter an integer to find even or odd: ");
		Scanner sc = new Scanner (System.in);
		x=sc.nextInt();
		
		if(x %2==0) {
			System.out.println("Number enter is even: ");
		}else {
			System.out.println("Number enter is odd: ");
		}

	}

}
