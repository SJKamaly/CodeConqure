package code;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		String pal = "daddd";
		isPalindrome(pal);
		
		
	}
	public static String isPalindrome(String str) {
	String rev = "";
						
		for(int i = str.length()-1;i>=0;i--){
			rev+= str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println(rev+" "+ " is palindrome");
		}else {
			System.out.println(rev +" "+ " not palindrome");
	}
		return rev;
	}

}
