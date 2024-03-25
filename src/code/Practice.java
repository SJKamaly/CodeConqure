package code;

public class Practice {

	public static void main(String[] args) {
		
		String str = "TekSchool is located in California";
		System.out.println(reverseString(str));
		System.out.println(revEachWord(str));
		

	}
	public static String reverseString(String input) {
		String reversed = "";
		for(int i = input.length()-1;i>=0;i--) {
			reversed+=input.charAt(i);
		}
		return reversed;
		
	}
	public static String revEachWord(String txt) {
		String rev = "";
		String [] temp=txt.split(" ");
		for(int i = 0; i<temp.length;i++) {
			rev+=reverseString(temp[i]);
			if(i+1<temp.length) {
				rev+=" ";
			}
		}
		return rev;
	}
	

}
