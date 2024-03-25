package code;

import java.util.Arrays;

public class Anagaram {

	public static void main(String[] args) {

		String source = "abc", target = "cba";
		System.out.println(isAnagram(source, target));

	}

	public static boolean isAnagram(String source, String target) {

		if (source == null || target == null) {
			return false;
		}

		if (source.length() != target.length()) {
			return false;
		}
		char[] sourceInput = source.toCharArray();
		char[] targetInput = target.toCharArray();

		Arrays.sort(sourceInput);
		Arrays.sort(targetInput);

		return Arrays.equals(sourceInput, targetInput);
	}

}
