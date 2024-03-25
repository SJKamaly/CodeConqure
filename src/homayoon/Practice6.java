package homayoon;

import java.util.HashMap;
import java.util.Map;

public class Practice6 {

	public static void main(String[] args) {

		System.out.println(countOccuranceOfChars("This method count occurance of chars"));

	}

	public static Map<Character, Integer> countOccuranceOfChars(String str) {

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
