package homayoon;

public class PalindromString {

	public static void main(String[] args) {
		String word = "1234543212";
		System.out.println(isPalindromeString(word));
		System.out.println(isPalindromeString2(word));
		System.out.println(isPalindromeString3(word));

	}
	public static boolean isPalindromeString(String str) {
		StringBuilder sb = new StringBuilder(str);
		
		return str.equals(String.valueOf(sb.reverse()));
	}
	
	public static boolean isPalindromeString2(String word) {
		String rev = "";
		for (int i = word.length()-1; i >=0; i--) {
			rev += word.charAt(i);
		}
		return word.equals(rev);
	}
	public static boolean isPalindromeString3(String str) {
				
		for (int fwd = 0, bck = str.length()-1; fwd < str.length(); fwd++, bck--) {
			if(fwd==bck) {
				return true;
			}
			if(str.charAt(fwd)==str.charAt(bck)) {
				continue;
			}
			return false;
			
		}
		
		
		return false;
	}

}
