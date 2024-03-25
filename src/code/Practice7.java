package code;

public class Practice7 {

	public static void main(String[] args) {
		
		int []arr = {2,3,4,5,6,7,8,9,10};
		evenNums(arr);

	}
	public static void evenNums(int [] arr) {
		
		for (int i = 2; i < arr.length; i++) {
			if(i % 2 == 0) {
				System.out.println(i + " is even nubmer ");
			}else {
				System.out.println(i + " is odd number");
			}
		}
		
		
		
	}

}
