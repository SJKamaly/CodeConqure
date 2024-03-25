package questionPractices;

public class SwapNumbers {

	public static void main(String[] args) {
		
		//using a third variable 
//		int x,y, temp;
//		x=10;
//		y=20;
//		System.out.println(x +" "+ y);
//		
//		temp = x;
//		x=y;
//		y=temp;
//		System.out.println(x+" "+y);
		
		//swapping without third variable 
		
		int x, y;
		x=10;
		y=20;
		System.out.println("Before changin the values: "+ x +" "+ y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("After changin the values: "+ x +" "+ y);
		
		

	}

}
