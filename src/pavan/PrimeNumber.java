package pavan;

public class PrimeNumber {

	public static void main(String[] args) {
		//natural number > 1
		//which has only 2 factors 1 and itself 
		
		//19 => 1 and 19=> prime number 

	
	
	int num = 10;
	int count = 0;
	
	if(num>1) {
		for (int i = 1; i <=num; i++) {
			if(num%i==0) 
				count++;
			
		}
		if(count==2) {
			System.out.println("Prime number");
		}else {
			System.out.println("Not prime number");
		}
	}else {
		System.out.println("Not prime number");
	}

}
}