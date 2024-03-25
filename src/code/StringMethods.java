package code;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		
		String s = "  Welcome   ";
		System.out.println(s.length());
		
		System.out.println(s.concat(" Java"));
		System.out.println(s.replace('e', 'x'));
		System.out.println(s.trim());
		
		s = "abc@gmail.com";
		String [] ar = s.split("@");
		System.out.println(Arrays.toString(ar));
		System.out.println(ar[0]);
		

	}

}
