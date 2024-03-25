package homayoon;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountInstanceOfWords {

	public static void main(String[] args) {

		String[] data = { "test", "take", "nice", "nice", "test", "test", "nice" };
		printDuplicatesInArray(data);

	}

	public static void printDuplicatesInArray(String[] data) {

		Map<String, Integer> temp = new HashMap<String, Integer>();// this mat is to count each word
		Map<String, Integer> duplicates = new HashMap<String, Integer>();// this map is to separate the duplicates
		for (int i = 0; i < data.length; i++) {
			if (temp.containsKey(data[i])) {
				temp.put(data[i], temp.get(data[i]) + 1);
			} else {
				temp.put(data[i], 1);
			}
		}
		for (String key : temp.keySet()) {// goes through he first map and the one that have count of more than one
			if (temp.get(key) > 1) {
				duplicates.put(key, temp.get(key));
			}
		}
		System.out.println(duplicates);
	}

}
