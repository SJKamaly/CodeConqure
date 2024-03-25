package pavan;

import java.util.Scanner;

public class ReverseNums {

	public static void main(String[] args) {
		
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		/*int rev = 0;
		while(num>0) {
			rev=rev*10 +num%10;
			num=num/10;
		}
		System.out.println("Reverse number: "+ rev);
	*/
		
		StringBuilder sb = new StringBuilder(String.valueOf(num));
		StringBuilder rev=sb.reverse();
		System.out.println(rev);
	}

}
