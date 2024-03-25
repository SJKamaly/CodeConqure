package homayoon;

import java.util.Stack;

public class Practice2 {

	public static void main(String[] args) {
		
		String simple1 = "()()((()))";
		System.out.println(isBalanced(simple1));
		

	}
	public static boolean isBalanced(String str) {
		
		Stack<Character> chars = new Stack<Character>();
		for(Character c: str.toCharArray()) {
			if(c=='(') {
				chars.add(c);
			}else {
			   if(chars.size()<1) {
				   return false;
			   }
			   if(c==')' && chars.pop() !='(') {
				   return false;
			   }
			}
		}
		
		
		return chars.size()==0;
	}

}
