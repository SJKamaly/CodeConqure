package homayoon;

public class CombinationOf3Nums {

	public static void main(String[] args) {
		
		//Write a function that print all the 3 digits combination of number 
		//between 1 and 3
		//1, ,1 ,1
		//1, 1, 2
		//1, 1, 3
		//5, 5, 5
		
		printNums(1, 5);

	}
	public static void printNums(int start, int end ) {
		
		for(int i = start;i<=end;i++) {
			for(int j = start;j<=end;j++) {
				for(int h = start;h<=end;h++) {
					System.out.println(i+" ," + j +" , "+ h);
					
				}
			}
		}
	}

}
