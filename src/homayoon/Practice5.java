package homayoon;

public class Practice5 {

	public static void main(String[] args) {
		
		System.out.println(sumOfValues(10, 2, 3));
		System.out.println(sumOfValues(5, 10, 4));
		System.out.println(sumOfValues(3, 2, 10));
		System.out.println(sumOfValues(1, 2, 3));
		

	}
	public static int sumOfValues(int a, int b, int c) {
		
		if(a == 10) {
			return 0;
		}else if(b==10) {
			return a;
		}else if (c==10) {
			return a + b;
		}else {
			return a + b + c;
		}
	}

}
