package homayoon;

public class LargestNumber {

	public static void main(String[] args) {

		int[] num = { 5, 22, 444, 1, 45, 55, 77, 99 };
		System.out.println("Largest: " + findLargestValue(num));
		System.out.println("Second Largest: "+ secondLargestNum(num));
		System.out.println("Smallest: " + findSmallestValue(num));
		System.out.println("Second Smallest: " + secondSmallestValue(num));
		System.out.println("Sum: "+ findSumOfValue(num));
		System.out.println("Average: "+ findAverageOfValue(num));
		
		

	}
	public static int secondLargestNum(int [] num) {
		int secondLargest = num[0];
		int largest = findLargestValue(num);
		for (int i = 0; i < num.length; i++) {
			if (num[i]<largest && num[i]>secondLargest) {
				secondLargest = num[i];
			}
			
		}
		return secondLargest;
	}
	
	public static int secondSmallestValue(int [] num) {
		int secondSmallest = Integer.MAX_VALUE;
		int smallest = findSmallestValue(num);
		for (int i = 0; i < num.length; i++) {
			if(num[i]> smallest  && num[i]<secondSmallest) {
				secondSmallest = num[i];
			}
		}
		
		return secondSmallest;
	}
	
	public static double findAverageOfValue(int [] num) {
		return (double)findSumOfValue(num) / num.length;
	}
	
	public static int findSumOfValue(int [] num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		return sum;
		
	}

	public static int findSmallestValue(int[] num) {
		int smallest = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] < smallest) {
				smallest = num[i];
			}
		}

		return smallest;

	}

	public static int findLargestValue(int[] num) {
		int largest = num[0];

		for (int i = 0; i < num.length; i++) {
			if (num[i] > largest) {
				largest = num[i];
			}
		}

		return largest;

	}

}
