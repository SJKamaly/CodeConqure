package homayoon;

import java.util.HashMap;
import java.util.Map;

public class CountChars {

	public static void main(String[] args) {
		String str = "This is a test of test This is a test of test";
		System.out.println("Count of Chars: " + countChars(str));
		System.out.println("Count of Words: " + CountWords(str));

	}

	public static Map<String, Integer> CountWords(String str) {
		Map<String, Integer> words = new HashMap<String, Integer>();
		for (String w : str.split(" ")) {
			if (words.containsKey(w)) {
				words.put(w, words.get(w) + 1);
			} else {
				words.put(w, 1);
			}
		}
		return words;
	}

	public static Map<Character, Integer> countChars(String str) {
		Map<Character, Integer> chars = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (chars.containsKey(str.charAt(i))) {
				chars.put(str.charAt(i), chars.get(str.charAt(i)) + 1);
			} else {
				chars.put(str.charAt(i), 1);
			}
		}
		return chars;
	}

}
