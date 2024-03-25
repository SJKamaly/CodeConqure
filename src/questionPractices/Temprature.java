package questionPractices;

import java.util.Scanner;

public class Temprature {

	public static void main(String[] args) {
		
		float temprature;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter temprature in Fahranhiet");
		temprature=sc.nextFloat();
		
		temprature = ((temprature -32)*5)/9;
		System.out.println("Temprature in Celsius is: "+ temprature );

	}

}
