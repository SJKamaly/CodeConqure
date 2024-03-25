package code;

import java.util.Stack;

public class CheckBalanced {

	public static void main(String[] args) {
		
		//check if the parenthesis are balanced or not
		
		String bal = "((()))";
		System.out.println(isBalanced(bal));

	}
	public static boolean isBalanced(String str) {
		
		if(str.isEmpty()) {
			return false;
		}
		if(str.charAt(0)==')') {
			return false;
		}
		Stack<Character> chars = new Stack<Character>();
		chars.add(str.charAt(0));
		for(int i=1;i<str.length();i++){
			if(str.charAt(i)==')' && chars.size()>0) {
				chars.pop();
			}else {
				chars.add(str.charAt(i));
			}
			
		}
		return chars.size()==0;
	}

}
