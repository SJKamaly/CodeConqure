package code;

public class ReverseString {

	public static void main(String[] args) {
		
		String txt = "Going to reverse this string";
		System.out.println("Reverse String: "+ revString(txt));
		System.out.println("Using StringBuilder: "+ revWithStringBuilder(txt));
		System.out.println("Reverse each words: "+ revEachWord(txt));
		

	}
	public static String revEachWord(String test) {
		String rev = "";
		
		String [] temp = test.split(" ");
		for(int i = 0;i<temp.length;i++) {
			rev+=revString(temp[i]);
			if(i+1<temp.length) {
				rev+=" ";
			}
		}
		
		
		return rev;
	}
	public static String revString (String str) {
		String reverse = "";
		for(int i = str.length()-1;i>=0;i--) {
			reverse+= str.charAt(i);
		}
		return reverse;
	}
	public static String revWithStringBuilder (String input) {
		StringBuilder sb = new StringBuilder(input);
		sb.reverse();
		
		return String.valueOf(sb);
	}

}
