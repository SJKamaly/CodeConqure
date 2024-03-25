package pavan;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {

	public static void main(String[] args) {
		
		//Approach 1 
		/*int arr []= {10,40,30,60,15};
				
		System.out.println("Before sorting: "+ Arrays.toString(arr));
		Arrays.parallelSort(arr);
		System.out.println("After sorting: "+ Arrays.toString(arr));
		*/
		
		/*int arr []= {10,40,30,60,15};
		System.out.println("Array elements before sorting: "+ Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Array elements after sorting: "+ Arrays.toString(arr));
        */
		
		Integer arr []= {10,40,30,60,15};
		System.out.println("Array elements before sorting: "+ Arrays.toString(arr));
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println("Array elements after sorting: "+ Arrays.toString(arr));
	}

}
