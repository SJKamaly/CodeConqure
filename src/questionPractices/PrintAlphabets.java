package questionPractices;

import java.util.Scanner;

public class PrintAlphabets {

	public static void main(String[] args) {
		
		char ch;
		
		for(ch='a';ch<='z';ch++) {
			System.out.print(ch+" , ");
		}
		
		int primes [] = {2,5,4,49,55,2,15,66,48,78};
		
		for(int t:primes) {
			System.out.print(t);
		}
		
		String languages[] = { "C", "C++", "Java", "Python", "Ruby"};
		for(String lan:languages) {
			System.out.print(lan+ " , ");
		}
		
		int n,c;
		System.out.println("Enter number to dispaly its multiplication table");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(c=1;c<=10;c++) {
			System.out.println(n+"*"+c+"="+(n*c));
		}
	
	}

}
