package pavan;

public class LinearSearch {

	public static void main(String[] args) {
		
		int arr []= {10,40,30,60,15};
		int searchElm = 50;
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==searchElm) {
				System.out.println("Element found at index: "+ i);
				flag=true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("Element not found");
		}
		

	}

}
