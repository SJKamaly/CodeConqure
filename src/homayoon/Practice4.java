package homayoon;

public class Practice4 {

	public static void main(String[] args) {
		
		printFizzBuss(1, 30);

	}
	public static void printFizzBuss(int start, int end) {
		
		for (int i = start; i <= end; i++) {
			if(i % 3 ==0  & i % 5 == 0) {
				System.out.println("FizzBuzz");
			}else if(i % 3 == 0) {
				System.out.println("Fizz");
			}else if(i%5==0) {
				System.out.println("Buzz");
			}else {
				System.out.println(i);
			}
		}
	}

}
