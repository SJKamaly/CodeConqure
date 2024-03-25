package homayoon;


public class Practice3 {

	public static void main(String[] args) {
		
		int [] myNum = {4,5,7,3,9,8,13,1};
		System.out.println("Largest: "+ findLagestValue(myNum));
		System.out.println("SecondLargest: "+ findSecondLargestValue(myNum));
		System.out.println("Smallest: "+ findSmallestValue(myNum));
		System.out.println("Seoncd Smallest: "+ findSecondSmallestValue(myNum));
		System.out.println("Sum: "+ findSumOfValue(myNum));
		System.out.println("Average: "+ findAverageOfValue(myNum));
		

	}
	public static int findLagestValue(int [] num) {
		int largest = num[0];
		for (int i = 0; i < num.length; i++) {
			if(num[i]>largest) {
				largest=num[i];
			}
		}
		return largest;
	}
	public static int findSecondLargestValue(int []num) {
		int secondLargest = num[0];
		int largest = findLagestValue(num);
		for (int i = 0; i < num.length; i++) {
			if(num[i]<largest && num[i]>secondLargest) {
				secondLargest = num[i];
			}
		}
		return secondLargest;
	}
	public static int findSmallestValue(int [] num) {
		int smallest = num[0];
		for (int i = 0; i < num.length; i++) {
			if(num[i]<smallest) {
				smallest=num[i];
			}
		}
		return smallest;
	}
	public static int findSecondSmallestValue(int []num) {
		int secondSamllest = num[0];
		int smallest = findSmallestValue(num);
		for (int i = 0; i < num.length; i++) {
			if(num[i]>smallest && num[i]<secondSamllest) {
				secondSamllest = num[i];
			}
		}
		return secondSamllest;
	}
	public static int findSumOfValue(int []num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum+=num[i];
		}
		return sum;
	}
	public static double findAverageOfValue(int []num) {
		return (double)findSumOfValue(num)/num.length;
	}

}
