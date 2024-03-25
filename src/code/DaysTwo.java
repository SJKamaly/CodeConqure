package code;

public class DaysTwo {

	public static void main(String[] args) {
		
		//Create a function to reverse it 
		
		String text = "TekSchool is located in california";
		//System.out.println(reverseString(text));
	     //System.out.println(revereseWithStringBuilder(text));
	     System.out.println(reverseEachWord(text));
	
	}
	
	public static String reverseEachWord(String test) {
		String reversed = "";
		
		String [] temp = test.split(" ");
		for(int i = 0; i<temp.length;i++) {
			reversed+=reverseString(temp[i]);
			if(i+1<temp.length) {
				reversed += " ";
			}
		}
		
		return reversed;
		
	}
	
	public static String reverseString(String str) {
		
		String reverse = "";
		
		for(int i = str.length()-1;i>=0;i--) {
			reverse += str.charAt(i);
		}
		
		return reverse;
		
		
	}
	public static String revereseWithStringBuilder(String txt) {
		String reverse="";
		StringBuilder sb = new StringBuilder(txt);
		sb.reverse();
		
		return String.valueOf(sb);
	}
	

}
