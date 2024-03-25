package homayoon;

import java.util.HashMap;
import java.util.Map;

public class Practice7 {

	public static void main(String[] args) {
		String[] data = { "test", "take", "nice", "nice", "nice", "nice", "nice", "test", "test", "nice" };
		printWords(data);
	}

	public static void printWords(String[] data) {
		Map<String, Integer> temp = new HashMap<String, Integer>();

		for (int i = 0; i < data.length; i++) {
			if (temp.containsKey(data[i])) {
				temp.put(data[i], temp.get(data[i]) + 1);
			} else {
				temp.put(data[i], 1);
			}

		}
		System.out.println(temp);
	}

}
