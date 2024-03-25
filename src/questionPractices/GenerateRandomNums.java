package questionPractices;

import java.util.Random;

public class GenerateRandomNums {

	public static void main(String[] args) {
		
		int c;
		Random rand = new Random();
		
		for(c =1;c<=10000;c++) {
			System.out.println(rand.nextInt(10000));
		}
		

	}

}
