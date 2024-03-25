package pavan;

import java.util.Random;

public class RandomNumAndStrings {

	public static void main(String[] args) {
		
		//Appraoch 1 - Random 
//		Random rand =new Random();
//		int randomNum = rand.nextInt(9999);
//		System.out.println(randomNum);
		
		
		//Approach 2 - Math 
		
		//System.out.println(Math.random());
		
		int rand = (int) (Math.random()*100);
		System.out.println(rand);
		
		
		

	}

}
