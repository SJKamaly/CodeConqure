package pavan;

public class SumOfArrays {

	public static void main(String[] args) {
		
		int[] arr = {2,5,7,9,6};
		int sum = 0;
//		for (int i = 0; i < arr.length; i++) {
//			sum+=arr[i];
//		}
//		System.out.println(sum);
		
		for(int a:arr) {
			sum=sum+a;
		}
		System.out.println(sum);

	}

}
