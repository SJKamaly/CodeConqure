package pavan;

/**
 * @author kamal
 *
 */
public class MissingNumInArray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,7}; 
		int sum1 = 0;
		for (int i = 0; i < arr.length; i++) {
			sum1 += arr[i];
		}
		System.out.println("Some of elements in array: "+ sum1);
		
		int sum2 = 0;
		for (int i = 1; i <=7; i++) {
			sum2+=i;
		}
		System.out.println("Missing number is "+ (sum2-sum1));

	}

}
