package homayoon;

import java.util.Stack;

public class IsPrenthesisBalanced {

	public static void main(String[] args) {
		
		String simple1 = "(((<{[]}>)))";
		System.out.println("Simple1: " + isBalanced(simple1));
		

	}
	public static boolean isBalanced (String str) {
		
		//validate - check to see if the input is only prenthesis 
		
		//Stack of Characters
		
		Stack<Character> chars = new Stack<Character>();
		
		for(Character c: str.toCharArray()) {
			if(c=='(' || c=='<' || c=='{' || c=='[') {
				chars.add(c);
			}else { 
				if(chars.size()<1) {
					return false;
				}
				if(c==')' && chars.pop()!='(') {
					return false;
				}
				if(c=='}' && chars.pop()!='{') {
					return false;
				}
				if(c==']' && chars.pop()!='[') {
					return false;
				}
				if(c=='>' && chars.pop()!='<') {
					return false;
				}
			}
		}
		
		
		
		
		
		return chars.size()==0;
	}

}
