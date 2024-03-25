package code;

public class Mian {

	public static void main(String[] args) {
		
		String input = "This is a simpale text for text this comment";
		System.out.println(hasDuplicateWord(input));
		

	}
	public static boolean hasDuplicateWord(String str) {
		String [] words = str.split(" ");
		for(int i = 0; i<words.length;i++) {
			for(int j = i+1; j<words.length;j++) {
				if(words[i].equals(words[j])) {
					return true;
				}
			}
		
		}
		return false;
	}

}
